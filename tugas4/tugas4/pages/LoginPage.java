package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void login(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		click(loginButton);
	}
}
