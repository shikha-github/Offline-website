package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import objectRepositary.OperatorPageReposatory;





public class OperatorPaage extends OperatorPageReposatory {

	WebDriver driver;
	
	public OperatorPaage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	@Test
	public List logical1(){
		// List<WebElement> contacts = driver.findElements(By.xpath("//td[4]"));//2 elements
		 ArrayList<String> actual=new ArrayList<String>();
		    for(int i=0;i<contacts1.size();i++) {
		      String user = contacts1.get(i).getText();
		      if(user.equals("Whats App Only")) {
		      int num=i+2;
		      String uname = driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();//tr[2]/td[2]
		      actual.add(uname);
		      System.out.println("Person name:  "+uname);
		    }
		    }
			return actual;
	}


	@Test
	public List logical2(){
		// List<WebElement> contacts = driver.findElements(By.xpath("//td[4]"));//2 elements
		 ArrayList<String> actual=new ArrayList<String>();
		    for(int i=0;i<contacts1.size();i++) {
		      String user = contacts1.get(i).getText();
		      if(user.contains("Whats App") && (user.contains("Phone Call"))){
		      int num=i+2;
		      String uname = driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();//tr[2]/td[2]
		      actual.add(uname);
		      System.out.println("Person name:  "+uname);
		    }
		    }
			return actual;
	}

	@Test
	public List logical3(){
		// List<WebElement> time1 = driver.findElements(By.xpath("//td[6]"));//2 elements
		 ArrayList<String> actual=new ArrayList<String>();
		    for(int i=0;i<time1.size();i++) {
		      String user = time1.get(i).getText();
		      if(user.contains("07:00 AM to 10:00 PM ")) {
		      int num=i+2;
		      String uname = driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();//tr[2]/td[2]
		      actual.add(uname);
		      System.out.println("Person name available at 7 am to 10 am:  "+uname);
		    }
		    }
			return actual;
	}
/*	@Test
	public void allData(){
		 List<WebElement> data = driver.findElements(By.xpath("//tr"));//2 elements
		    for(int i=0;i<data.size();i++) {
		      String totalData=data.get(i).getText();
		      System.out.println(totalData);
		    }
	}*/
	/*public UseFullLinksPAge usefulLiink(){
		usefullinkclick.click();
		return new UseFullLinksPAge(driver);
		
	}*/
	
	
	
}
