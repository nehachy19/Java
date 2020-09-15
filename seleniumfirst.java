package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfirst extends Exception
{
    public static void main(String args[]) throws InterruptedException 
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Neha\\Downloads\\ch\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.officedepot.com/");
        driver.wait(4000);
        Actions actions = new Actions(driver);
        WebElement Login=driver.findElement(ByXPath());
    }
}
