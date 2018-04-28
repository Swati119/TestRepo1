package Mavenproject.First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Selenium2 {

	 WebDriver driver ;
	 	
	       String appUrl = "http://toolsqa.com/selenium-webdriver/testng-testcase/";
	
	@Test
	public void gmailLogin() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati\\eclipse-workspace\\First\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	              driver.get(appUrl);	
	              driver.manage().window().maximize();	
	              String actualTitle = driver.getTitle();
	              System.out.println("title is"+actualTitle);		        	
	              driver.close();

	}



}
