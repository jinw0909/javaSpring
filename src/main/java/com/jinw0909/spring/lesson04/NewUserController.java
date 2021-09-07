package com.jinw0909.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinw0909.spring.lesson04.bo.NewUserBO;
import com.jinw0909.spring.lesson04.model.NewUser;

@RequestMapping("/lesson04")
@Controller
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;
	
	@RequestMapping("/ex01/1")
	public String addUserView() {
		return "lesson04/addUser";
	}
	
	@RequestMapping("/ex01/add_user")
	public String addUser(
			@ModelAttribute NewUser newUser
			) {
		int count =  newUserBO.addNewUser(newUser);
		return "lesson04/addSuccess";
	}
	
	@GetMapping("/ex01/2")
	public String getUserInfo(Model model) {
		
//		NewUser newUser = newUserBO.getLastUser();
//		model.addAttribute("result", newUser);
//		model.addAttribute("subject", "회원정보");
		
		return "lesson04/userInfo";
	}
}
