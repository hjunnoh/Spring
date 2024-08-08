package com.hjnoh19.spring.ex.mybatis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjnoh19.spring.ex.mybatis.Domain.Review;
import com.hjnoh19.spring.ex.mybatis.Repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;

	// id가 5인 리뷰 정보 리턴 기능
	public Review getReview(int id) {
		// new_review 테이블에서 id가 4인 행 조회
		return reviewRepository.selectReview(id);
	}
}
