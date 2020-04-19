package com.zsp.bloggardensystem.service;

import com.zsp.bloggardensystem.dto.request.article.AddReadRequest;
import com.zsp.bloggardensystem.dto.request.article.ArticleListRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleListResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleRespons;
import com.zsp.bloggardensystem.entity.ArticleEntity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章业务接口
 **/
public interface ArticleService {
    ArticleListResponse getArticleList(ArticleListRequest request) throws RuntimeException;

    BaseResponse addRead(AddReadRequest request)throws RuntimeException;

    ArticleRespons getArticle(int articleID)throws RuntimeException;

    BaseResponse updateArticle(ArticleEntity request)throws RuntimeException;

    BaseResponse addArticle(ArticleEntity request)throws RuntimeException;

    BaseResponse deleteArticle(int articleID, int userID)throws RuntimeException;
}
