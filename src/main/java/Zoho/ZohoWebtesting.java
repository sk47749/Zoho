package Zoho;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ZohoWebtesting {

	public static WebDriver driver;
	
	
	public void urllaunch(String url) {

		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse\\zohoAutomation\\webdriver 111\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
	}

}