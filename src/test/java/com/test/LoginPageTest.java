package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginPageTest {
	WebDriver driver;
	LoginPage lgn = null;
	
	@BeforeMethod
	public void openBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/Offline%20website/Offline%20website/index.html");
	lgn = new LoginPage(driver);
}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyTitle(){
		Assert.assertTrue(lgn.verifyTitle());

	}
	@Test(priority=2)
	public void loginCorrectData() {
		Assert.assertTrue(lgn.loginCorrectData());
	}
	
	@Test(priority=3)
	public void checkErrorMail() {
		Assert.assertTrue(lgn.checkErrorMail());
	}
	
	@Test(priority=4)
	public void checkErrorpasswd() {
		Assert.assertTrue(lgn.checkErrorpasswd());
	}
	
	@Test(priority=5)
	public void verifyHeading() {
		Assert.assertTrue(lgn.verifyHeading());
	}
	
	@Test(priority=6)
	public void verifySubHeading() {
		Assert.assertTrue(lgn.verifySubHeading());
	}
	
	@Test(priority=7)
	public void verifylogo() {
		Assert.assertTrue(lgn.verifylogo());
	}
			
	@Test(priority=8)
	public void checkBlankEmailError() {
	Assert.assertTrue(lgn.checkBlankEmailError());
	
	}
	@Test(priority=9)
	public void checkBlankPasswordError() {
		Assert.assertTrue(lgn.checkBlankPasswordError());	
		
	}
	@Test(priority=10)
	public void verifyRegNewMemLink() {
		Assert.assertTrue(lgn.verifyRegNewMemLink());
	}
	
	@Test(priority=11)
	public void registerNewMember() {
		Assert.assertTrue(lgn.registerNewMember());
		
	}
}