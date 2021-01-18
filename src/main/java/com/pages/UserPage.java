package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectRepositary.UserPageRepository;







public class UserPage extends UserPageRepository {

	WebDriver driver;
	public UserPage(WebDriver driver){
		 PageFactory.initElements(driver ,this);
		 this.driver=driver;
	}
	public Logger log ;
	public Logger pagelog(){
		 log= Logger.getLogger(this.getClass());
		String path =(System.getProperty("user.dir")+"/log4jPage.properties");
		PropertyConfigurator.configure(path);
		return log;
		 
	}

	
	public boolean mainHeading() {
		pagelog().info(" open mainHeading ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		WebElement actualdata = mainHeading;
		pagelog().info(" actualdata Log");
		String actualHeading = actualdata.getText();
		String expdata = "Users";
		if(actualHeading.equals(expdata)){
			pagelog().info(" Heading is matched  ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
		
	}

	
	public boolean addUserButton() {
		pagelog().info(" click addUser button ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		WebElement actualdata = addUserButton;
		
		pagelog().info(" actualdata ");
		String actualHeading = actualdata.getText();
		String expdata = "Add User";
		if(actualHeading.equals(expdata)){
			
			pagelog().info(" Heading is matched  ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched  ");
			return false;
		}
		
	}
	
	
	public boolean table1(){
		pagelog().info(" open table1 ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table1;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("1");
		expdata.add("2");
		expdata.add("3");
		expdata.add("4");
		
		pagelog().info(" expected data");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element :list){
			actualdata.add(element.getText());
		}
		
		pagelog().info(" actual data  ");
		if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched  ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
		
	}
	
	public boolean table2(){
		pagelog().info(" open table2 ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table2;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("Kiran");
		expdata.add("Sagar");
		expdata.add("Monica");
		expdata.add("Kimaya");
		
		pagelog().info(" expected data  ");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element :list){
			actualdata.add(element.getText());
		}
		
		pagelog().info(" actualdata ");
		if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched");
			return false;
		}
		
	}
	
	public boolean table3(){
		pagelog().info(" open table3  ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table3;
		ArrayList<String>expdata =new ArrayList<String>();
		expdata.add("kiran@gmail.com");
		expdata.add("sagar@gmail.com");
		expdata.add("monica@gmail.com");
		expdata.add("kimaya@gmail.com");
		
		pagelog().info(" expected data ");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element :list){
			actualdata.add(element.getText());
		}
		
		pagelog().info(" actual data ");
		if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
		
	}
	
	public boolean table4(){
		pagelog().info(" open table4  ");
		driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		List<WebElement>list =table4;
		ArrayList<String>expdata= new ArrayList<String>();
		expdata.add("9898989898");
		expdata.add("999999999");
		expdata.add("1111111111");
		expdata.add("999999999");
		
		pagelog().info(" expected data ");
		ArrayList<String>actualdata=new ArrayList<String>();
		for(WebElement element :list){
			actualdata.add(element.getText());
		}
		
		pagelog().info(" actual data ");
		if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
		
	}
	
	public boolean table5(){
		pagelog().info(" open table5  ");
	    driver.get("file:///D:/Offline%20website/pages/examples/users.html");
	    List<WebElement>list =table5;
	    ArrayList<String>expdata=new ArrayList<String>();
	    expdata.add("Java/J2EE");
	    expdata.add("Selenium");
	    expdata.add("Python");
	    expdata.add("PHP");
	   
	    pagelog().info(" expected data ");
	    ArrayList<String>actualdata=new ArrayList<String>();
	    for(WebElement element :list){
	    	actualdata.add(element.getText());
	    }
	  
	    pagelog().info(" actual data ");
	    if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
	   
	}
	
	public boolean table6(){
	   pagelog().info(" open table6  ");
	   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
	   List<WebElement>list =table6;
	   ArrayList<String>expdata=new ArrayList<String>();
	   expdata.add("Male");
	   expdata.add("Male");
	   expdata.add("Female");
	   expdata.add("Female");
	   
	   pagelog().info(" expected data ");
	   ArrayList<String>actualdata =new ArrayList<String>();
	   for(WebElement element :list){
	    	actualdata.add(element.getText());
	    }
	   
	    pagelog().info(" actual data ");
	    if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
	    
	
	}
	public boolean table7(){
		   pagelog().info(" open table7  ");
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =table7;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("Maharashtra");
		   expdata.add("Punjab");
		   expdata.add("Maharashtra");
		   expdata.add("Punjab");
		  
		   pagelog().info(" expected data ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		   
		    pagelog().info(" actual data  ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info(" Heading is matched");
				return true;
			}else{
				
				pagelog().info("Heading is not matched ");
				return false;
			}
		  
		
	}
	public boolean verifyHeader(){
		   pagelog().info(" verifying header  ");
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyHeader;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("#");
		   expdata.add("Username");
		   expdata.add("Email");
		   expdata.add("Mobile");
		   expdata.add("Course");
		   expdata.add("Gender");
		   expdata.add("State");
		   expdata.add("Action");
		  
		   pagelog().info(" expected data ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		  
		    pagelog().info("  actual data   ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info("Heading is matched ");
				return true;
			}else{
				
				pagelog().info(" Heading is not matched ");
				return false;
			}
		   
	}
	
	public boolean  verifyFirstRow(){
		   pagelog().info(" verify 1st Row  ");
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyFirstRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("1");
		   expdata.add("Kiran");
		   expdata.add("kiran@gmail.com");
		   expdata.add("9898989898");
		   expdata.add("Java/J2EE");
		   expdata.add("Male");
		   expdata.add("Maharashtra");
		   expdata.add("Delete");
		 
		   pagelog().info("  expected data  ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		   
		    pagelog().info(" actual data  ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info("Heading is matched ");
				return true;
			}else{
				
				pagelog().info("Heading is not matched ");
				return false;
			}
		   
	}
	
	public boolean verifySecondRow(){
		   pagelog().info(" verifying 2nd Row   ");
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifySecondRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("2");
		   expdata.add("Sagar");
		   expdata.add("sagar@gmail.com");
		   expdata.add("999999999");
		   expdata.add("Selenium");
		   expdata.add("Male");
		   expdata.add("Punjab");
		   expdata.add("Delete");
		  
		   pagelog().info(" expected data ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		   
		    pagelog().info("actual data  ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info("Heading is matched");
				return true;
			}else{
				
				pagelog().info("Heading is not matched");
				return false;
			}
		    
	}
	
	public boolean verifyThirdRow(){
		   pagelog().info(" verifying 3rd Row   ");
		   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyThirdRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("3");
		   expdata.add("Monica");
		   expdata.add("monica@gmail.com");
		   expdata.add("1111111111");
		   expdata.add("Python");
		   expdata.add("Female");
		   expdata.add("Maharashtra");
		   expdata.add("Delete");
		   
		   pagelog().info(" expected data ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		   
		    pagelog().info(" actual data    ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info(" Heading is matched ");
				return true;
			}else{
				
				pagelog().info(" Heading is not matched ");
				return false;
			}
		   
	}
	
  
	public boolean verifyFourthRow1(){
		   pagelog().info(" verifying  4th Row   ");
    	   driver.get("file:///D:/Offline%20website/pages/examples/users.html");
		   List<WebElement>list =verifyFourthRow;
		   ArrayList<String>expdata=new ArrayList<String>();
		   expdata.add("4");
		   expdata.add("Kimaya");
		   expdata.add("kimaya@gmail.com");
		   expdata.add("999999999");
		   expdata.add("PHP");
		   expdata.add("Female");
		   expdata.add("Punjab");
		   expdata.add("Delete");
		 
		   pagelog().info(" expected data  ");
		   ArrayList<String>actualdata =new ArrayList<String>();
		   for(WebElement element :list){
		    	actualdata.add(element.getText());
		    }
		  
		    pagelog().info(" actual data   ");
		    if(actualdata.equals(expdata)){
				
				pagelog().info(" Heading is matched ");
				return true;
			}else{
				
				pagelog().info(" Heading is not matched ");
				return false;
			}
		    
    }
 
	public boolean logOut(){
		pagelog().info(" Logout message   ");
    	driver.get("file:///D:/Offline%20website/pages/examples/users.html");
    	WebElement actualdata =logOut;
    	//System.out.println(actualdata);
    	pagelog().info(" actual data   ");
    	String actualHeading =actualdata.getText();
    	String expdata="LOGOUT";
    	if(actualHeading.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info("Heading is not matched  ");
			return false;
		}
    	
    }	
    
    public boolean logOutMsg(){
    	pagelog().info(" Logout message Log   ");
		driver.get("file:///D:/Offline%20website/pages/examples/logout.html");
		WebElement actualdata =logOutMsg;
		
		pagelog().info(" actual data ");
		String actualHeading=actualdata.getText();
		String expdata ="Logout successfully";
		if(actualHeading.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
		
    }
    
    public boolean addUserHeaders(){
    	pagelog().info(" Headers for adding Users   ");
    	driver.get("file:///D:/Offline%20website/pages/examples/add_user.html");
    	List<WebElement>list =addUserHeaders;
    	ArrayList<String>expdata =new ArrayList<String>();
    	expdata.add("Username");
    	expdata.add("Mobile");
    	expdata.add("Email");
    	expdata.add("Courses");
    	expdata.add("Gender");
    	expdata.add("State");
    	expdata.add("Password");
    	
    	pagelog().info(" expected data ");
    	ArrayList<String>actualdata=new ArrayList<String>();
    	for(WebElement element: list){
    		actualdata.add(element.getText());
    	}
    	
    	pagelog().info(" actual data ");
    	if(actualdata.equals(expdata)){
			
			pagelog().info("Heading is matched");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
    	
    }
   
    public boolean verifyFirstDeleteButton(){
    	pagelog().info(" verifying 1st Delete button  ");
    	driver.get("file:///D:/Offline%20website/pages/examples/users.html#");
    	verifyFirstDeleteButton.click();
        Alert al= driver.switchTo().alert();
    	String actualdata =al.getText();
    	
    	pagelog().info("  actual data  ");
    	String expdata="You can not delete Default User";
    	al.accept();
    	if(actualdata.equals(expdata)){
			
			pagelog().info(" Heading is matched ");
			return true;
		}else{
			
			pagelog().info(" Heading is not matched ");
			return false;
		}
    	
    }
   
   
}
