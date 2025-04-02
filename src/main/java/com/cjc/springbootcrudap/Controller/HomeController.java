package com.cjc.springbootcrudap.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootcrudap.Model.Student;
import com.cjc.springbootcrudap.ServiceI.StudentServiceI;

@Controller
public class HomeController {

	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String preLogin(){
		return "login";
		
	}
	
	@RequestMapping("/openregister")
	public String preRegister() {
		return "register";
		
	}

	
	@RequestMapping("/save")
	public String saveStudent(@ModelAttribute Student s) {
		ssi.saveStudent(s);
		return "login";
		
	}
	
	@RequestMapping("/login")
	public String loginStudent(@RequestParam("username")String u, @RequestParam("password") String p,Model m) {
    List<Student> list=ssi.loginStudent(u,p);
    if(!list.isEmpty()) {
       m.addAttribute("data", list);
	   return "success";
   }
	return "login";
	}	
}

