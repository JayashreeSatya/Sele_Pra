 package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM_TestPage {
	WebDriver driver;
	@BeforeSuite
	public void PreCondtion()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree\\Downloads\\Video\\ChromeServer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		PageFactory.initElements(driver, OrangeHRM_LoginPage.class);
		PageFactory.initElements(driver, OrangeHRM_SystemUser.class);
	}
	
	@Test(priority=1)
	public void test()
	{
////		OrangeHRM_LoginPage login= new OrangeHRM_LoginPage();
////		login.Login();
		OrangeHRM_LoginPage.Login();
	}
	
	@Test(priority=2)
		public void test1() throws InterruptedException
		{
		
		OrangeHRM_SystemUser.UserSearch();
		}
	
	
	
	@AfterSuite
	public void PostCondtion()
	{
		driver.close();
	}
}
