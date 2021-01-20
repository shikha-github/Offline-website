package com.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BasePage {
   
	public Logger log ;
	
	public Logger pagelog(){
		 log= Logger.getLogger(this.getClass());
		String path =(System.getProperty("user.dir")+"/log4jPage.properties");
		PropertyConfigurator.configure(path);
		return log;
		 
	}
}
