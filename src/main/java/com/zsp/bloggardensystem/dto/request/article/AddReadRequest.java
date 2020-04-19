package com.zsp.bloggardensystem.dto.request.article;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/10
 * @description: 新增阅读量请求体
 **/

public class AddReadRequest {
    private int userID;
    private int articleID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    @Override
    public String toString() {
        return "AddReadRequest{" +
                "userID=" + userID +
                ", articleID=" + articleID +
                '}';
    }
}
