package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://selenium drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.firefox.marionette", "C://selenium drivers//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	    driver.manage().window().maximize();
		System.out.println("Hii!!!! congratulations!!! setup has done... Facebook is opened");
		System.out.println("github updated");
		System.out.println("github updated...");
		driver.close();
		
		
		

	}

}
