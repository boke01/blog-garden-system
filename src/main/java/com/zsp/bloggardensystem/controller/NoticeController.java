package com.zsp.bloggardensystem.controller;

import com.zsp.bloggardensystem.dto.request.notice.NoticeRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.notice.NoticeRespons;
import com.zsp.bloggardensystem.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/4/20
 * @description: 通知控制器
 **/
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/notice")
    public NoticeRespons getNotice(@RequestParam int userID) {
        return noticeService.getNotice(userID);
    }

    @PostMapping("/notice")
    public BaseResponse addNotice(@RequestBody NoticeRequest request) {
        return noticeService.addNotice(request);
    }

    @PutMapping("/notice")
    public BaseResponse updateNotice(@RequestBody NoticeRequest request) {
        return noticeService.updateNotice(request);
    }

    @DeleteMapping("/notice")
    public BaseResponse deleteNotice(@RequestParam int userID) {
        return noticeService.deleteNotice(userID);
    }
}
