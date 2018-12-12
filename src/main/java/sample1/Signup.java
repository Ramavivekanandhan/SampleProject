package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Signup {
	@Test
	public void Signin()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\One\\My Files\\Syncfusion\\Selenium\\Softwares and Videos-20170829T063803Z-001\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control")).sendKeys("Ram");
		driver.findElement(By.name("password")).sendKeys("Sibi@2731");
		driver.findElement(By.xpath("//input[@type='submit']"));
		
	}

}
