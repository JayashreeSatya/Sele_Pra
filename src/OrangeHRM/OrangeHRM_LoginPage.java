package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_LoginPage {
	
	WebDriver driver;
	
	public OrangeHRM_LoginPage() {
		this.driver=driver;
		
	}
	@FindBy(xpath="//input[@name='txtUsername']")
	static
	WebElement Username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	static
	WebElement Password;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	static
	WebElement btnLogin;

static public void Login()
{
	Username.sendKeys("Admin");
	Password.sendKeys("admin123");
	btnLogin.click();
	
}
	
}


