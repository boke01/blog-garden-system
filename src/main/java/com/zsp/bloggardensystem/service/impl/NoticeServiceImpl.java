package com.zsp.bloggardensystem.service.impl;

import com.zsp.bloggardensystem.dto.request.notice.NoticeRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.notice.NoticeRespons;
import com.zsp.bloggardensystem.mapper.NoticeMapper;
import com.zsp.bloggardensystem.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;

/**
 * @praogram: com.zsp.bloggardensystem.service.impl
 * @author: 朱升鹏
 * @date: 2020/4/24
 * @description: 通知相关业务实现
 **/
@Service
public class NoticeServiceImpl implements NoticeService {

    private NoticeMapper noticeMapper;

    @Autowired
    public void setNoticeMapper(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }


    @Override
    public NoticeRespons getNotice(int userID) throws RuntimeException {
        NoticeRespons respons = new NoticeRespons();
        respons.setResult(noticeMapper.getNotice(userID));
        respons.setSuccess(true);
        return respons;
    }

    @Override
    public BaseResponse addNotice(NoticeRequest request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        response.setSuccess(noticeMapper.addNotice(request));
        return response;
    }

    @Override
    public BaseResponse updateNotice(NoticeRequest request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        response.setSuccess(noticeMapper.updateNotice(request));
        return response;
    }

    @Override
    public BaseResponse deleteNotice(int userID) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        response.setSuccess(noticeMapper.deleteNotice(userID));
        return response;
    }
}
