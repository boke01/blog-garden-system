package com.zsp.bloggardensystem.dto.response.img;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.entity.ArticleEntity;
import com.zsp.bloggardensystem.entity.PageInfo;

import java.util.List;

/**
 * @praogram: com.zsp.bloggardensystem.dto.response.img
 * @author: 朱升鹏
 * @date: 2020/5/1
 * @description: 图片信息返回体
 **/
public class ImgResponse extends BaseResponse {
    private String path;
    private String key;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ImgResponse{" +
                "path='" + path + '\'' +
                ", key='" + key + '\'' +
                "} " + super.toString();
    }
}
