package com.crud.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.service.StudentService;

@RestController
public class InsertController {

	@Autowired
	StudentService ss;
	@PostMapping("/insertData")
	public String postData(@RequestBody Student s) {
		Student s1=ss.saveData(s);
		return "inser producer";
	}
}
