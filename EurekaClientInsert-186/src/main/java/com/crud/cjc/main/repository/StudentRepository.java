package com.crud.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.cjc.main.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
//hemant sakarge 
}
