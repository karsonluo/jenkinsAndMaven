package com.example.karsondemo.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailSend {
	
	public static String  sendSimpleMail(JavaMailSenderImpl javaMailSender) {
		//封装简单的邮件内容 
		SimpleMailMessage message = new SimpleMailMessage(); 
		//邮件主题
		message.setSubject("放假通知");
		message.setText("春节放假7天"); 
		//发件人
		message.setFrom("382296381@qq.com");
		message.setTo("382296381@qq.com"); 
		javaMailSender.send(message);
		return "发送成功！！！！";
	}
	
	
	public static String testMimeMail(JavaMailSenderImpl javaMailSender) throws MessagingException { 
		//创建一个发送复杂消息对象 
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		//通过消息帮助对象，来设置发送的内容 
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true); 
		//邮件主题 
		messageHelper.setSubject("放假通知"); 
		//第2个参数为true表示是html
		messageHelper.setText("<h2 style='color:red'>春节放假7天</h2>", true);
		//上传文件 (文件名，File或IO对象) 
		messageHelper.addAttachment("1.jpg", new File("")); 
		messageHelper.addAttachment("2.jpg", new File("")); 
		messageHelper.addAttachment("3.jpg", new File("")); 
		//发件人 
		messageHelper.setFrom("382296381@qq.com");
		messageHelper.setTo("382296381@qq.com");
		javaMailSender.send(mimeMessage);
		
		return "发送成功！！！"; 
		
		} 
	
	
	
}
