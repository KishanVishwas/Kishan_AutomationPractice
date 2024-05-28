package Tests_selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("https://3ccaqa.capitaverve.com/overview/workspace");
	
	}

}
