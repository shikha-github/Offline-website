package objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefullLinkRepository {

	@FindBy(xpath = "//h1")
	public WebElement mainHeading;

	@FindBy(xpath = "//tr[1]")
	public WebElement heading;

	@FindBy(xpath = "//h3[@class='box-title']")
	public WebElement subHeading;

	@FindBy(xpath = "//td[1]")
	public WebElement table1;

	@FindBy(xpath = "//td[2]")
	public WebElement table2;

	@FindBy(xpath = "//td[3]")
	public WebElement table4;

}
