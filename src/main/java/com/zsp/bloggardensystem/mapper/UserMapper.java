package com.zsp.bloggardensystem.mapper;

import com.zsp.bloggardensystem.dto.request.user.LoginRequest;
import com.zsp.bloggardensystem.dto.request.user.UserInfoRequest;
import com.zsp.bloggardensystem.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 用户数据接口
 **/

@Mapper
@Repository
public interface UserMapper {
    UserEntity getUser(@Param("userID") int userID,@Param("userAccount") String userAccount) throws RuntimeException;

    int updateUserInfo(UserInfoRequest request)throws RuntimeException;

    int addUser(LoginRequest request)throws RuntimeException;
}
