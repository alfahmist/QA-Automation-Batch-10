package tugas3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage extends BasePage {

	By buttonNext = By.xpath("//button[@title='Next']");

	String ifInbox = "ifinbox";
	String ifMail = "ifmail";


	public InboxPage(WebDriver driver) {
		super(driver);

	}

	public void page(int p) {

		for (int i = 1; i < p; i++) {
			try {
				click(buttonNext);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void findMail(By id) {

		switchIframe(ifInbox);
		waitAndClick(id);
		outIFrame();
	}

	public void findText(By textId) {
		switchIframe(ifMail);
		System.out.println(getText(textId));
	}

}
