package com.example.karsondemo.myjmeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;

public class TestJVM {

	public static void main(String[] args) throws IOException, InterruptedException {
		//下面的代码用于读取磁盘上的某个文件
//		File file = new File("C:\\Users\\Administrator\\Desktop\\123.jmx");
//		   List<String> lines = FileUtils.readLines(file, "UTF-8");
//
//		   FileWriter fw =new FileWriter(new File("C:\\Users\\Administrator\\Desktop\\test\\tt.jmx"));
//	for (String i : lines) {
//		fw.write(i+"\n");
//		fw.flush();
//		System.out.println(i+"====");
	
		
/*
		String[] cmd = new String[] { "cmd.exe", "/C", "jmeter -n -t C:/Users/Administrator/Desktop/123.jmx" };  // 命令
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		InputStream ins = pr.getInputStream();
		 BufferedReader reader = new BufferedReader(new InputStreamReader(ins));  
         String line = null;  
         while ((line = reader.readLine()) != null) {  
             System.out.println(line);  // 输出
         }
         int exitValue = pr.waitFor();  
         System.out.println("返回值：" + exitValue); 
         pr.getOutputStream().close();  // 不要忘记了一定要关
		
	*/
		
		String string = new String("<stringProp name=\"HTTPSampler.path\">${path}</stringProp>");
	    String path = "http://httpbin.org/anything";
	if (string.contains("${path}")) {
				
		String reString = string.replace("${path}", path);
		System.out.println(reString+"======");
		
	}
	
	}
		   


		
	}
//}

