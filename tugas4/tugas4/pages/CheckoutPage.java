package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BasePage {

	private By firstName = By.xpath("//input[@id='first-name']");
	private By lastName = By.xpath("//input[@id='last-name']");
	private By postalCode = By.xpath("//input[@id='postal-code']");
	private By continueButton = By.xpath("//input[@id='continue']");
	private By finishButton = By.xpath("//button[@id='finish']");
	private By successText = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");

	public CheckoutPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
	}

	public void fillCustomerInformation(String fName, String lName, String postalCode) {
		inputCustomer(fName, lName, postalCode);
		clickContinue();
		clickFinish();
	}

	private void inputCustomer(String fName, String lName, String pCode) {
		setText(firstName, fName);
		setText(lastName, lName);
		setText(postalCode, pCode);
	}

	private void clickContinue() {
		click(continueButton);
	}

	private void clickFinish() {
		click(finishButton);

	}

	public String getSuccessText() {
		return getText(successText);
	}
}
