package com.cjc.springbootcrudap.ServiceIMPL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootcrudap.Model.Student;
import com.cjc.springbootcrudap.ServiceI.StudentServiceI;
import com.cjc.springbootcrudap.repository.StudentRepository;

@Service
public class StudentServiceIMPL  implements StudentServiceI{

	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveStudent(Student s) {
    sr.save(s);
	}

	@Override
	public List<Student> loginStudent(String u, String p) {
		
		if(u.equals("admin") && p.equals("admin")) {
           			 
			return   (List<Student>) sr.findAll();
		}
		else
		{
		return	sr.findByUsernameAndPassword(u, p);
		}
	}	
}

