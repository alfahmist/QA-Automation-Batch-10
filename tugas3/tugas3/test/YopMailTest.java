package tugas3.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tugas3.pages.InboxPage;
import tugas3.pages.LoginPage;

// Yopmail
// input automationtest as email
// Switch Iframe
// getText
// sysout content of inbox
public class YopMailTest extends BaseTest {


	int pageNum = 2; // page keberapa ?
	String username = "automationtest";
	By mailID = By.xpath("//div[@id='e_ZwVjBQN0ZQRmZQH2ZQNjZQZjBQL4AN==']//button[@class='lm']");
	By mailTextID = By.xpath("//p[normalize-space()='Professional Assignment For Order']");


	@Test
	public void findMailTest() {
		// TODO Auto-generated method stub
		LoginPage loginPage = new LoginPage(driver);
		InboxPage InboxPage = new InboxPage(driver);

		loginPage.login(username);
		InboxPage.page(pageNum);
		InboxPage.findMail(mailID);
		InboxPage.findText(mailTextID);


		//		automationyopyop
		//		alt.nl-boh0w97y@yopmail.com
		// 		sendemail@yopmail.com
		// 		alt.sm-7opp81st@yopmail.com
	}
}
