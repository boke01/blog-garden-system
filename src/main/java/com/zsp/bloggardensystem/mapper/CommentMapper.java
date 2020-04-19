package com.zsp.bloggardensystem.mapper;

import com.zsp.bloggardensystem.entity.CommentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/16
 * @description: 评论相关数据接口
 **/
@Mapper
@Repository
public interface CommentMapper {

    List<CommentEntity> getComment(@Param("articleID") int articleID)throws RuntimeException;

    int addComment(CommentEntity request)throws RuntimeException;
}
