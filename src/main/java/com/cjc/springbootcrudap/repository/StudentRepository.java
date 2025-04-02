package com.cjc.springbootcrudap.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootcrudap.Model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	
	//public List<Student> findByName(String name); //select*from Student where name=?
	
	//public Student findByRollno(int rollno);
	
	
	public List<Student>  findByUsernameAndPassword(String username, String password);

	
	
	
}
