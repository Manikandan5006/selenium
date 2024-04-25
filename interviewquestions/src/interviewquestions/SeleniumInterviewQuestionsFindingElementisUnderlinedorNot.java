package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumInterviewQuestionsFindingElementisUnderlinedorNot {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://google.co.in");
	        
	      WebElement gmail = driver.findElement(By.xpath("//div//a[@class='gb_J']"));
	      
	     String status1= gmail.getCssValue("text-decoration");
	        
	     System.out.println(status1);
	     
	        // namma oru element mla hover pannum pothu antha element ku keela under line varume atha naama check panna poram, 
	        //athukku namma first Action class use use panni than pannanum, 
	        //athu hove rpandrathuku munndi athoda status ummhover pannthuku apram athda status um paapom
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(gmail);
	        action.perform();
	         
//	        WebElement gmail = driver.findElement(By.xpath("//header//a[contains(text(),'Gmail')"));
	        
	        String status2= gmail.getCssValue("text-decoration");
	        System.out.println(status1);
	        
		

	}

}
