package interviewquestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsPressEnterInManyWays {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//1st way :
		
	WebElement ele=	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//	 ele.sendKeys("game of thrones",Keys.ENTER);
	 
	 //2ndway:
		/*
		 * ele.sendKeys("trichy");
		 *  ele.submit();
		 */
	 
	// 3rdwway:
	/*
	   ele.sendKeys("trichy");
	   Robot robot = new Robot();
	   robot.keyPress(KeyEvent.VK_ENTER); 
	   robot.keyRelease(KeyEvent.VK_ENTER);
	 */
	
	 //4th way:
	  ele.sendKeys("trichy  \n" );

	}

}
