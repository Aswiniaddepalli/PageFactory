package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;

public class LoginTestCases {
  @Test
  public void Login() {
	  WebDriver driver=new ChromeDriver();
	  System.out.println("This is Aswini's code commit");
	  System.out.println("Adding a new line of code to trigger build");
	  driver.navigate().to("http://adactinhotelapp.com");
	  LoginPage obj=PageFactory.initElements( driver,LoginPage.class);
	  obj.username("ashwiniaddepalli");
	  obj.password("Y765N8");
	  obj.Login();
	  System.out.println("The Test is done");
  }
}
