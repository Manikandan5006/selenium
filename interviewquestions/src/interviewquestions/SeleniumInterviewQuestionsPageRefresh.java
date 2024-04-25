package interviewquestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumInterviewQuestionsPageRefresh {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
		// ithukaana definition keela irukku
	    ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("http://www.google.co.in");
//        driver.navigate().to("http://www.google.co.in");
        
//        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("trichy");
        
  // ------------------first type: refresh command use padran
//         driver.navigate().refresh(); //  we can refersh like this incase we use  driver.navigate().to("http://www.google.co.in"); method
         
         //----------2nd type: incase nan vanthu  driver.get("http://www.google.co.in"); itha use panniruntha
                             //nan get current url ahh vachi page agg refresh panlam
         
//         driver.get(driver.getCurrentUrl());  //we can use this incase we ued driver.get("http://www.google.co.in"); method
		
         
 //------------type3: using javascript executer interface vachi------------
	/*
	   JavascriptExecutor executor = (JavascriptExecutor) driver; 
	     executor.executeScript("location.reload()"); // history.go(0); 
	     executor.executeScript("history.go(0)");
	 */          
 //------------ typ4: press f5 by using robot class
	/*
	    Robot rob = new Robot(); rob.keyPress(KeyEvent.VK_F5);
	    rob.keyRelease(KeyEvent.VK_F5);
	 */
          
// ------------------------------------------  maximise browser -------------------------------
        
//        type: maximise()
	/*
	 * driver.manage().window().minimize(); 
	 * driver.manage().window().maximize();
	 */
        
	/*
	 * //type 2: use dimension method 
	           Dimension dmension = new Dimension(1200, 500);
	           driver.manage().window().setSize(dmension);
	 */
         
         
         // matha 2 method um luch pannitu than maximize pannum , but nmma chrome option use pannumpothu
         //launch aagum pothrey athu maximise aagikum, intha chromroptions ahh namma neraiya
         //visiyathuku use panlam
         
       //type 2: chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        
        // namma intha chromeoptions aahh namma intha chrome driver ku starting laye pass pannanum
         
        
		/*
		 * oru vela firfox use panna namma intha Firefoxoption aahh namma intha firefox
		 * driver ku starting laye pass pannanum
		 * 
		 * firefoxOptions options = new FirefoxOptions();
		 */
        
         
         
         
	}

}
