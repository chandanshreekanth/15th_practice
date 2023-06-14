import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 
{
	@Test
	public void testcase1()
	{
		//step 1- set up the chromedriver
		WebDriverManager.chromedriver().setup();
		
		//step 2- to launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		//step 3- rendering the browser for every 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step 4- maximizing the window browser
		driver.manage().window().maximize();
		
		//step 5- deleting all browser history after every time browsing.
		driver.manage().deleteAllCookies();
		
		//step 6- fetching the url 
		driver.get("https://www.makemytrip.com/");
		
		//step 7- mouse over action
		//Actions action =new Actions(driver);
		//driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		
		driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
		
		//step 8- click on from textbox
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		//step 9- pass key as hubli 
		driver.findElement(By.xpath("//input[@type='text' and@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("hubli");
		
		//step 10- as suggertion show click on first suggetion		
		driver.findElement(By.xpath("//p[text()='Hubli, India']")).click();
		
		//step 11- close the browser
		driver.close();
		
		
		
		
		
		
	}

}
