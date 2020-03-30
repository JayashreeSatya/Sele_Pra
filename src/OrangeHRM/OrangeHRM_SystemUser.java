package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_SystemUser {
	WebDriver driver;
	
	public OrangeHRM_SystemUser()
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//b[text()='Admin']")
	static
	WebElement Admin;
	@FindBy(xpath="//input[@name='searchSystemUser[userName]']")
	static
	WebElement Username;
	@FindBy(id="searchSystemUser_userType")
	static
	WebElement UserRole;	
	@FindBy(xpath="//input[@name='searchSystemUser[employeeName][empName]']")
	static
	WebElement EmployeName;	
	@FindBy(id="searchSystemUser_status")
	static
	WebElement Status;	
	@FindBy(xpath="//input[@value='Search']")
	static 
	WebElement Search;	
	

	
	
	public static void SelectUserRole() {
		Select sct = new Select(UserRole);
		sct.selectByVisibleText("Admin");
	}

	public static void SelectStatus() {
		Select sct1 = new Select(Status);
		sct1.selectByVisibleText("Disabled");
	}

	public static void UserSearch() throws InterruptedException {
		Admin.click();
		Username.sendKeys("Jayashree Sahoo");
		SelectUserRole();
		EmployeName.sendKeys("Jayashree Sahoo");
		Thread.sleep(3000);
		SelectStatus();
		Search.click();
		
	}
	
	

}
