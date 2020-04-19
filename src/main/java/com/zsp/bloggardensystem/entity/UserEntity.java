package com.zsp.bloggardensystem.entity;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户数据实体
 **/

public class UserEntity {
    private int userID;
    private String userAccount;
    private String usrePassword;
    private String userName;
    private int userRead;
    private int userIssue;
    private String userIntro;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUsrePassword() {
        return usrePassword;
    }

    public void setUsrePassword(String usrePassword) {
        this.usrePassword = usrePassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserRead() {
        return userRead;
    }

    public void setUserRead(int userRead) {
        this.userRead = userRead;
    }

    public int getUserIssue() {
        return userIssue;
    }

    public void setUserIssue(int userIssue) {
        this.userIssue = userIssue;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", userAccount='" + userAccount + '\'' +
                ", usrePassword='" + usrePassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userRead=" + userRead +
                ", userIssue=" + userIssue +
                ", userIntro='" + userIntro + '\'' +
                '}';
    }
}
