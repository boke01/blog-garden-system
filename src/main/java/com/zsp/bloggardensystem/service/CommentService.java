package com.zsp.bloggardensystem.service;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.comment.CommentRespons;
import com.zsp.bloggardensystem.entity.CommentEntity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论相关业务接口
 **/
public interface CommentService {

    CommentRespons getComment(int articleID)throws RuntimeException;

    BaseResponse addComment(CommentEntity request)throws RuntimeException;
}
