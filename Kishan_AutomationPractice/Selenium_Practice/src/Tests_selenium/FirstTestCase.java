package Tests_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
     
	}

}
