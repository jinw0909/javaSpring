package com.jinw0909.spring.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.jinw0909.spring.lesson04.model.NewStudent;

@Repository
public interface NewStudentDAO {
	public int insertNewStudent(NewStudent newStudent);
}
