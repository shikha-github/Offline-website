package objectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageRepository {

	@FindBy(xpath="//section[@class='content-header']//following::h1")
	public WebElement mainHeading;
	
	@FindBy(xpath="//div[@class='box-body table-responsive no-padding']//preceding::button")
	public WebElement addUserButton;
	
	@FindBy(xpath="//tr/td[1]")
	public List<WebElement> table1;
	
	@FindBy(xpath="//tr/td[2]")
	public List<WebElement> table2;
	
	@FindBy(xpath="//tr/td[3]")
	public List<WebElement> table3;
	
	@FindBy(xpath="//tr/td[4]")
	public List<WebElement> table4;
	
	@FindBy(xpath="//tr/td[5]")
	public List<WebElement> table5;
	
	@FindBy(xpath="//tr/td[6]")
	public List<WebElement> table6;
	
	@FindBy(xpath="//tr/td[7]")
	public List<WebElement> table7;
	
	@FindBy(xpath="//th")
	public List<WebElement> verifyHeader;
	
	@FindBy(xpath="//tr[2]/td")
	public List<WebElement> verifyFirstRow;
	
	@FindBy(xpath="//tr[3]/td")
	public List<WebElement> verifySecondRow;
	
	@FindBy(xpath="//tr[4]/td")
	public List<WebElement> verifyThirdRow;
	
	@FindBy(xpath="//tr[5]/td")
	public List<WebElement> verifyFourthRow;
	
	@FindBy(xpath="//li[@class='dropdown user user-menu']//child::a")
	public WebElement logOut;
	
	@FindBy(xpath="//p[@class='login-box-msg']//following::p")
	public WebElement logOutMsg;
	
	@FindBy(xpath="//label[@class='col-sm-3 control-label']")
	public List<WebElement> addUserHeaders;
	
	@FindBy(xpath="//span[text()='Delete']")
	public WebElement verifyFirstDeleteButton;
	
	@FindBy(xpath="//tr[3]/td[8]")
	public WebElement verifySecondDeleteButton;
	
	@FindBy(xpath="//tr[4]/td[8]")
	public WebElement verifyThirdDeleteButton;
	
	@FindBy(xpath="//tr[5]/td[8]")
	public WebElement verifyFourthDeleteButton;
	
	
}
