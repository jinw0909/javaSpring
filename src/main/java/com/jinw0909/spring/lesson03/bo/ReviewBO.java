package com.jinw0909.spring.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinw0909.spring.lesson03.dao.ReviewDAO;
import com.jinw0909.spring.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	ReviewDAO reviewDAO;
	
	public Review getReview(int id) {
		return reviewDAO.selectReview(id);
	}
	
	// insert
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
	}
	
	public int addReview(Review review) {
		return reviewDAO.insertReviewFromObject(review);
	}
	
	//update
	public int updateReviewById(int id, String review) {
		return reviewDAO.updateReviewById(id, review);
	}

}
