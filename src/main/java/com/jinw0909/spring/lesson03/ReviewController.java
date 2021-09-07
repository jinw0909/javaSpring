package com.jinw0909.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jinw0909.spring.lesson03.bo.ReviewBO;
import com.jinw0909.spring.lesson03.model.Review;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	//lesson03/ex01?id=3
	public Review ex01(
			@RequestParam("id") int id
			// @RequestParam(value="id") int id // 필수 > 없으면 400에러
//			@RequestParam(value="id", required=true) int id
//			@RequestParam(value="id", required=false) int id
//			@RequestParam(value="id", defaultValue="3") int id
			) { 
		return reviewBO.getReview(id);
	}
	
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		//paramter 통한 전달
//		int count = reviewBO.addReview(4,"콤비네이션피자", "김바다", 4.5, "할이도 많이 받고 잘 먹었습니다");
		
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("장진우");
		review.setPoint(4.0);
		review.setReview("맛있음");
		
		int count = reviewBO.addReview(review);
		
		return "insert success " + count;
		
		
	}
	
	// update
	// 요청 url http://localhost/lesson03/ex03?id
	@RequestMapping("lesson03/ex03")
	public String ex03(@RequestParam("id") int id, @RequestParam("review") String review) {
		
		int count = reviewBO.updateReviewById(id, review);
		
		return "update 성공 " + count;
	}
	
	//delete
//	@RequestMapping("lesson03/ex04")
//	public String ex04(@RequestParam("id") int id) {
//		
//		int count = reviewBO.
//	}
	
	
	
	
}
