import org.openqa.selenium.By;

public class Elements {
    public By googleSearchField = By.xpath("//input[@name='q']");
    public By googlePagesLinks = By.xpath("//td");
    public By searchResultLinks = By.xpath("//div[@class='r']/a");
}