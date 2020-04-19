package com.zsp.bloggardensystem.entity;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论实体
 **/

public class CommentEntity {
    private int commentID;
    private int articleID;
    private int commentSerialNumber;
    private int userID;
    private String userName;
    private String commentContent;
    private String commentTime;
    private List<CommentEntity> children;

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public int getCommentSerialNumber() {
        return commentSerialNumber;
    }

    public void setCommentSerialNumber(int commentSerialNumber) {
        this.commentSerialNumber = commentSerialNumber;
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

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public List<CommentEntity> getChildren() {
        return children;
    }

    public void setChildren(List<CommentEntity> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "CommentEntity{" +
                "commentID=" + commentID +
                ", articleID=" + articleID +
                ", commentSerialNumber=" + commentSerialNumber +
                ", userID=" + userID +
                ", userName='" + userName + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", children=" + children +
                '}';
    }
}
