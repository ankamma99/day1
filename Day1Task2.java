package Crashcourse;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class Day1Task2
{
	
	private WebDriver driver=null;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
	}
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	
	@Test
	public void verifyDuplicateLinks()
	{
		System.out.println("the duplicate values in facebook loading page are");
		 List<WebElement>elementlist = driver.findElements(By.tagName("a"));
	 	  for(int i=0;i<elementlist.size()-1;i++)
	 	  {
	 		  for(int j=1;j<elementlist.size();j++)
	 		  {
	 			  if(elementlist.get(i).getText().equals(elementlist.get(j).getText()))
	 			  {
	 				  System.out.println("duplicate values are " +elementlist.get(i).getText() + " " +elementlist.get(j).getText());
	 			  }
	 			 
	 		  }
	 	  }
	 	   
	    	
	    
	}
	
	
	

}
