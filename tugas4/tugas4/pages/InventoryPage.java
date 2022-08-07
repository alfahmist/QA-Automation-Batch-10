package tugas4.pages;

import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

	private By cartButton = By.xpath("//a[@class='shopping_cart_link']");
	private By backpackItem = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	private By tshirtItem = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	private HashSet<By> items = new HashSet<By>();
	public InventoryPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void buySomeItems() {
		items.add(backpackItem);
		items.add(tshirtItem);

		addToCart();
		click(cartButton);
	}

	private void addToCart() {
		for (By item : items) {
			click(item);
		}
	}

}



//	private void addItems(HashSet<String> items) {
//		for (String item : items) {
//			click(By.xpath(item));
//		}
//	}

//}
