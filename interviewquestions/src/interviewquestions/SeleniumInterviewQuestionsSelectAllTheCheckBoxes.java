package interviewquestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumInterviewQuestionsSelectAllTheCheckBoxes {

	public static void main(String[] args) {
		
		//   ******************************  wrong code**********************
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> allele= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'ui-helper-hidden-accessible')]/following-sibling::div[contains(@class,'ui-radiobutton-box')]/span[contains(@class ,'ui-icon-blank')]")));
         
//       List<WebElement> allele= driver.findElements(By.xpath("//div[contains(@class,'ui-helper-hidden-accessible')]/following-sibling::div[contains(@class,'ui-radiobutton-box')]/span[contains(@class ,'ui-icon-blank')]"));
       
       for (WebElement itelel : allele) {
    	   try {
    		   itelel.click();
		} catch (Exception e) {
			System.out.println("Error clicking checkbox:");
		}
		
	}
	}

}
