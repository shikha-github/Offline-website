package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer  implements IRetryAnalyzer {
	       int count=0;
	       int maxLimit=3;
	       
	       public boolean retry(ITestResult result){
	    	   if (count <maxLimit ){
	    		   System.out.println("Retrying failed test case for count"+count);
	    		   return true;
	    	   }else{
	    		   System.out.println("skip Retrying failed test case as max limit reached as "+maxLimit);
	    		   return false;
	    	   }
	       }
}
