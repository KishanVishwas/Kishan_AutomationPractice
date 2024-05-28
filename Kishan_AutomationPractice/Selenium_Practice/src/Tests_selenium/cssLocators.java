package Tests_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252Faccount%26feature%3Dredirect_login&hl=en&ifkv=AaSxoQzmcOSI81XzRusPohIDWIvALGpwhUCZgNwS6hSoauyG1DxnenjySFZxMoJa2MUc9xdbYpwD&passive=true&service=youtube&uilel=3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S705536592%3A1715771426247218&ddm=0");
		driver.manage().window().maximize();
//		WebElement signin = driver.findElement(By.xpath("//div[text()='true']"));
//		signin.click();
//		Actions action=new Actions(driver);
//		action.click().build().perform();
		Thread.sleep(2000);
		 driver.findElement(By.id("identifierId")).sendKeys("kishanshetty312@gmail.com")	;
	    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Kv@br312");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElements(By.id("video-title"));
		String text = driver.getTitle();
	}

}
