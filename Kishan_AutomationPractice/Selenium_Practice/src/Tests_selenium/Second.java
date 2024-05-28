package Tests_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Second {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Corrected URL with the protocol included
        driver.get("https://www.google.com");
        driver.close();
    }
}

