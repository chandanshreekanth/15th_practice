
//  functional / Component testing

package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4
{
	@Test
	public void testcase4()
	{
		 WebDriverManager.chromedriver().setup();
		   
		   //step 2- launchinh the browser
		   WebDriver driver=new ChromeDriver();
		   
		   //step 3- rendering the browser time for every 10 seconds
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //step 4- maximizing the window browser
		   driver.manage().window().maximize();
		   
		   //step 5- deleting all browser histories
		   driver.manage().deleteAllCookies();
		   
		   //step- 6 getting the url
		   driver.get("https://www.facebook.com/");
		   
		   driver.findElement(By.xpath("//input[@name=\'email\']")).sendKeys("angadiaishwarya@gmail.com");
		   
		   driver.findElement(By.xpath("//input[@name=\'pass\']")).sendKeys("aishwarya@123");
		   driver.findElement(By.xpath("//button[@name=\'login\']")).click();
		   
		   
		   
		  

		   
	}

}
