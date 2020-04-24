package com.zsp.bloggardensystem.dto.response.notice;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.entity.NoticeEntity;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/4/20
 * @description: 通知信息返回体
 **/

public class NoticeRespons extends BaseResponse {
    private List<NoticeEntity> result;

    public List<NoticeEntity> getResult() {
        return result;
    }

    public void setResult(List<NoticeEntity> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "NoticeRespons{" +
                "result=" + result +
                '}';
    }
}
