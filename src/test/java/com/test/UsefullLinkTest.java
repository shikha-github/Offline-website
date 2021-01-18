package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.pages.UsefullLinkPage;

public class UsefullLinkTest {

	WebDriver driver;
	UsefullLinkPage up = null;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		up = new UsefullLinkPage(driver);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 1)
	public void verifyMainHeading() {
		Assert.assertTrue(up.mainHeading());
	}

	@Test(priority = 2)
	public void verifysubHeading() {
		Assert.assertTrue(up.subHeading());
	}

	@Test(priority = 3)
	public void verifyheading() {
		Assert.assertTrue(up.heading());
	}

	@Test(priority = 4)
	public void verifyinterviewQues() {
		Assert.assertTrue(up.interviewQues());
	}

	@Test(priority = 5)
	public void verifytable1() {
		Assert.assertTrue(up.table1());
	}

	@Test(priority = 6)
	public void verifytable2() {
		Assert.assertTrue(up.table2());
	}

	@Test(priority = 7)
	public void verifytable4() {
		Assert.assertTrue(up.table4());
	}

}
