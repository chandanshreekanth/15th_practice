
package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3
{
	@Test
	public void testcase3()
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
		   driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		   
		   Actions actions=new Actions(driver);
		   WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/div[1]/nav/ul/li[2]/button"));
		   actions.moveToElement(ele).perform();
		   
		   System.out.println(driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/div[1]/nav/ul/li[2]/ul/li[2]/ul/li[2]/a")).getText());
		   
		   List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div/section/div[3]/table/tbody/tr"));
		   System.out.print(rowelements.size());
		   int rowsize = rowelements.size();
		   
		   List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div/section/div[3]/table/tbody/tr[1]/td"));
		   System.out.println(columnelements.size());
		   int colsize = columnelements.size();
		   
		   for(int i=1; i<=rowsize; i++)
		   {
			   for(int j=1;j<=colsize; j++)
			   {
				   System.out.println(driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div/section/div[3]/table/tbody/tr["+ i +"]/td["+ j +"]")).getText());
			   }
				   
		   }
		   
		   
		 //*[@id="main-content"]/div/div[2]/div/div/section/div[3]/table/tbody/tr
		 //*[@id="main-content"]/div/div[2]/div/div/section/div[3]/table/tbody/tr[1]/td
	}

}
