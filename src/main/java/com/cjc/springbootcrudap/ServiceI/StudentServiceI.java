package com.cjc.springbootcrudap.ServiceI;

import java.util.List;
import com.cjc.springbootcrudap.Model.Student;

public interface StudentServiceI {

public	void saveStudent(Student s);

public List<Student> loginStudent(String u, String p);

}

