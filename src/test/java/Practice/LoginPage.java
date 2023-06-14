package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage
{
	public static void main(String[] args) {
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

}
}