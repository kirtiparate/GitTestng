package start.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyTestWithMain {
  WebDriver driver;
	public static void main(String[] args) {
		MyTestWithMain obj = new MyTestWithMain();
		obj.setup();
		obj.loginMethod();
		obj.tearDown();	
		
	}
	public void setup()
	{
     System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
     driver = new ChromeDriver ();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
	}
    public void loginMethod()

     {
    	 WebElement username = driver.findElement(By.id("email"));
    	 username.sendKeys("kittu123@yahoo.com");
    	 
    	 WebElement password = driver.findElement(By.id("pass"));
    	 password.sendKeys("12345");
    	 
    	 WebElement loginbtn = driver.findElement(By.id("loginbutton"));
    	 loginbtn.click();
    	 
     } 
    public void tearDown() 
    {
   try  {
    	 Thread.sleep(3000);
     }catch (InterruptedException e) {
		e.printStackTrace();
	}
    	 
    driver.quit();
    
    
     }
}

