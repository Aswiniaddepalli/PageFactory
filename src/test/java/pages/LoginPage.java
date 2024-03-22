package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(id = "username")WebElement usname;
//	@FindBy(id="password")WebElement pass;
//	@FindBy(id="login")WebElement log;
	@FindAll({
		@FindBy(id = "username"),
		@FindBy(id="password"),
		
	})WebElement usname, pass,log;
	public void username(String usern) {
	usname.sendKeys(usern);
	}
	public void password(String passw) {
		pass.sendKeys(passw);
	}
	public void Login() {
		log.click();
	}
	/*
	 * @FindBys({
	 * 
	 * @FindBy(id="username"),
	 * 
	 * @FindBy(id="password")})WebElement uname,password;
	 * 
	 * @FindAll({
	 * 
	 * @FindBy(id="username"),
	 * 
	 * @FindBy(id="password") }) WebElement unamew,passwordd;
	 */
	/*
	 * By uname=By.id("username"); By password=By.id("password"); By
	 * login=By.id("login"); By location_Dropdown=By.id("location");
	 */

}
