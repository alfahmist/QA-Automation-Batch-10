package tugas4.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> driverWait = new ThreadLocal<WebDriverWait>();
	private String baseUrl = "https://www.saucedemo.com/";

	@BeforeTest
	void setUp() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--headless", "--disable-gpu", "--windows-size=1920,1200");
		driver.set(new ChromeDriver(options));
		driver.get().manage().window().maximize();
		driverWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
		driver.get().get(baseUrl);
	}

	@AfterTest
	void tearDown() {
		// TODO Auto-generated method stub
		driver.get().quit();
	}
}
