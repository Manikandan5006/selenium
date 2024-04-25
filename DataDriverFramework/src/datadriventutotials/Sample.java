package datadriventutotials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromiumdriver().setup();
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement usernem =drive.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'username')] "));
		usernem.click();
		usernem.sendKeys("admin");
		
		WebElement password = drive.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'password')] "));
		password.click();
		password.sendKeys("ojhjbs");
		

	}

}
