package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase5
{
	@Test
	public void testcase5()
	{
		WebDriverManager.chromedriver().setup();
		   
		   //step 2- launching  the browser
		   WebDriver driver=new ChromeDriver();
		   
		   //step 3- rendering the browser time for every 10 seconds
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //step 4- maximizing the window browser
		   driver.manage().window().maximize();
		   
		   //step 5- deleting all browser histories
		   driver.manage().deleteAllCookies();
		   
		   //step- 6 getting the url
		   driver.get("https://in.bookmyshow.com/");
		   
		   driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("hubli");
		   driver.findElement(By.xpath("//strong[text()='Hubli']")).click();
		   driver.findElement(By.xpath("//a[text()='Movies']")).click();
		   driver.findElement(By.xpath("//div[text()='Kantara']")).click();
		   
		  // JavascriptExecutor jsc=(JavascriptExecutor)driver;
		   //jsc.executeScript("window.scrollBy(0,"+50+")");

		   WebElement text = driver.findElement(By.xpath("//span[@class=\'sc-ec6ph5-4 KmsNs\']"));
		   System.out.println( text.getText());
		   
		   Actions act=new Actions(driver);
		   driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		   
		   driver.findElement(By.xpath("//input[@id=\'mobileNo\']")).sendKeys("9606408912");
		   driver.findElement(By.xpath("//button[text()='Continue']")).click();
		   //driver.quit();
		    
		   
		   

	}

}
