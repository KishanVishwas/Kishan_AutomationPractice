package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopNeklogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://shopnek.com/");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")
			).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")
				).sendKeys("9611055312");
		
	}

}
