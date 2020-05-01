package com.zsp.bloggardensystem.controller;

import com.zsp.bloggardensystem.dto.request.article.AddReadRequest;
import com.zsp.bloggardensystem.dto.request.article.ArticleListRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleListResponse;
import com.zsp.bloggardensystem.dto.response.article.ArticleResponse;
import com.zsp.bloggardensystem.entity.ArticleEntity;
import com.zsp.bloggardensystem.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章资源控制
 **/

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/query")
    public ArticleListResponse getArticleList(@RequestBody ArticleListRequest request) throws RuntimeException{
        return articleService.getArticleList(request);
    }

    @PostMapping("/add-read")
    public BaseResponse addRead(@RequestBody AddReadRequest request) throws RuntimeException{
        return articleService.addRead(request);
    }

    @GetMapping("/article")
    public ArticleResponse getArticle(@RequestParam int articleID) throws RuntimeException{
        return articleService.getArticle(articleID);
    }

    @PutMapping("/article")
    public BaseResponse updateArticle(@RequestBody ArticleEntity request) throws RuntimeException{
        return articleService.updateArticle(request);
    }

    @PostMapping("/article")
    public BaseResponse addArticle(@RequestBody ArticleEntity request) throws RuntimeException{
        return articleService.addArticle(request);
    }

    @DeleteMapping("/article")
    public BaseResponse deleteArticle(@RequestParam int articleID,@RequestParam int userID) throws RuntimeException{
        return articleService.deleteArticle(articleID,userID);
    }
}
