package com.jinw0909.spring.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinw0909.spring.lesson02.dao.UsedGoodsDAO;
import com.jinw0909.spring.lesson02.model.UsedGoods;

// 비즈니스 로직
@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	public List<UsedGoods> getUsedGoodsList() {
		return usedGoodsDAO.selectUsedGoodsList();
	}
}
