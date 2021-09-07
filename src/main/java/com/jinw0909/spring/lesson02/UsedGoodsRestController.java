package com.jinw0909.spring.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinw0909.spring.lesson02.bo.UsedGoodsBO;
import com.jinw0909.spring.lesson02.model.UsedGoods;

@RestController
public class UsedGoodsRestController {

	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	// usedgoodsd의 모든 행을 보여줘
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() {
		return usedGoodsBO.getUsedGoodsList();
	}
}
