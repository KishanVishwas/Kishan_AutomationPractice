package Tests_selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Keka_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://app.keka.com/Account/Login?ReturnUrl=%2FAccount%2FLogout%3FlogoutId%3DCfDJ8FqpALfnMQpJuN2iskteUFwfF20MYVViZWmQmJi3XfMe2DRoPDSN9EF9S3BOsn97hiV_Il71gbbe-t3dIVvxrGt6uDWimVZImr6nH39HP6clf0lo4b0-k4GctN66iGL_-z30bmr1bvplYI5kbawwqRvsX2iTWHVgs_u8wP0YIwbWWjZUwmnXBbzcL9GEoMN3TEYxI1vk64CUPxcV6Zp9rrxdEXn9vuaIhiIptGXExjzLFa7ucx1zJgplDi6yjtezvmnupqPRgY1begrKLkmbVeCsUtwJMoF3kbUnvV9-FSEuqVXnKfwT_8M5brEt6PnBEyOJi7X2t7m8i8s2hmyHU2Y4d6vlkR5-IA8nDDska6ko");
        driver.manage().window().maximize();
        driver.findElement(By.name("UserName")).sendKeys("kishanr@nu10.co");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kv@br312");
        Thread.sleep(2000);
        driver.switchTo().frame("captchaFrame");
        Thread.sleep(2000);
        WebElement captchaElement = driver.findElement(By.id("imgCaptcha"));
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        
	}

}
