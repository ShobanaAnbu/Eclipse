package LogIn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LOGIN 
{
	public void login() { 
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.30.13.64:8082");
		/*WebElement username = driver.findElement(By.id("j_username"));
		WebElement password = driver.findElement(By.name("j_password"));
		WebElement login = driver.findElement(By.name("Submit"));
		username.sendKeys("pratian");
		password.sendKeys("password@123");
		login.click();
		String actualUrl = "http://172.30.13.64:8082";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);*/
	}
}