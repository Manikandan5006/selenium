package seleniumtest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opengoogle {

	public static void main(String[] args) {
		

		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("instagram");
	driver.findElement(By.name("q")).submit();
	driver.quit();
	
	

	}

}
