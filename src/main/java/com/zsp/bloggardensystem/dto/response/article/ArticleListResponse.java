package com.zsp.bloggardensystem.dto.response.article;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.entity.ArticleEntity;
import com.zsp.bloggardensystem.entity.PageInfo;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章列表响应体
 **/

public class ArticleListResponse extends BaseResponse {
    private List<ArticleEntity> result;
    private PageInfo pageInfo;

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<ArticleEntity> getResult() {
        return result;
    }

    public void setResult(List<ArticleEntity> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ArticleListResponse{" +
                "result=" + result +
                ", pageInfo=" + pageInfo +
                "} " + super.toString();
    }
}
