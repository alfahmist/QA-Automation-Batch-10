package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	private By checkoutButton = By.xpath("//button[@id='checkout']");

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void checkout() {
		click(checkoutButton);
	}

}
