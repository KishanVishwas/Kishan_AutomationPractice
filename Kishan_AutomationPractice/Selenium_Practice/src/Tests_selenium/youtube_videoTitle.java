package Tests_selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class youtube_videoTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();

	        // Open YouTube
	        driver.get("https://www.youtube.com");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);

	        try {
	            // Wait for the "Sign In" button to be clickable
	            WebDriverWait wait = new WebDriverWait(driver, null);
	            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//yt-formatted-string[text()='Sign in']")));

	            // Click on the "Sign In" button
	            signInButton.click();

	            System.out.println("Clicked on Sign In button successfully.");

	        } finally {
	            // Close the browser
	            driver.quit();

	}

	}
}
