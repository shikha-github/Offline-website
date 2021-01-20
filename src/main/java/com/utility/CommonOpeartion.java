package com.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonOpeartion {
	public static WebDriver driver;
	public static int num;
public static void click11(WebElement element){
	element.click();
}

public static List<String> actualListOfPersons(){
	
	 ArrayList<String> actual=new ArrayList<String>();
	 String uname = driver.findElement(By.xpath("//tr["+num+"]/td[2]")).getText();//tr[2]/td[2]
     actual.add(uname);
     System.out.println("Person name:  "+uname);
	return actual;
}

public static void windowsHandler() {
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		
		while(I1.hasNext())
			{

			String child_window=I1.next();
	
			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			String act  = driver.switchTo().window(child_window).getCurrentUrl();
			System.out.println(act);
			
			} 
		}		
	}

}
