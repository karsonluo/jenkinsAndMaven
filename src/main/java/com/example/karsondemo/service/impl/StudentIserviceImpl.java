package com.example.karsondemo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.karsondemo.entity.Student;
import com.example.karsondemo.mapper.StudentMapper;
import com.example.karsondemo.service.StudentIservice;

//@ComponentScan({"com.example.karsondemo.mapper"})
@Service
public class StudentIserviceImpl implements StudentIservice {
	@Resource
	private StudentMapper studentMapper;
	
	public List<Student> findAllUser() {
		
		return studentMapper.findAllUser();
	}

}
