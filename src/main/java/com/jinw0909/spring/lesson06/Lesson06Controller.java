package com.jinw0909.spring.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinw0909.spring.lesson04.model.NewUser;
import com.jinw0909.spring.lesson06.bo.Lesson06NewUserBO;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	
	@Autowired
	private Lesson06NewUserBO lesson06NewUserBO;
	
	@GetMapping("/add_user_view")
	public String addUserView() {
		return "lesson06/addUser";
	}
	
	@PostMapping("/add_user")
	public String add_user(@ModelAttribute NewUser newUser, Model model) {
		
		int count = lesson06NewUserBO.addNewUser(newUser);
		
		return "successfully inserted " + count + " line to DB";
	}
	
	@GetMapping("/is_duplication")
	@ResponseBody
	public Map<String, String> isDuplication(
			@RequestParam("name") String name
			) {
		
		Map <String, String> result = new HashMap<>();
		
		if (lesson06NewUserBO.existName(name)) {
			result.put("isDuplication", "true");
		} else {
			result.put("isDuplication", "false");
		}
		
		return result;
	}
}
