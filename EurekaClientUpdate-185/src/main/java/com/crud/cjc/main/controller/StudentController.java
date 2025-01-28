package com.crud.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	RestTemplate rt;
	@Autowired
	StudentService ss;
	@PutMapping("/update/{roll}")
	public String updateData(@PathVariable("roll")int roll,@RequestBody Student s) {
		String url="http://zuul/get/getByRoll/"+roll;
		Student s1=rt.getForObject(url,  Student.class);
		s1.setName(s.getName());
		s1.setMarks(s.getMarks());
		s1.setAddress(s.getAddress());
		String url1="http://zuul/insert/insertData";
		String msg=rt.postForObject(url1, s1,String.class);
		return "data update success";
	}
}
