package com.zsp.bloggardensystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsp.bloggardensystem.dto.request.article.AddReadRequest;
import com.zsp.bloggardensystem.dto.request.article.ArticleListRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleListResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleResponse;
import com.zsp.bloggardensystem.entity.ArticleEntity;
import com.zsp.bloggardensystem.mapper.ArticleMapper;
import com.zsp.bloggardensystem.mapper.UserMapper;
import com.zsp.bloggardensystem.service.ArticleService;
import com.zsp.bloggardensystem.util.ImageProcessingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章业务实现
 **/

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private UserMapper userMapper;

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @Override
    public ArticleListResponse getArticleList(ArticleListRequest request) throws RuntimeException {
        String orderBy = request.getPageInfo().getOrderBy();
        int pageNum = request.getPageInfo().getPageNum();
        int pageSize = request.getPageInfo().getPageSize();
        if(orderBy == null){
            orderBy = "articleID desc";
        }

        if(request.getUserName() != null && !request.getUserName().isEmpty()){
            request.setUserName("%"+request.getUserName()+"%");
        }

        if(request.getArticleTitle() != null && !request.getArticleTitle().isEmpty()){
            request.setArticleTitle("%"+request.getArticleTitle()+"%");
        }

        PageHelper.startPage(pageNum, pageSize, orderBy);
        List<ArticleEntity> articleEntityList = articleMapper.articleEntityList(request.getUserID(),request.getUserName(),request.getArticleTitle());

        PageInfo<ArticleEntity> pi = new PageInfo<>(articleEntityList);
        ArticleListResponse response = new ArticleListResponse();
        response.setResult(pi.getList());
        response.setSuccess(true);

        com.zsp.bloggardensystem.entity.PageInfo pageInfo = new com.zsp.bloggardensystem.entity.PageInfo();

        pageInfo.setTotal((int) pi.getTotal());
        pageInfo.setPageNum(pi.getPageNum());
        pageInfo.setPageSize(pi.getPageSize());

        response.setPageInfo(pageInfo);
        return response;
    }

    @Override
    public BaseResponse addRead(AddReadRequest request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        int result = articleMapper.addArticleRead(request) + userMapper.addUserRead(request);
        if(result > 1){
            response.setSuccess(true);
        }
        return response;
    }

    @Override
    public ArticleResponse getArticle(int articleID) {
        ArticleResponse respons = new ArticleResponse();
        respons.setArticle(articleMapper.getArticle(articleID));
        respons.setSuccess(true);
        return respons;
    }

    @Override
    public BaseResponse updateArticle(ArticleEntity request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        int result = articleMapper.updateArticle(request);
        if(result > 0){
            response.setSuccess(true);
        }
        return response;
    }

    @Override
    public BaseResponse addArticle(ArticleEntity request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        int result = articleMapper.addArticle(request) + articleMapper.addContent(request);
        if(result > 0){
            userMapper.addUserIssue(request.getUserID(),1);
            response.setSuccess(true);
        }
        return response;
    }

    @Override
    public BaseResponse deleteArticle(int articleID,int userID) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        String pictureCatalog = articleMapper.getArticle(articleID).getPictureCatalog();
        int result = articleMapper.deleteArticle(articleID);
        userMapper.addUserIssue(userID,-1);
        if(result > 0){
            ImageProcessingUtil.deleteImg(pictureCatalog,accessKey,secretKey,bucket);
            response.setSuccess(true);
        }
        return response;
    }
}
