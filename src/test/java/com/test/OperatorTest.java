package com.test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.OperatorPaage;


public class OperatorTest {
WebDriver driver;
OperatorPaage op=null;
	
@BeforeMethod
public void openBrowser() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/New%20Folder%20(2)/Offline%20website/pages/examples/operators.html");
	op=new OperatorPaage(driver);
	
	
}

@AfterMethod
public void closeBrowser() {
	driver.close();
}
@Test
public void logicalContact(){
	//log.info("Verify the whatsapp users");
	//test=extent.createTest("Logical contact");
	ArrayList<String> exp=new ArrayList<>();
	exp.add("Kiran");
	exp.add("Darshit");
	Assert.assertEquals(op.logical1(), exp);
}
@Test
public void logicalContact2(){
	//log.info("Verify the whatsapp users and phone call users");
	ArrayList<String> exp=new ArrayList<>();
	exp.add("Neelam");
	exp.add("Seema");
	exp.add("Varsha");
	Assert.assertEquals(op.logical2(), exp);
}
@Test
public void logicalTime(){
	//log.info("Verify the  users available in 7 amto 10 am ");
	ArrayList<String> exp=new ArrayList<>();
	exp.add("Kiran");
	Assert.assertEquals(op.logical3(), exp);
}



}
