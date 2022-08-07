//Go to saucedemo.com
//Input username and password
//Add 2 product
//Checkout and pay
//Please create all of this using POM

package tugas4.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import tugas4.pages.CartPage;
import tugas4.pages.CheckoutPage;
import tugas4.pages.InventoryPage;
import tugas4.pages.LoginPage;

public class SauceDemo extends BaseTest {

	String username = "standard_user";
	String password = "secret_sauce";

	String postalCode = "1289";
	//	HashSet<String> items = new HashSet<String>();

	LoginPage loginPage = new LoginPage(driver, driverWait);
	InventoryPage inventoryPage = new InventoryPage(driver, driverWait);
	CartPage cartPage = new CartPage(driver, driverWait);
	CheckoutPage checkoutPage = new CheckoutPage(driver, driverWait);

	@Test
	public void checkoutTest() {

		loginPage.login(username, password);
		inventoryPage.buySomeItems();
		cartPage.checkout();
		checkoutPage.fillCustomerInformation(username, username, postalCode);

		String actualText = checkoutPage.getSuccessText();
		String expectedText = "THANK YOU FOR YOUR ORDER";

		Assert.assertTrue((actualText).contains(expectedText));
		System.out.println(actualText);
	}

}
