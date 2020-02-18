package start.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4444/grid/console");
        driver.quit();
    }
}
