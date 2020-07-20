package com.example.karsondemo.myjmeter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.jmeter.JMeter;
import org.apache.jmeter.control.LoopController;
import org.apache.jmeter.control.gui.LoopControlPanel;
import org.apache.jmeter.control.gui.TestPlanGui;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.protocol.http.control.HeaderManager;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.testelement.TestPlan;
import org.apache.jmeter.threads.ThreadGroup;
import org.apache.jmeter.threads.gui.ThreadGroupGui;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

public class MyJmeterSave {

	public static void main(String[] argv) throws Exception {
		
// Initialize the configuration variables

 String jmeterHome = "F:\\百度网盘下载资料\\jmeter\\jmeter5.0\\apache-jmeter-5\\apache-jmeter-5.1.1\\apache-jmeter-5.1.1";

JMeterUtils.setJMeterHome(jmeterHome);

JMeterUtils.loadJMeterProperties(JMeterUtils.getJMeterBinDir() + "\\jmeter.properties");

JMeterUtils.initLogging();

JMeterUtils.initLocale();

// TestPlan

TestPlan testPlan = new TestPlan();

testPlan.setName("Test Plan");

testPlan.setEnabled(true);

 testPlan.setProperty(TestElement.TEST_CLASS, TestPlan.class.getName());

testPlan.setProperty(TestElement.GUI_CLASS, TestPlanGui.class.getName());

// ThreadGroup controller

LoopController loopController = new LoopController();

loopController.setEnabled(true);

loopController.setLoops(2);


loopController.setProperty(TestElement.TEST_CLASS,LoopController.class.getName());

loopController.setProperty(TestElement.GUI_CLASS,LoopControlPanel.class.getName());
// ThreadGroup

ThreadGroup threadGroup = new ThreadGroup();

threadGroup.setName("Thread Group");

threadGroup.setEnabled(true);
 threadGroup.setSamplerController(loopController);

threadGroup.setNumThreads(1);

threadGroup.setRampUp(3);

threadGroup.setProperty(TestElement.TEST_CLASS,ThreadGroup.class.getName());
 threadGroup.setProperty(TestElement.GUI_CLASS,ThreadGroupGui.class.getName());



// HTTPSamplerProxy

 HTTPSamplerProxy httpSamplerProxy = new HTTPSamplerProxy();

 // httpSamplerProxy.setProperty(TestElement.TEST_CLASS, HTTPSamplerProxy.class.getName());
// httpSamplerProxy.setProperty(TestElement.GUI_CLASS,"ThreadGroupGui");

 httpSamplerProxy.setDomain("site.baidu.com");
 HeaderManager headerManager = new HeaderManager();
 headerManager.setProperty("Content-Type", "multipart/form-data");
 httpSamplerProxy.setDomain("www.baidu.com");
 httpSamplerProxy.setPort(80);
 httpSamplerProxy.setPath("/");
 httpSamplerProxy.setMethod("GET");
 httpSamplerProxy.setConnectTimeout("5000");
 httpSamplerProxy.setProperty(TestElement.GUI_CLASS, HTTPSamplerProxy.class.getName());
 httpSamplerProxy.setUseKeepAlive(true);
 httpSamplerProxy.setHeaderManager(headerManager);
 
 
 
 
 
 


 // Create TestPlan hash tree

HashTree testPlanHashTree = new HashTree();

testPlanHashTree.add(testPlan);

// Add ThreadGroup to TestPlan hash tree

 HashTree threadGroupHashTree = new HashTree();

threadGroupHashTree = testPlanHashTree.add(testPlan, threadGroup);

// Add Java Sampler to ThreadGroup hash tree

HashTree javaSamplerHashTree = new HashTree();

javaSamplerHashTree = threadGroupHashTree.add(httpSamplerProxy);

// Save to jmx file

SaveService.saveTree(testPlanHashTree, new FileOutputStream("C:\\Users\\Administrator\\Desktop\\ziliao\\springboottest\\jmxscript\\test08.jmx"));

StandardJMeterEngine standardJMeterEngine = new StandardJMeterEngine();
System.out.println("开始启动==================！！！！");
// 配置jmeter
standardJMeterEngine.configure(SaveService.loadTree(new File("C:\\Users\\Administrator\\Desktop\\ziliao\\springboottest\\jmxscript\\test08.jmx")));
// 运行
standardJMeterEngine.run();

System.out.println(LoopController.class.getName()+"========!!!!!!!!");

 }

}


