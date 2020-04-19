package com.zsp.bloggardensystem.entity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章结构实体
 **/

public class ArticleEntity {
    private int articleID;
    private String articleTitle;
    private String articleContent;
    private String pictureCatalog;
    private int userID;
    private String userName;
    private String articleIssueTime;
    private int articleRead;

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getPictureCatalog() {
        return pictureCatalog;
    }

    public void setPictureCatalog(String pictureCatalog) {
        this.pictureCatalog = pictureCatalog;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArticleIssueTime() {
        return articleIssueTime;
    }

    public void setArticleIssueTime(String articleIssueTime) {
        this.articleIssueTime = articleIssueTime;
    }

    public int getArticleRead() {
        return articleRead;
    }

    public void setArticleRead(int articleRead) {
        this.articleRead = articleRead;
    }

    @Override
    public String toString() {
        return "ArticleEntity{" +
                "articleID=" + articleID +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleCountent='" + articleContent + '\'' +
                ", pictureCatalog='" + pictureCatalog + '\'' +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", articleIssueTime='" + articleIssueTime + '\'' +
                ", articleRead=" + articleRead +
                '}';
    }
}
