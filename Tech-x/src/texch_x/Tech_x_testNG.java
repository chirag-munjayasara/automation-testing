package texch_x;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Tech_x_testNG {
	public WebDriver driver;
	
  @Test(priority=1)
  public void f1() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("firstname")).sendKeys("Value"); 
		 
		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Bound");

		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
		System.out.println("f1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In before method");
  }
  
  @Test(priority=3)
  public void f3() {
	  System.out.println("f3");
  }
  
  @Test(priority=2)
  public void f2() {
	  System.out.println("f2");
	  driver.get("http://local-tech-x.com/test.html");
		
		// Link Test
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");
		
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
		
		String s = driver.findElement(By.className("class-name")).getText();
		System.out.println(s);
		
		// Convert element in to a string 
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);
				
		// Click checkbox using By.xpath
		driver.findElement(By.xpath("//input[@id='check-box']")).click();
		
		// Click Radio button By.id
		driver.findElement(By.id("male")).click();
  }
  
  @Test (dependsOnMethods = { "OpenBrowser" })
  
  public void SignIn() {
 
	  System.out.println("This will execute second (SignIn)");
 
  }
 
  @Test
 
  public void OpenBrowser() {
 
	  System.out.println("This will execute first (Open Browser)");
 
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/home/chirag/Desktop/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("http://local-tech-x.com/");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
