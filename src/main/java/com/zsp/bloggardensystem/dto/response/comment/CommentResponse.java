package com.zsp.bloggardensystem.dto.response.comment;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.entity.CommentEntity;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论返回体
 **/

public class CommentResponse extends BaseResponse {
    private List<CommentEntity> result;

    public List<CommentEntity> getResult() {
        return result;
    }

    public void setResult(List<CommentEntity> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CommentRespons{" +
                "result=" + result +
                "} " + super.toString();
    }
}
