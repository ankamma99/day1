package Crashcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class Day1
{
	private WebDriver driver=null;
	
	@BeforeClass
	public void beforeClass()
	{
		 System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.navigate().to("https://www.facebook.com/");
	}


   @AfterClass
public void afterClass()
   {
    driver.close();
   }
   
   @Test
   
   public void invalidlogin() {
   	driver.findElement(By.id("email")).sendKeys("ankammarao Seelam");
   	driver.findElement(By.id("pass")).sendKeys("128596");
   	driver.findElement(By.id("u_0_n")).click();
   	
   	
   }
   
   public void testresult(){
   	String actualresult = driver.findElement(By.xpath(".//*[@id='js_0']/div/div/div")).getText(); 
   	String Expectedresult = ("The password you’ve entered is incorrect. Forgot Password?");
   	Assert.assertEquals(actualresult,Expectedresult);
   }
   

}

