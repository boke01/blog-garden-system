package com.zsp.bloggardensystem.controller;

import com.zsp.bloggardensystem.dto.request.user.LoginRequest;
import com.zsp.bloggardensystem.dto.request.user.UserInfoRequest;
import com.zsp.bloggardensystem.dto.response.BaseResponse;
import com.zsp.bloggardensystem.dto.response.user.LoginResponse;
import com.zsp.bloggardensystem.dto.response.user.UserInfoResponse;
import com.zsp.bloggardensystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户资源控制
 **/

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) throws RuntimeException{
        return userService.login(request);
    }

    @PostMapping("/register")
    public BaseResponse addUser(@RequestBody LoginRequest request) throws RuntimeException{
        return userService.addUser(request);
    }

    @GetMapping("/user-info")
    public UserInfoResponse getUserInfo(@RequestParam int userID) throws RuntimeException{
        return userService.getUserInfo(userID);
    }

    @PutMapping("/user-info")
    public BaseResponse updateUserInfo(@RequestBody UserInfoRequest request) throws RuntimeException{
        return userService.updateUserInfo(request);
    }
}
