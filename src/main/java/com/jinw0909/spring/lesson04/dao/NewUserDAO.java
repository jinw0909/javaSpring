package com.jinw0909.spring.lesson04.dao;

import org.apache.ibatis.annotations.Param;

import com.jinw0909.spring.lesson04.model.NewUser;

public interface NewUserDAO {
	
	public int insertNewUser(NewUser newUser);
	// lesson06 예제용
	// count 함수를 통해서 name을 조회하고 그 결과가 1이면 중복, 0이면 없음
	public int selectCountName(@Param("name") String name);
}
