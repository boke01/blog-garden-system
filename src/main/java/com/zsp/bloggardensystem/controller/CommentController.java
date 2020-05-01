package com.zsp.bloggardensystem.controller;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.comment.CommentResponse;
import com.zsp.bloggardensystem.entity.CommentEntity;
import com.zsp.bloggardensystem.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论相关控制层
 **/

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment")
    public CommentResponse getComment(@RequestParam int articleID) throws RuntimeException{
        return commentService.getComment(articleID);
    }

    @PostMapping("/comment")
    public BaseResponse addComment(@RequestBody CommentEntity request) throws RuntimeException{
        return commentService.addComment(request);
    }
}
