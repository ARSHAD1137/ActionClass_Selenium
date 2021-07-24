import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContenText
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bigbasket.com/");
        /*WebElement dropdown = driver.findElement(By.partialLinkText("Shop by Catego"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();
        Thread.sleep(3000);*/

        WebElement search = driver.findElement(By.cssSelector("#input"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.contextClick(search).perform();
        Thread.sleep(3000);
        search.sendKeys("potato");
        Thread.sleep(500);

        driver.quit();
    }
}
