package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class BaseTest {
	
	WebDriver driver;
	
	public void openBrowser(String bType)
	{
		if(bType.equals("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(bType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\Shilpa\\\\Selenium\\\\Selenium Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(bType.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Shilpa\\Selenium\\Selenium Driver\\edgedriver_win32\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void navigate(String urlkey)
	{
		driver.get(urlkey);
	}
	
	public void click(String locatorkey)
	{
		driver.findElement(By.xpath(locatorkey)).click();
	}
	
	public void type(String locatorkey, String email)
	{
		driver.findElement(By.xpath(locatorkey)).sendKeys(email);
	}
	
	public boolean verifyTitle()
	{
		return false;
	}
	
	public void reportPass()
	{
		//test.log(LogStatus.PASS, msg);
	}
	
	public void reportFailure(String msg) {
       //		test.log(LogStatus.FAIL, msg);
		Assert.fail(msg);
	}
	

}
