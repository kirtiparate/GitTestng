package start.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Mytestwithoutmain {
	WebDriver driver;
@BeforeTest
public void setup() 
{
	System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
@Test
public void loginMethod() {
	WebElement username= driver.findElement(By.id("email"));
	username.sendKeys("kirtiparate555@gmail.com");
	
	WebElement password= driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	
	WebElement login= driver.findElement(By.id("loginbutton"));
	login.click();
}
	@AfterTest
	public void tearDown() {
		
		try{
			Thread.sleep(4000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

	
	

}
