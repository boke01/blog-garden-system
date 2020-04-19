package com.zsp.bloggardensystem.dto.response.user;

import com.zsp.bloggardensystem.dto.response.BaseResponse;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户基础信息
 **/

public class UserInfoResponse extends BaseResponse {
    private int userRead;
    private int userIssue;
    private String userIntro;

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
        return "UserInfoResponse{" +
                "userRead=" + userRead +
                ", userIssue=" + userIssue +
                ", userIntro='" + userIntro + '\'' +
                "} " + super.toString();
    }
}
