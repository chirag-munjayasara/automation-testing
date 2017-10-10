package texch_x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tech_x_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/chirag/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();

		driver.get("http://local-tech-x.com/test.html");
				
		// Link Test
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");
		
		String sy = driver.findElement(By.partialLinkText("Partial")).getText();
		System.out.println(sy);
		
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
		
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		
		dropdown.selectByVisibleText("Developer");
		Thread.sleep(1000);
		dropdown.selectByValue("tester");
		Thread.sleep(1000);
		dropdown.selectByIndex(4);

	}

}
