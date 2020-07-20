package com.example.karsondemo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.karsondemo.entity.JmeterSampleDTO;
import com.example.karsondemo.mapper.JmeterSampleDtoMapper;
import com.example.karsondemo.service.JmeterSampleDtoIservice;

@Service
public class JmeterSampleDtoIserviceImpl implements JmeterSampleDtoIservice {
	@Resource
	private JmeterSampleDtoMapper jmeterSampleDtoMapper;
	//新增
	public String addJmeterSample(JmeterSampleDTO jmeterSample) {
		
		System.out.println(jmeterSample.getContent()+"======");
		jmeterSampleDtoMapper.addJmeterSample(jmeterSample);
		return "success!!!";
	}

}
