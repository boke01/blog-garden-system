package com.zsp.bloggardensystem.service;

import com.zsp.bloggardensystem.dto.request.notice.NoticeRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.notice.NoticeRespons;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/4/22
 * @description: 通知相关业务接口
 **/
public interface NoticeService {

    NoticeRespons getNotice(int userID) throws RuntimeException;

    BaseResponse addNotice(NoticeRequest request) throws RuntimeException;

    BaseResponse updateNotice(NoticeRequest request) throws RuntimeException;

    BaseResponse deleteNotice(int userID) throws RuntimeException;
}
