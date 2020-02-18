package start.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class TestClass 
{
 @Test
  public void method ()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4444/grid/console");
        driver.quit();
    }
}
