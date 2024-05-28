package Tests_selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Scrolldown_up {
	public static void main(String[] args) throws InterruptedException { 
		 
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.seleniumhq.org/download/"); 
		 
		  JavascriptExecutor j = (JavascriptExecutor) driver; 
		   
		  //To scroll down 
		  j.executeScript("window.scrollBy(0,500)"); 
		 
		  Thread.sleep(3000); 
		  //To scroll up 
		  j.executeScript("window.scrollBy(0,-500)"); 
		 
		 }

}
