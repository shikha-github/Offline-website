package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import objectRepository.UsefullLinkRepository;


public class UsefullLinkPage extends UsefullLinkRepository {

	WebDriver driver = null;

	public UsefullLinkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean mainHeading() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		WebElement actualdata = mainHeading;
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "Useful Links";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
		// Assert.assertEquals(actualTitle, expTitle);
	}

	public boolean subHeading() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		WebElement actualdata = subHeading;
		System.out.println(actualdata);
		String actualTitle = actualdata.getText();
		String expTitle = "* Internet Required";
		if (actualTitle.equals(expTitle)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
		// Assert.assertEquals(actualTitle, expTitle);
	}

	public boolean heading() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		List<WebElement> list = driver.findElements(By.xpath("//th"));
		ArrayList<String> expdata = new ArrayList<String>();
		expdata.add("Sr");
		expdata.add("Content");
		expdata.add("Click");

		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : list) {
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if (actualdata.equals(expdata)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
		// Assert.assertEquals(actualdata,expdata);

	}

	public boolean interviewQues() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		String mainWindow = driver.getWindowHandle();
		for (int i = 2; i <= 7; i++) {
			WebElement vendor = driver.findElement(By.xpath("//tr[" + i + "]/td[2]"));
			String text = vendor.getText();
			if (text.contains("Interview "))
				;

			WebElement link = driver.findElement(By.xpath("//tr[" + i + "]/td[3]/a"));
			link.click();
			Set<String> allwindows = driver.getWindowHandles();
			for (String window1 : allwindows) {
				if (window1.equals(mainWindow)) {
					driver.switchTo().window(window1);
					System.out.println("new window url:" + driver.getCurrentUrl());
					System.out.println("new window url is:" + driver.getCurrentUrl());
				}
			}
		}
		return true;
	}

	public boolean table1() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		List<WebElement> list = driver.findElements(By.xpath("//td[1]"));
		ArrayList<String> expdata = new ArrayList<String>();
		expdata.add("01");
		expdata.add("02");
		expdata.add("03");
		expdata.add("04");
		expdata.add("05");
		expdata.add("06");
		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : list) {
			actualdata.add(element.getText());
		}
		System.out.println(actualdata);
		if (actualdata.equals(expdata)) {
			System.out.println("Title matched");
			return true;
		} else {
			System.out.println("Title not matched");
			return false;
		}
		// Assert.assertEquals(actualdata, expdata);

	}

	public boolean table2() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		List<WebElement> list = driver.findElements(By.xpath("//td[2]"));
		ArrayList<String> expdata = new ArrayList<String>();
		expdata.add("Schedule");
		expdata.add("Video Lactures All Topics");
		expdata.add("Selenium Interview Questions");
		expdata.add("Java Interview Questions");
		expdata.add("Courses");
		expdata.add("Placement");
		ArrayList<String> actualdata = new ArrayList<String>();
		for (WebElement element : list) {
			actualdata.add(element.getText());
			//System.out.println(actualdata);
			if (actualdata.equals(expdata)) {
				System.out.println("Title is  matched");
				
			} else {
				System.out.println("Title not matched");

			}
			// Assert.assertEquals(actualdata, expdata);
		}
		return true;
	}

	public boolean table4() {
		driver.get("file:///C:/Users/Admin/Desktop/Offline%20website/pages/examples/links.html");
		WebElement link = driver.findElement(By.xpath("//td[3]"));
		link.click();
		boolean actualdata = link.isSelected();
		// Assert.assertEquals(actualdata, false);
		return true;
	}

}
