package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 
{
	@Test
	public void testcase1()
	{
		//step 1- setting the browser
		WebDriverManager.chromedriver().setup();

		//step 2- launching the browser
		WebDriver driver=new ChromeDriver();

		//step 3- rendering the browsering time for every 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//step 4- maximizing the window browser
		driver.manage().window().maximize();

		//step 5- deleting the browser history
		driver.manage().deleteAllCookies();

		//step 6- fetching the url
		driver.get("https://www.makemytrip.com/");

		//step 7- click on round trip radiobutton
		driver.findElement(By.xpath("//li[@data-cy=\'roundTrip\']")).click();

		//step 8- click on from textbox
		driver.findElement(By.xpath("//span[text()='From']")).click();

		//step 9- sending the key as hubli  (ticket from hubli)
		driver.findElement(By.xpath("//input[@autocomplete=\'off\']")).sendKeys("delhi");

		//step 10- click on hubli get selected
		driver.findElement(By.xpath("//p[text()='New Delhi, India']"));

		//step 11- click on to textbox
		driver.findElement(By.xpath("//label[@for=\'toCity\']")).click();


		//step 12- selecting mangalore
		driver.findElement(By.xpath("//input[@autocomplete=\'off\']")).sendKeys("mangalore");

		//step 13- selecting as mangalore
		driver.findElement(By.xpath("//p[text()='Mangalore, India']")).click();

		driver.findElement(By.xpath("//label[@for=\'departure\']")).click();

		driver.findElement(By.xpath("//span[@class=\'langCardClose\']")).click();


		driver.findElement(By.xpath("//p[text()='11']/ancestor::div[@class=\'DayPicker-Day DayPicker-Day--today\']")).click();

		driver.findElement(By.xpath("//p[text()='11']/ancestor::div[@class=\'DayPicker-Day\']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+250+")");

		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();





		//WebElement ele = driver.findElement(By.xpath("//div[@class=\'makeFlex cursorPointer\']"));

		/*
		 * Actions actions=new Actions(driver); actions.moveToElement(ele).perform();
		 * //driver.findElement(By.xpath("//span[text()='Login or']")).click();
		 * driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		 */

		//driver.quit();

	}



}
