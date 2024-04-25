package interviewquestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsSendKeyInputsWithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		
		//send keys use pannama keybord inputs ahh epdi input areaku tharathu
		
		//way 1:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.in");
        
      //way 1: Using sendkeys();
        
		/*
		  WebElement ele = driver.findElement(By.name("q"));
		  ele.sendKeys("viji");
		 */
		
     // way 2:  identifying the element  by Using javascript method and send keys within that
      
    //----------------------------------------------------------------------------------------
        
      /* JavascriptExecutor executer = (JavascriptExecutor) driver;
       executer.executeScript("document.getElementsByName('q')[0].value = 'vijay'", "");
       */
        
       //document.getElementByNmane('q')[0]"  --> element name q vachi edukkuran, oru vela q ndra name la neraiya list element irunthalum 
       //athula irukk first element[0] nu specific ahh potrukkan, and athukkana value athavathu enna type panni athukulla thara poramnu 
       //value la sollanum athu antha key board ku pogum
    //-----------------------------------------------------------------------------   
       
       //way 3: identify elements by using driver method and executing javascript along with the elements
        
     /*   JavascriptExecutor executer = (JavascriptExecutor) driver;
       
       WebElement ele = driver.findElement(By.name("q"));
       
       executer.executeScript("arguments[0].value='vijay'", ele); */
       
//-----------------------------------------------------------------------------------------------------
       
       //way 4: using robot class we can send each keys separately:
       driver.switchTo().activeElement();
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
       
       
       
              
		

	}

}
