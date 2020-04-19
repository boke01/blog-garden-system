package com.zsp.bloggardensystem.service.impl;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.comment.CommentRespons;
import com.zsp.bloggardensystem.entity.CommentEntity;
import com.zsp.bloggardensystem.mapper.ArticleMapper;
import com.zsp.bloggardensystem.mapper.CommentMapper;
import com.zsp.bloggardensystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论相关业务实体
 **/

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public CommentRespons getComment(int articleID) throws RuntimeException {
        CommentRespons respons = new CommentRespons();
        respons.setResult(AssembleComment(commentMapper.getComment(articleID)));
        respons.setSuccess(true);
        return respons;
    }

    @Override
    public BaseResponse addComment(CommentEntity request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        int result = commentMapper.addComment(request);
        if(result > 0){
            response.setSuccess(true);
        }
        return response;
    }

    //可以优化
    private List<CommentEntity> AssembleComment(List<CommentEntity> comment){
        List<CommentEntity> result = null;

        result = comment.stream()
                .filter((CommentEntity c) -> c.getCommentSerialNumber() == 0)
                .collect(Collectors.toList());

        for(int i = 0; i< result.size();i++){
            comment.remove(result.get(i));
        }

        for(int i = 0; i< result.size();i++){
            Children(comment,result.get(i));
        }
        return result;
    }

    private void Children(List<CommentEntity> comment, CommentEntity children ){
        if(comment.size() != 0){
            List<CommentEntity> result = null;
            result = comment.stream()
                    .filter((CommentEntity c) -> c.getCommentSerialNumber() == children.getCommentID())
                    .collect(Collectors.toList());
            for(int i = 0; i< result.size();i++){
                comment.remove(result.get(i));
            }
            for(int i = 0; i< result.size();i++){
                Children(comment,result.get(i));
            }
            children.setChildren(result);
        }
    }

}
