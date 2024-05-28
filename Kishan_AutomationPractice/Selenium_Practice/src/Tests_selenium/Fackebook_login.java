package Tests_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Fackebook_login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("9611055312");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Kv@br312");
        Thread.sleep(2000);
        TakesScreenshot tk = (TakesScreenshot) driver;
        File source = tk.getScreenshotAs(OutputType.FILE);
        File des = new File("F:/facebook.png");
        FileUtils.copyFile(source, des);
        driver.quit();
    }
}
