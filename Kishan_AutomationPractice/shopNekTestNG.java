import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class shopNekTestNG
{
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/kishanr/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void navigateToShopNekAndFindBirthstones() {
        // Navigate to the website
        driver.get("https://www.shopnek.com");

        // Click on 'Birthstones' link
        WebElement birthstonesLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='text-sm' and text()='Birthstones']")));
        birthstonesLink.click();

        // Wait for the 'Find yours today' button and click it
        WebElement findYoursButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type,'button') and contains(text(), 'Find yours today')]")));
        findYoursButton.click();
    }

    @Test(priority = 2)
    public void fillOutForm() {
        // Fill out the form
        WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Name']")));
        nameInput.sendKeys("Kishan R");

        WebElement nextButton1 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton1.click();

        // Select options for birthdate
        WebElement dayInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='day']")));
        dayInput.sendKeys("27");

        WebElement monthInput = driver.findElement(By.xpath("//input[@id='month']"));
        monthInput.sendKeys("07");

        WebElement yearInput = driver.findElement(By.xpath("//input[@id='year']"));
        yearInput.sendKeys("2000");

        WebElement nextButton2 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton2.click();
    }

    @Test(priority = 3)
    public void fillOutCityAndSelectOption() {
        // Fill out city name
        WebElement cityInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='City name']")));
        cityInput.sendKeys("Bengaluru, Karnataka");

        // Click on the next button
        WebElement nextButton3 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton3.click();

        // Select 'Growth in career'
        WebElement growthInCareerOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='birthstone-option' and text()='Growth in career']")));
        growthInCareerOption.click();

        // Click on the next button
        WebElement nextButton4 = driver.findElement(By.xpath("//button[text()='Next']"));
        nextButton4.click();
    }

    @Test(priority = 4)
    public void checkRevealButtonVisibility() throws InterruptedException {
        // Check if 'Reveal my Birthstone' button is displayed
        WebElement revealButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'bg-teal-gradient') and contains(@class, 'text-white') and contains(@class, 'text-sm') and contains(@class, 'flex') and contains(@class, 'gap-[10px]') and contains(@class, 'w-full') and contains(@class, 'px-5') and contains(@class, 'h-11') and @type='button' and text()='Reveal my Birthstone']")));

        if (revealButton.isDisplayed()) {
            System.out.println("Reveal my Birthstone button is displayed.");
        } else {
            System.out.println("Reveal my Birthstone button is not displayed.");
        }

        // Pause for demonstration purposes
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        // Quit the driver
        if (driver != null) {
            driver.quit();
        }
    }
}
