package objectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageReposatory {
	@FindBy(xpath="//td[4]") //td[6]
	public List<WebElement> contacts1;
	@FindBy(xpath="//td[6]") //td[6]
	public List<WebElement> time1 ;
	@FindBy(xpath="//span[text()='     Useful Links']")
	public WebElement usefullinkclick;
}
