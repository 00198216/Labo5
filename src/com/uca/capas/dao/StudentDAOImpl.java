package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@PersistenceContext(name="capas")
	 private EntityManager entityManager;
	
	@Override
	public List<Student> findALL() throws DataAccessException {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		sb.append("select * from public.student");
		Query query = entityManager.createNativeQuery(sb.toString(),Student.class);
		List<Student> resultset= query.getResultList();
		
		return resultset;
	}

	@Override
	public Student findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		  Student student= entityManager.find(Student.class, code);
		return student;
	}

}
