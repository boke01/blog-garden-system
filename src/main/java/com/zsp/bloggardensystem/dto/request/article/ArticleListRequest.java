package com.zsp.bloggardensystem.dto.request.article;

import com.zsp.bloggardensystem.entity.PageInfo;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章列表请求体
 **/

public class ArticleListRequest {
    private String userName;
    private String articleTitle;
    private int userID;
    private PageInfo pageInfo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        return "ArticleListRequest{" +
                "userName='" + userName + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", userID=" + userID +
                ", pageInfo=" + pageInfo +
                '}';
    }
}
