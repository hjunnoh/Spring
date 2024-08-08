package com.hjnoh19.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjnoh19.spring.ex.mybatis.Domain.Review;
import com.hjnoh19.spring.ex.mybatis.Service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;

	// parameter로 전달 받은 id와 일치하는 리뷰 정보를 json으로 Response 담는다.
	@ResponseBody
	@RequestMapping("/mybatis/review")
	public Review review(@RequestParam("id") int id) {
		// request Parameter
		// request.getParameter("id");
		return reviewService.getReview(id);
	}
}
