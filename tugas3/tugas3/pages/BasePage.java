package tugas3.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;


	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void switchIframe(String locator) {
		driver.switchTo().frame(locator);
	}

	public void outIFrame() {
		driver.switchTo().defaultContent();
	}

	public void setText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void waitAndClick(By locator) {
		// menunggu halaman selesai refresh
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).click();
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

}
