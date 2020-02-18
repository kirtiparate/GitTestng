package start.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test 
  public void f() {
	  
	System.out.println("welcome");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am good");
  }
  @Test 
  public void i() {
	  
	System.out.println("welcome for i");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("... b t ....I am kittu");
  }
  
   @AfterTest
  public void afterTest() {
	  System.out.println("a..t  how r u");
  }
   
   @AfterMethod
   public void afterMethod() {
 	  System.out.println("8888888");
   }


}
