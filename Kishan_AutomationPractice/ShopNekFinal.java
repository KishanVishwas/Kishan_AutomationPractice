import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.awt.SystemColor.window;

public class ShopNekFinal {

    public static class TestNFrameworkBirthstone1 {
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeClass
        public void setupOfchromedriver1() {
            // Set the ChromeDriver path
            //System.setProperty("webdriver.chrome.driver", "/Users/kishanr/Documents/Drivers/ChromeDriver/chromedriver-mac-arm64 4/chromedriver");
            // Initialize the ChromeDriver
            driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            // Initialize WebDriverWait with a timeout of 70 seconds
            wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        }

        @Test(priority = 1)
        public void launchingBrowser1() throws InterruptedException {
            driver.get("https://staging.shopnek.com/");
            Thread.sleep(5000);  // This is generally not recommended. Use wait conditions instead.
        }

        @Test(priority = 2)
        public void clickBirthStones1() throws InterruptedException {
            // Clicking through the Birthstones flow
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='text-sm' and text()='Birthstones']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type,'button') and contains(text(), 'Find yours today')]"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name' and @spellcheck='false' and  @type='text']"))).sendKeys("Kishan R");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'bg-teal-gradient') and text()='Next']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='birthstone-option' and text()='Male']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and contains(@class, 'bg-teal-gradient') and text()='Next']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='day' and @name='day' and @placeholder='DD']"))).sendKeys("27");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@inputmode='numeric' and @id='month' and @placeholder='MM' and @maxlength='2']"))).sendKeys("07");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@inputmode='numeric' and @id='year' and @placeholder='YYYY' and @maxlength='4']"))).sendKeys("2000");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'bg-teal-gradient') and text()='Next']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='City name' and @spellcheck='false' and @type='string']"))).sendKeys("Bengaluru, Karnataka");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='text-white font-medium text-sm']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and text()='Next']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='birthstone-option' and text()='Growth in career']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and text()='Next']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'birthstone-option') and @name='phoneNumber']"))).sendKeys("9611055312");
            Thread.sleep(5000);  // Again, this is generally not recommended. Use wait conditions instead.
            driver.findElement(By.xpath("//button[@type='button']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[@class='text-[#94A4A7] text-sm underline text-center cursor-pointer']")).click();
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000);");
            Thread.sleep(3000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Back to top']"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to Bag']"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Go to Bag']"))).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='z-0 group relative inline-flex items-center justify-center box-border appearance-none select-none whitespace-nowrap font-normal subpixel-antialiased overflow-hidden tap-highlight-transparent outline-none data-[focus-visible=true]:z-10 data-[focus-visible=true]:outline-2 data-[focus-visible=true]:outline-focus data-[focus-visible=true]:outline-offset-2 min-w-20 text-small gap-2 [&>svg]:max-w-[theme(spacing.8)] data-[pressed=true]:scale-[0.97] transition-transform-colors-opacity motion-reduce:transition-none data-[hover=true]:opacity-hover rounded-full bg-primary-default h-12 text-white px-9']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']")).sendKeys("Kishan R");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email']")).sendKeys("kishan@changejar.in");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']")).sendKeys("9611055312");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//textarea[@name='mainAddress' and @placeholder='Flat/House no., street, area']")).sendKeys("My home address");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='pinCode' and @placeholder='Pincode']")).sendKeys("573211");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Proceed to pay']")).click();



        }

        //@AfterClass
        public void tearDown1() {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
