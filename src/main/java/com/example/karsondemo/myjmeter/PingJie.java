package com.example.karsondemo.myjmeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class PingJie {

	public static String domain = "www.baidu.com";
	public static String path = "http://httpbin.org/anything";
	public static String port ="80";
	//读取模板
	public static void readjmx(String readPath,String outPutPath) {
		File readFile = new File(readPath);

		List<String> lines;

		try {
			lines = FileUtils.readLines(readFile, "UTF-8");

			FileWriter fw = new FileWriter(new File(outPutPath),true);

			for (String i : lines) {
				if(i.contains("${path}")) {
					String pathReplaceString= i.replace("${path}", path);
					fw.write( pathReplaceString+ "\n");
					fw.flush();
				}else if (i.contains("${port}")) {
					String portReplaceString= i.replace("${port}", port);
					fw.write(portReplaceString + "\n");
					fw.flush();
				}else {					
					fw.write(i + "\n");
					fw.flush();
						
				}
				

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String beginString = "C:\\Users\\Administrator\\Desktop\\test\\compent\\begin.txt";
		String endString ="C:\\Users\\Administrator\\Desktop\\test\\compent\\end.txt";
		String getString = "C:\\Users\\Administrator\\Desktop\\test\\compent\\get.txt";
		String postString = "C:\\Users\\Administrator\\Desktop\\test\\compent\\post.txt";

		String result = "C:\\Users\\Administrator\\Desktop\\test\\compent\\result.txt";
		String outPutPath= "C:\\Users\\Administrator\\Desktop\\test\\tt15.jmx";
		readjmx(beginString,outPutPath);
		//readjmx(getString,outPutPath);
		readjmx(getString,outPutPath);
		//readjmx(postString,outPutPath);
		readjmx(result,outPutPath);
		readjmx(endString,outPutPath);
		
		System.out.println("begin===========");
		/*String[] cmd = new String[] { "cmd.exe", "/C", "jmeter -n -t "+outPutPath };  // 命令
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
	}
	
}