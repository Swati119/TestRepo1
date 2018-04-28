package Mavenproject.First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Selenium {

	 WebDriver driver ;
	 	
	       String appUrl = "https://www.google.co.in/";
	
	@Test
	public void gmailLogin() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati\\eclipse-workspace\\First\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	              driver.get(appUrl);	
	              driver.manage().window().maximize();	
	              String actualTitle = driver.getTitle();
	              System.out.println("title is"+actualTitle);		        	
	              driver.close();
	              
	              String url= System.getProperty("url");
	              System.out.println(url+"url is");
	              String username= System.getProperty("username");
	              System.out.println(username+"username is");
	              

	}



}
