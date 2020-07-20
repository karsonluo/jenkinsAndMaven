package com.example.karsondemo.test;

import java.util.ArrayList;
import java.util.List;


public class OutOfMen {
//堆溢出
	public static void test() {
		
		List<Object> eeList = new ArrayList();
		while(true) {
			
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
			eeList.add(new Object());
		}
		
	}
	
	//栈溢出
	public static void test02() {
		
		int i=0;
		i++;
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
		test02();
	}
	
	public static void main(String[] args) {
		
		//test02();
		//test();
		
		 // 使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());list.add(String.valueOf(i++).intern());
            list.add(String.valueOf(i++).intern());
            
        }
    }
		
	}
	

