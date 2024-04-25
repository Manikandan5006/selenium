package interviewquestions;

import java.time.Duration;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumInterviewQuestionsExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\interviewquestions\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/waits.xhtml");
		
		WebElement elel1 = driver.findElement(By.id("j_idt87:j_idt89"));
		elel1.click();
		
	
		
		//ippo no such element exception vanthurukkum, yenna oru element ahh click pannitan, athu displaya aagurathukuey konjam time edukuthu
		//athukkul innoru element athula iruknthu acces panna try pandran so intha maari situvation la than no such element
		//exception varum
		
		//***** intha edathula namma explict wait use panni sila condition ahh kuduthukalam
  //		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
   //wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt90"))).click();
		 // or 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
	 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt90")));
	 ele.click();
		 WebElement textgetting = driver.findElement(By.id("j_idt87:j_idt90"));
			System.out.println(textgetting.getText());
			
			
			
		WebElement invele = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt92\"]/span"));
		invele.click();
		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10000));
		 Boolean secondinvisibleelement = wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"j_idt87:j_idt93\"]/span")));
		
		// Assertions.assertrue(secondinvisibleelement, message: " ele is visible");
		 
		if(secondinvisibleelement=true) {
			System.out.println("not visible");
		}else {
			System.out.println("visible");
		}
				
	}
	
	/*
	  clickable(driver, invele, 10);
	  
	   public static void clickable(WebDriver driver,WebElement ele, Duration
	   timeout , String value) { new
	   WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(
	   By.xpath("//*[@id=\"j_idt87:j_idt92\"]/span"))); ele.click(); }
	 */
	
}
