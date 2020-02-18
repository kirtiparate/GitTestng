package start.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGUsingDriver {
	WebDriver driver;
     @Parameters("xyz")
	 @BeforeTest
	 public void setup(String Mycomingbrowse) {
		 System.out.println(Mycomingbrowse);
		 
		if(Mycomingbrowse.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		 driver = new ChromeDriver ();
		 }
		 
		 else if (Mycomingbrowse.equals("firefox")){
			 System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
			 driver = new FirefoxDriver();
			  }
		 else if (Mycomingbrowse.equals("ie")){
			 System.setProperty("webdriver.ie.driver", "resource/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			  }
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	   
     }	 
	@Test public void LoginMethod() {
		 
		 WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("kirtiparate555@gmail.com");
		 
		 WebElement password = driver.findElement(By.id("pass"));
		 password.sendKeys("12345");
		 
		 WebElement login = driver.findElement(By.id("loginbutton"));
		 login.click();
		  }
	 
	@AfterTest public void tearDown() {
		 
		 try {
			 Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		 driver.quit();
		 
	 }
	 }

	 
	 

