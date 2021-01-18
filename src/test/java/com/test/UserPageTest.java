package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.pages.UserPage;

public class UserPageTest {


WebDriver driver;
	UserPage page;
	
	public Logger log ;
	public Logger testLog(){
		log= Logger.getLogger(this.getClass());
		String path =(System.getProperty("user.dir")+"/log4jTest.properties");
		PropertyConfigurator.configure(path);
		return log;
		 
	}
	
	@BeforeMethod
	public void openBrowser(){
		 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("file:///D:/Offline%20website/index.html");
		   page =new UserPage(driver);
		   
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
}
	@Test(priority=1)
	public void verifymainHeading(){
		testLog().info(" verifying main Heading");
		Assert.assertTrue(page.mainHeading());
	}
	@Test(priority=2)
	public void addUserButton(){
		testLog().info("addUserbutton");
		Assert.assertTrue(page.addUserButton());
	}
	@Test(priority=3)
	public void verifytable1(){
		testLog().info("verfying table1");
		Assert.assertTrue(page.table1());
	}
	@Test(priority=4)
	public void verifytable2(){
		testLog().info("verifying table2");
		Assert.assertTrue(page.table2());
	}
	@Test(priority=5)
	public void verifytable3(){
		testLog().info("verifying table3");
		Assert.assertTrue(page.table3());
	}
	@Test(priority=6)
	public void verifytable4(){
		testLog().info("verifying table4");
		Assert.assertTrue(page.table4());
	}
	@Test(priority=7)
	public void verifytable5(){
		testLog().info("verifying table5");
		Assert.assertTrue(page.table5());
	}
	@Test(priority=8)
	public void verifytable6(){
		testLog().info("verifying table6");
		Assert.assertTrue(page.table6());
	}
	@Test(priority=9)
	public void verifytable7(){
		testLog().info("verifying table7");
		Assert.assertTrue(page.table7());
	}
	@Test(priority=10)
	public void verifyheader(){
		testLog().info("verifying header");
		Assert.assertTrue(page.verifyHeader());
	}
	@Test(priority=11)
	public void verifyFirstRow(){
		testLog().info("verifying FirstRow");
		Assert.assertTrue(page.verifyFirstRow());
	}
	@Test(priority=12)
	public void verifySecondRow(){
		testLog().info("verifying SecondRow");
		Assert.assertTrue(page.verifySecondRow());
	}
	@Test(priority=13)
	public void verifyThirdRow(){
		testLog().info("verifying ThirdRow");
		Assert.assertTrue(page.verifyThirdRow());
	}
	@Test(priority=14)
	public void verifyFourthRow(){
		testLog().info("verifying FourthRow");
		Assert.assertTrue(page.verifyFourthRow1());
	}
	@Test(priority=15)
	public void verifyLogout(){
		testLog().info("verifying Logout");
		Assert.assertTrue(page.logOut());
	}
	@Test(priority=16)
	public void verifylogOutMsg(){
		testLog().info("verifying logOutMsg");
		Assert.assertTrue(page.logOutMsg());
	}
	@Test(priority=17)
	public void verifyaddUserHeaders(){
		testLog().info(" verifying addUser Headers");
		Assert.assertTrue(page.addUserHeaders());
	}
	@Test(priority=18)
	public void verifyFirstDeleteButton(){
		testLog().info("verifying FirstDelete Button ");
		Assert.assertTrue(page.verifyFirstDeleteButton());
	}
	
	
	
}
