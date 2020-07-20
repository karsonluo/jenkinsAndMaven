package com.example.karsondemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.karsondemo.entity.Student;


	@Mapper //添加此注解，便可以被扫描到
	public interface StudentMapper {
		/**
		 * 返回所有用户列表
		 * @return
		 */
		public List<Student> findAllUser();
	}
	
	
	

