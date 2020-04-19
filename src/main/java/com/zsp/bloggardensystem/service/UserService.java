package com.zsp.bloggardensystem.service;

import com.zsp.bloggardensystem.dto.request.user.LoginRequest;
import com.zsp.bloggardensystem.dto.request.user.UserInfoRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.user.LoginResponse;
import com.zsp.bloggardensystem.dto.response.user.UserInfoResponse;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户业务接口
 **/
public interface UserService {
    LoginResponse login(LoginRequest request) throws RuntimeException;

    UserInfoResponse getUserInfo(int userID)throws RuntimeException;

    BaseResponse updateUserInfo(UserInfoRequest request)throws RuntimeException;

    BaseResponse addUser(LoginRequest request)throws RuntimeException;
}
