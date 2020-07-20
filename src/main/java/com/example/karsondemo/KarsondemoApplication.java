package com.example.karsondemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@MapperScan(basePackages="com.karsontest.mapper") //开启注解扫描，指定扫描文件为app.mapper包底下的所有包含`@mapper`的类。
@ServletComponentScan
public class KarsondemoApplication extends SpringBootServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(KarsondemoApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KarsondemoApplication.class, args);
	}

}
