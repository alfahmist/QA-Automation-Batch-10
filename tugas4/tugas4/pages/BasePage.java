package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private ThreadLocal<WebDriverWait> driverWait = new ThreadLocal<WebDriverWait>();

	protected BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> driverWait) {
		this.driver = driver;
		this.driverWait = driverWait;
		PageFactory.initElements(driver.get(), this);
	}

	void click(By locator) {
		driver.get().findElement(locator).click();
	}

	void setText(By locator, String text) {
		driver.get().findElement(locator).sendKeys(text);
	}

	String getText(By locator) {
		return driver.get().findElement(locator).getText();
	}

}
