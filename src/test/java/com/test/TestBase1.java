package com.test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.OperatorPaage;
import com.pages.UsefullLinkPage;
import com.pages.UserPage;


public class TestBase1 {
	public static WebDriver driver;
	public static LoginPage page=null;
	public static  DashBoardPage ds=null;
	public static UserPage up=null;
	public static OperatorPaage op=null;
	public static UsefullLinkPage ulp=null;
	//public static DownloadPaage dp=null;
	public static Logger log=null;
	//
	public static WebDriver initialization() throws Exception{
		log=Logger.getLogger(TestBase1.class);
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("file:///D:/New%20Folder%20(2)/Offline%20website/pages/examples/dashboard.html");
	FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
	  Properties property = new Properties();
	    property.load(fis);
	driver.get(property.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
	
	
}
