package testTitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FbTitleTest {

		static WebDriver driver;
		static String actual;
		static String expected;
		@Test
		public void loginTest(){
			
		 //System.setProperty("webdriver.chrome.driver","C://Selenium docs//chromedriver_win32//chromedriver.exe");
			  //driver=new ChromeDriver();
			//driver.get("https://www.facebook.com");
			         
		System.setProperty("webdriver.gecko.driver","C://Selenium docs//geckodriver-v0.31.0-win64//geckodriver.exe");
			  
		      driver=new FirefoxDriver();
		      
		      driver.get("https://www.facebook.com");
		      
		      
		     /*WebElement element= driver.findElement(By.id("imagesrc"));
		     
		     JavascriptExecutor executor = (JavascriptExecutor)driver;
		     executor.executeScript("arguments[0].click();", element);*/
			 
			 driver.findElement(By.name("email")).sendKeys("9966414466");
			 
			 driver.findElement(By.name("pass")).sendKeys("Pratishkumar@77");
			 
			 driver.findElement(By.name("login")).click();
			 
			  actual="Facebook";
			  expected=driver.getTitle();
			 
			 if(actual.equals(expected)==true)
			 { 
				 System.out.println(expected);
				 System.out.println("test passed");
			 }else {
				 System.out.println("test failed");
			 }
				
			}


		}
