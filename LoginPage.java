package com.jbk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.LoginPageObjRepo;

public class LoginPage extends LoginPageObjRepo {
	WebDriver driver;

	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean verifyTitle() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "JavaByKiran | Log in";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is matched");
			return true;
		} else {
			System.out.println("Title is not matched");
			return false;
		}
	}
	public DashboardPage logindata() {
	 weUserName.sendKeys("kiran@gmail.com");
		wePasswd.sendKeys("123456");
		weSubmit.click();
		return  new DashboardPage(driver);
	}
	
	public boolean loginCorrectData() {

		weUserName.sendKeys("kiran@gmail.com");
		wePasswd.sendKeys("123456");
		weSubmit.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "JavaByKiran | Dashboard";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title is matched");
			return true;
		} else {
			System.out.println("Title is not matched");
			return false;
		}
	}

	public boolean checkErrorMail() {
		weUserName.sendKeys("abcd@gmail.com");
		weSubmit.click();
		String actualMail = actEmailErrorMsg.getText();
		String expectedMail = "Please enter email as kiran@gmail.com";
		if (actualMail.equals(expectedMail)) {
			System.out.println("Heading is matched");
			return true;
		} else {
			System.out.println("Heading is not matched");
			return false;
		}
	}

	public boolean checkErrorpasswd() {
		wePasswd.sendKeys("12345");
		weSubmit.click();
		String actualPass = actPassErrorMsg.getText();
		String expectedPass = "Please enter password 123456";

		if (actualPass.equals(expectedPass)) {
			System.out.println("Password is matched");
			return true;
		} else {
			System.out.println("Password is not matched");
			return false;
		}
	}

	public boolean verifyHeading() {
		String actualHeading = Heading.getText();
		String expectedHeading = "Java By Kiran";
		if (actualHeading.equals(expectedHeading)) {
			System.out.println("Heading is matched");
			return true;
		} else {
			System.out.println("Heading is not matched");
			return false;
		}

	}

	public boolean verifySubHeading() {
		String actualSubHeading = SubHeading.getText();
		String expectedSubHeading = "JAVA | SELENIUM | PYTHON";
		if (actualSubHeading.equals(expectedSubHeading)) {
			System.out.println("Heading is matched");
			return true;
		} else {
			System.out.println("Heading is not matched");
			return false;
		}

	}

	public boolean verifylogo() {
		boolean actuallogo = logo.isDisplayed();
		if (true) {
			System.out.println("Image displayed");
			return true;
		} else {
			System.out.println("Image not matched");
			return false;
		}
	}

	public boolean checkBlankEmailError() {
		weUserName.sendKeys("");
		weSubmit.click();
		String actMsg = actBlankEmailErrorMsg.getText();
		String expMsg = "email_error";
		if (actMsg.equals(expMsg)) {
			System.out.println("Error msg matched");
			return false;
		} else {
			System.out.println("Error msg not matched");
			return true;
		}
	}

	public boolean checkBlankPasswordError() {
		wePasswd.sendKeys("");
		weSubmit.click();
		String actMsg = actBlankPassErrorMsg.getText();
		String expMsg = "password_error";

		if (actMsg.equals(expMsg)) {
			System.out.println("Error password matched");
			return false;
		} else {
			System.out.println("Error password not matched");
			return true;
		}
	}

	public boolean verifyRegNewMemLink() {
		regLink.click();
		if (true) {
			System.out.println("Link is correct");
			return true;
		} else {
			System.out.println("Link is not correct");
			return false;
		}
	}
	

	public boolean registerNewMember() {
		regLink.click();
		newmembername.sendKeys("shikha");
		mobile.sendKeys("7020690951");
		enterEmail.sendKeys("shikha@gmail.com");
		enterPassword.sendKeys("654321");
		regButton.click();

		Alert al = driver.switchTo().alert();
		String actMsg = al.getText();
		al.accept();
		String expMsg = "User registered successfully.";
		if (actMsg.equals(expMsg)) {
			System.out.println("Registered successfully");
			return true;
		} else {
			System.out.println("Not registered successfully");
			return false;
		}
	}
}
