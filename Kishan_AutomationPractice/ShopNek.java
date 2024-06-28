package TestPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopNek {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://shopnek.com/");
        Thread.sleep(2000); 

       
        WebElement dropdownElement = driver.findElement(By.xpath("//p[@class='text-sm' and text()='925 Silver']"));
        Actions act = new Actions(driver);
        act.moveToElement(dropdownElement).perform();
        Thread.sleep(2000); 

       
        List<WebElement> options = driver.findElements(By.xpath("//p[@class='text-sm' and text()='925 Silver']"));
       
       
        List<String> actualOptions = new ArrayList<>();
        for (WebElement option : options) {
            actualOptions.add(option.getText());
        }

        
        List<String> expectedOptions = new ArrayList<>();
        expectedOptions.add("925 Silver");
        expectedOptions.add("Budget friendly finds");
        expectedOptions.add("Under Rs 10000");
        expectedOptions.add("Under Rs 20000");
        
        if(actualOptions==expectedOptions)
        {
        	System.out.println("options are matched");
        }
        else
        {
        	System.out.println("Options are not matched");
        }

    
       System.out.println(actualOptions);
       System.out.println(expectedOptions);
        
        driver.quit();
    }
}
