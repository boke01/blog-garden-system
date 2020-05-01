package com.zsp.bloggardensystem.dto.response.article;

import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.entity.ArticleEntity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 文章响应体
 **/

public class ArticleResponse extends BaseResponse {
    private ArticleEntity article;

    public ArticleEntity getArticle() {
        return article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "ArticleRespons{" +
                "article=" + article +
                "} " + super.toString();
    }
}
