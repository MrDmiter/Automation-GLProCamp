import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Runner {
    private WebDriver driver;
    private Elements elements;

    /**
     * Set up method which configure settings before test
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
/**
 * Driver entity creation
 */
        driver = new ChromeDriver();
/**
 * Set 5 sec wait for element to display
 */
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/**
 * Make browser window expanded
 */
        driver.manage().window().maximize();
        elements = new Elements();
    }

    /**
     * Test which describes steps of our test
     */
    @Test
    public void googleTest() {
/**
 * Open needed page
 */
        driver.get("https://www.google.com");
/**
 * Find search text field, type there query
 */
        driver.findElement(elements.googleSearchField).sendKeys("Automation testing");
/**
 * Imitation of the clicking on "Enter" button on keyboard
 */
        driver.findElement(elements.googleSearchField).sendKeys(Keys.ENTER);
        List<WebElement> list;
/**
 * Var that shows that expected condition was reached
 */
        boolean flag = false;
/**
 * Get the list of the pages with search results
 */
        List<WebElement> pages = driver.findElements(elements.googlePagesLinks);
/**
 * Go through the each page looking for particular link, if link is found, click on it and verify that page is opened
 */
        for (int i = 0; !flag; i++) {
            pages.get(i).click();
            list = driver.findElements(elements.searchResultLinks);
            for (WebElement o : list
            ) {
                if (o.getAttribute("href").equals("https://www.qasymphony.com/blog/test-automation-automated-testing/")) {
                    System.out.println("We are inside");
                    o.click();
                    flag = true;
                    Assert.assertEquals(driver.getCurrentUrl(), "https://www.qasymphony.com/blog/test-automation-automated-testing/");
                    break;
                }
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