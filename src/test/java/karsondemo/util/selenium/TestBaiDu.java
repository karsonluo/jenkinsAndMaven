package karsondemo.util.selenium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.apache.catalina.startup.WebAnnotationSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaiDu {
	  private WebDriver webDriver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	@BeforeEach
	public void setUp() {		
		webDriver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} 
	
	@Test
	public void test() throws InterruptedException {
		
		webDriver.get("http://www.baidu.com");
		webDriver.findElement(By.id("kw")).sendKeys("selenium");
		webDriver.findElement(By.id("form")).submit();
		Thread.sleep(3000);
		
		
		
	}
	
	@AfterEach
	public void tearDowm() {
		webDriver.quit();
	    String verificationErrorString = verificationErrors.toString();	    
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
	
}
