package Testing;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2
{
	@Test
	public void testcase2()
	{
		//step 1- setting the driver
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
	   driver.get("https://google.com/");
	   
	   //step -7 searching excellerate hubli in search ico
	   driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("Excellerate Hubli");
	   
	   //step 8- click on excellerate searched in search icon
	   driver.findElement(By.xpath("//b[text()='excellarate']")).click();
	   
	   //step -9 click on 2nd link on the web page
	   driver.findElement(By.xpath("//h3[text()='Working at Excellarate - Glassdoor']")).click();
	   
	   //step -10 in location textbox search for hubli loaction
	   driver.findElement(By.xpath("//input[@id=\'sc.location\']")).sendKeys("Hubli");
	   
	   //step -11 click on hubli searched in location textbox
	   driver.findElement(By.xpath("//span[text()='Search']")).click();
	   
	   //step 12- click on first link
	   driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	   
	  
	   
	   //step 13- pass your mail id
	   driver.findElement(By.xpath("//input[@class=\'whsOnd zHQkBf\' and [@autocomplete=\'username\' ]]")).sendKeys("aishushettar95@gmail.com");
	   
	   //step 14- click on next button 
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   
	   //step 15- close the browser
	   driver.quit();
	   
	}

}
