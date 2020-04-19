package com.zsp.bloggardensystem.mapper;

import com.zsp.bloggardensystem.dto.request.article.AddReadRequest;
import com.zsp.bloggardensystem.entity.ArticleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: blog-garden-system
 * @author: 朱升鹏
 * @date 2020/3/9
 * @description: 文章数据接口
 **/

@Mapper
@Repository
public interface ArticleMapper {
    List<ArticleEntity> articleEntityList(@Param("userID") int userID, @Param("userName") String userName, @Param("articleTitle") String articleTitle) throws RuntimeException;

    int addUserRead(AddReadRequest request)throws RuntimeException;

    int addArticleRead(AddReadRequest request)throws RuntimeException;

    ArticleEntity getArticle(@Param("articleID") int articleID)throws RuntimeException;

    int updateArticle(ArticleEntity request)throws RuntimeException;

    int addArticle(ArticleEntity request)throws RuntimeException;

    int deleteArticle(int articleID)throws RuntimeException;
}

