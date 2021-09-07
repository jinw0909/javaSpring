package com.jinw0909.spring.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	public String ex02(Model model) {
		
		//List
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("grape");
		fruits.add("mango");
		
		model.addAttribute("fruits", fruits);
		
		//
		List<Map<String, Object>> users = new ArrayList<>();
//		map.put("이름", "김바다");
//		map.put("age", 3);
//		map.put("hobby", "사냥하기");
//		users.add(map);
		
		
		
		return "lesson05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03(Model model) {
		
		Date today = new Date();
		model.addAttribute("today", today);
		
		return "lesson05/ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04() {
		return "lesson05/ex04";
	}
}
