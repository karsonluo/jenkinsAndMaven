package com.example.karsondemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.karsondemo.entity.JmeterSampleDTO;

	@Mapper //添加此注解，便可以被扫描到
	public interface JmeterSampleDtoMapper {

		//新增接口
		public String addJmeterSample(JmeterSampleDTO jmeterSample);
	}
	
	
	

