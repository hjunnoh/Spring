package com.hjnoh19.spring.ex.mybatis.Repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hjnoh19.spring.ex.mybatis.Domain.Review;

@Mapper
public interface ReviewRepository {

	public Review selectReview(@Param("id") int id);
	
}
