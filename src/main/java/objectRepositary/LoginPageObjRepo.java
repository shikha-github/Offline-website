package objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjRepo {
	@FindBy(id = "email")
	public WebElement weUserName;

	@FindBy(id = "password")
	public WebElement wePasswd;

	@FindBy(xpath = "//button")
	public WebElement weSubmit;

	@FindBy(xpath = "//b[text()='Java By Kiran']")
	public WebElement Heading;

	@FindBy(xpath = "//h4")
	public WebElement SubHeading;

	@FindBy(xpath = "//img")
	public WebElement logo;

	@FindBy(id = "email_error")
	public WebElement actEmailErrorMsg;

	@FindBy(id = "password_error")
	public WebElement actPassErrorMsg;

	@FindBy(id = "email_error")
	public WebElement actBlankEmailErrorMsg;

	@FindBy(id = "password_error")
	public WebElement actBlankPassErrorMsg;

	@FindBy(xpath = "//a[@class='text-center']")
	public WebElement regLink;

	@FindBy(name = "name")
	public WebElement newmembername;

	@FindBy(name = "mobile")
	public WebElement mobile;

	@FindBy(name = "email")
	public WebElement enterEmail;

	@FindBy(name = "password")
	public WebElement enterPassword;

	@FindBy(xpath = "//button")
	public WebElement regButton;
	
	
	

}