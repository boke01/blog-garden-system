package com.zsp.bloggardensystem.dto.request.user;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户基础信息请求体
 **/

public class UserInfoRequest {
    private int userID;
    private String userIntro;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

    @Override
    public String toString() {
        return "UserInfoRequest{" +
                "userID=" + userID +
                ", userIntro='" + userIntro + '\'' +
                '}';
    }
}
