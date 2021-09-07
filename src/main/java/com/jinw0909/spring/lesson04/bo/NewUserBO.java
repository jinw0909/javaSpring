package com.jinw0909.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinw0909.spring.lesson04.dao.NewUserDAO;
import com.jinw0909.spring.lesson04.model.NewUser;

@Service
public class NewUserBO {

	@Autowired
	private NewUserDAO newUserDAO; 
	
	public int addNewUser(NewUser newUser) {
		return newUserDAO.insertNewUser(newUser);
	}
}
