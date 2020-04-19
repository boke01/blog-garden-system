package com.zsp.bloggardensystem.service.impl;

import com.zsp.bloggardensystem.dto.request.user.LoginRequest;
import com.zsp.bloggardensystem.dto.request.user.UserInfoRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.user.LoginResponse;
import com.zsp.bloggardensystem.dto.response.user.UserInfoResponse;
import com.zsp.bloggardensystem.entity.ConstantPool;
import com.zsp.bloggardensystem.entity.UserEntity;
import com.zsp.bloggardensystem.mapper.UserMapper;
import com.zsp.bloggardensystem.service.UserService;
import com.zsp.bloggardensystem.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户业务实现
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public LoginResponse login(LoginRequest request) throws RuntimeException{
        LoginResponse response = new LoginResponse();
        UserEntity userEntity = userMapper.getUser(0,request.getUserAccount());
        if(userEntity != null){
            if(Md5Util.md5Encode(request.getUsrePassword()).equals(userEntity.getUsrePassword())){
                response.setUserID(userEntity.getUserID());
                response.setUserName(userEntity.getUserName());
                response.setSuccess(true);
            }else {
                response.setMessage(ConstantPool.PASSWORD_ERROR);
                response.setSuccess(false);
            }
        }else {
            response.setMessage(ConstantPool.ACCOUNT_ERROR);
            response.setSuccess(false);
        }
        return response;
    }

    @Override
    public UserInfoResponse getUserInfo(int userID) {
        UserInfoResponse response = new UserInfoResponse();
        UserEntity userEntity = userMapper.getUser(userID,null);
        if(userEntity == null){
            response.setSuccess(false);
            response.setMessage(ConstantPool.ARTICLEID_ERROR);
        }else {
            response.setUserIntro(userEntity.getUserIntro());
            response.setUserIssue(userEntity.getUserIssue());
            response.setUserRead(userEntity.getUserRead());
            response.setSuccess(true);
        }
        return response;
    }

    @Override
    public BaseResponse updateUserInfo(UserInfoRequest request) {
        BaseResponse response = new BaseResponse();
        int result = userMapper.updateUserInfo(request);
        if(result == 1){
            response.setSuccess(true);
        }else {
            response.setSuccess(false);
            response.setMessage(ConstantPool.UPDATE_ERROR);
        }
        return response;
    }

    @Override
    public BaseResponse addUser(LoginRequest request) throws RuntimeException {
        BaseResponse response = new BaseResponse();
        UserEntity userEntity = userMapper.getUser(0,request.getUserAccount());
        if(userEntity == null || userEntity.getUserID() == 0){
            request.setUsrePassword(Md5Util.md5Encode(request.getUsrePassword()));
            if(userMapper.addUser(request) == 1){
                response.setSuccess(true);
            }
        }else {
            response.setSuccess(false);
        }
        return response;
    }
}
