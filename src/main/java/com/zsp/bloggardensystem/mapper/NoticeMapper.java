package com.zsp.bloggardensystem.mapper;

import com.zsp.bloggardensystem.dto.request.notice.NoticeRequest;
import com.zsp.bloggardensystem.entity.NoticeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/4/22
 * @description: 通知信息数据实体
 **/
@Mapper
@Repository
public interface NoticeMapper {

    List<NoticeEntity> getNotice(@Param("userID") int userID) throws RuntimeException;

    boolean addNotice(NoticeRequest request) throws RuntimeException;

    boolean updateNotice(NoticeRequest request) throws RuntimeException;

    boolean deleteNotice(@Param("userID") int userID) throws RuntimeException;
}
