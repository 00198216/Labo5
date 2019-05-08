package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Student;

public interface StudentDAO {
	
	public List<Student> findALL() throws DataAccessException;
	public Student findOne(Integer code) throws DataAccessException;

}
