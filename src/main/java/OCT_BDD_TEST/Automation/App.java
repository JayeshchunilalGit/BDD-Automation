package OCT_BDD_TEST.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static WebDriver driver;
    public static void main( String[] args )
    {
        System.setProperty("webdriver.gecko.driver","D:/Driver/geckodriver.exe");
        driver = new FirefoxDriver();

//launchBritishAirwayscom();
driver.findElement(By.className("register")).click();
driver.findElement(By.id("email")).sendKeys("jayesh.chunilal@hotmail.com");
driver.findElement(By.id("confirm-email")). sendKeys("jayesh.chunilal@hotmail.com");
driver.findElement(By.id("pass")). sendKeys("krishna1z");
driver.findElement(By.id("confirm-password")). sendKeys("krishna1z");
driver.findElement(By.id("title"));
Select title = new Select(driver.findElement(By.id("title")));
title.selectByVisibleText("Mr");
driver.findElement(By.id("first-name")).sendKeys("jayesh");
driver.findElement(By.id("family-name")).sendKeys("chunilal");
driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]")).click();
driver.findElement(By.xpath("//span[@class='radio-label'][contains(text(),'Join the Executive Club')]")).click();

WebElement checkbox = driver.findElement(By.xpath("//span[@class='use-email-address']"));
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].scrollIntoView();",checkbox);
checkbox.click();
/*JavascriptExecutor jse = (JavascriptExecutor)driver;
driver.findElement(By.id("homeaddress1")).sendKeys("11 Turton Road");
JavascriptExecutor jse = (JavascriptExecutor)driver;
driver.findElement(By.id("homecity")).sendKeys("Wembley");
driver.findElement(By.id("homestate")).sendKeys("Middlesex");
driver.findElement(By.id("homepostalcode")).sendKeys("HA0 2BS");

    }
public static void launchBritishAirwayscom() {
	driver.get("https://www.britishairways.com");
}
	public static void toregister() {
		driver.findElement(By.className("register");
	}
	
}*/

}
}


