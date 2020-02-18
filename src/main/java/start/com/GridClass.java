package start.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridClass {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		 
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.43.136:4444/wd/hub"), capabilities);
		driver.get("https://www.facebook.com/");
		
		WebElement username=driver.findElement(By.id("email"));
    	username.sendKeys("Kirtiparate@gmail.com");
    	
    	WebElement password=driver.findElement(By.id("pass"));
    	password.sendKeys("12345");
    	
    	WebElement loginButn=driver.findElement(By.id("loginbutton"));
    	loginButn.click();
    	
    	driver.quit();
    	}

}
