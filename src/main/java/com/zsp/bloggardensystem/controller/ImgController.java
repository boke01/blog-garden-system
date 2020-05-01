package com.zsp.bloggardensystem.controller;

import com.zsp.bloggardensystem.dto.request.article.ArticleListRequest;
import com.zsp.bloggardensystem.dto.response.article.ArticleListResponse;
import com.zsp.bloggardensystem.dto.response.img.ImgResponse;
import com.zsp.bloggardensystem.util.ImageProcessingUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @praogram: com.zsp.bloggardensystem.controller
 * @author: 朱升鹏
 * @date: 2020/5/1
 * @description: 图片处理控制器
 **/
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ImgController {

    @Value("${qiniu.path}")
    private String path;

    @Value("${qiniu.accessKey}")
    private String accessKey;

    @Value("${qiniu.secretKey}")
    private String secretKey;

    @Value("${qiniu.bucket}")
    private String bucket;

    @PostMapping("/img")
    public ImgResponse getArticleList(@RequestParam("file") MultipartFile multipartFile) throws RuntimeException{
        ImgResponse response = new ImgResponse();
        response.setPath(path);
        try {
            response.setKey(ImageProcessingUtil.uploadImg((FileInputStream) multipartFile.getInputStream(),accessKey,secretKey,bucket));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
