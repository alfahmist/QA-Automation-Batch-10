package tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	By inputLogin = By.xpath("//input[@id='login']");
	By buttonLogin = By.xpath("//button[@title='Check Inbox @yopmail.com']");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String username) {
		setText(inputLogin, username);
		waitAndClick(buttonLogin);
	}

}
