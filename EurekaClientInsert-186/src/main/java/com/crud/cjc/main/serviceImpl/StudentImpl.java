package com.crud.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.repository.StudentRepository;
import com.crud.cjc.main.service.StudentService;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepository st;
	@Override
	public Student saveData(Student s) {
		return st.save(s);
	}

}
