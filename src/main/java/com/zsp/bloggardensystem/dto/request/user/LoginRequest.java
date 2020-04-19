package com.zsp.bloggardensystem.dto.request.user;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 登录请求体
 **/

public class LoginRequest {
    private String userAccount;
    private String usrePassword;
    private String userName;

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

    @Override
    public String toString() {
        return "LoginRequest{" +
                "userAccount='" + userAccount + '\'' +
                ", usrePassword='" + usrePassword + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
