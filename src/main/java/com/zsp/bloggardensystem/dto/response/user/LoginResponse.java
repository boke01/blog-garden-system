package com.zsp.bloggardensystem.dto.response.user;

import com.zsp.bloggardensystem.dto.response.BaseResponse;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 登录响应体
 **/

public class LoginResponse extends BaseResponse {
    private int userID;
    private String userName;

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

    @Override
    public String toString() {
        return "LoginResponse{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                "} " + super.toString();
    }
}
