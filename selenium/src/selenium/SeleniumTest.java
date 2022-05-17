package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private WebDriver driver;
	
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/Users/SAMSUNG/Desktop/devtools/chromedriver.exe";
	
	private String base_url;
	
	public SeleniumTest() {
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		driver = new ChromeDriver();
		base_url = "https://www.naver.com";
	}
	
	public void crawl() {
		driver.get(base_url);
		System.out.println(driver.getPageSource());
	}
	
	public static void main(String[] args) {
		new SeleniumTest().crawl();
	}
}
