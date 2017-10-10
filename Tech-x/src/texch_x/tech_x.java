package texch_x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tech_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/chirag/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://local-tech-x.com/");
		
		// Locate firstname and pass "localtechx"
		driver.findElement(By.name("firstname")).sendKeys("localtechx"); 
		 
		// Locate and pass "Bound" in lastname.
		driver.findElement(By.name("lastname")).sendKeys("Bound");
 
		// Click Submit.
		driver.findElement(By.id("submit")).click();
	}

}
