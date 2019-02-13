import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Runner {
    private WebDriver driver;

    /**
     * Set up method which configure settings before test
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //  Driver entity creation

        driver = new ChromeDriver();

        //Set 5 sec wait for element to display

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Make browser window expanded

        // driver.manage().window().maximize();

    }

    /**
     * Check the presence of the link in the search result
     */

    @Test
    public void googleTest() {

        //Open needed page

        driver.get("https://www.google.com");

        //Find search text field, type there query

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation testing");

        //Imitation of the clicking on "Enter" button on keyboard

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        List<WebElement> links;

        //Var-flag that shows that expected condition was reached
        boolean linkIsFind = false;
        //Loop that searches for needed link within all search result pages
        while (!linkIsFind) {
            links = driver.findElements(By.xpath("//div[@class='r']/a"));
            for (WebElement link : links) {
                if (link.getAttribute("href").equalsIgnoreCase("https://medium.com/@briananderson2209/best-automation-testing-tools-for-2018-top-10-reviews-8a4a19f664d2")) {
                    link.click();
                    linkIsFind = true;
                    break;
                }
            }
            if (!linkIsFind) {
                WebElement clickNext = driver.findElement(By.xpath("//a[@id='pnnext']"));
                clickNext.click();
            }
        }
    }

    /**
     * Close browser
     */
    @After
    public void tearDown() {
        driver.quit();
    }
}