package com.example.karsondemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.karsondemo.entity.JmeterSampleDTO;
import com.example.karsondemo.entity.Student;
import com.example.karsondemo.mapper.StudentMapper;
import com.example.karsondemo.myjmeter.JmeterSample;
import com.example.karsondemo.service.impl.JmeterSampleDtoIserviceImpl;
import com.example.karsondemo.service.impl.StudentIserviceImpl;
import com.example.karsondemo.util.EmailSend;
import com.example.karsondemo.util.JsonUtil;

import bsh.StringUtil;
import net.sf.ehcache.config.generator.ConfigurationUtil;
@RestController
public class StudentController {

	@Autowired
	private StudentIserviceImpl studentimpl;
	@Autowired
	private JmeterSampleDtoIserviceImpl jmeterSampleDtoIserviceImpl;
	@Autowired 
	JavaMailSenderImpl javaMailSender;
	
	@RequestMapping("/getAllStudent")
	public String getUsers() {
//		List<Student> students = studentMapper.findAllUser();
//		if(students != null && !students.isEmpty()) {
//			return JsonUtil.toJson(students);
//		}
		
		//EmailSend.sendSimpleMail(javaMailSender);
	
	
		
		
		List<Student> students =studentimpl.findAllUser();
		if(students != null && !students.isEmpty()) {
			return JsonUtil.toJson(students);
		}
		return "err";
	}
	

	@RequestMapping(value = "/addpath", method = RequestMethod.POST )	
	public void addPath(@RequestBody JmeterSampleDTO jmeterSample,HttpServletRequest request) {
		
		jmeterSampleDtoIserviceImpl.addJmeterSample(jmeterSample);

	}
	

	@RequestMapping("/excuteJmeter")
	public String excuteJmeter() throws IOException {
		JmeterSample jmeterSample = new JmeterSample();

		return jmeterSample.excuteConfig().getName();
	}
	
	/*

	@RequestMapping("/mock")
	public List<Student> excuteMock() throws IOException {
		
		StudentMapper mockStudent =   mock(StudentMapper.class);
		//mockList.add(new Student());
		List<Student> lists = new ArrayList();
		Student ssStudent = new Student();
		ssStudent.setSbirthday("1988-08-08");
		ssStudent.setSclass("five");
		ssStudent.setSname("testkarson");
		lists.add(ssStudent);
		
		
		when(mockStudent.findAllUser()).thenReturn(lists);

		return  mockStudent.findAllUser();
	}
	
	*/
}
