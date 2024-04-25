package interviewquestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumInterviewQuestionsPagination {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
  
//		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://datatables.net/");
		 
		 
		 List<WebElement> ele = driver.findElements(By.xpath("//button[@class='dt-paging-button' and not(contains(@class, 'disabled'))]"));
		 int totalsize=ele.size();System.out.println(totalsize);
		 for (WebElement webElement : ele) {
			webElement.click();
		
		  Thread.sleep(3000);
		   for ( int i=0; i<totalsize; i++) {
			   
//			  driver.findElements(By.xpath("//div[@class='dt-paging paging_full_numbers'] //button[@data-dt-idx="+i+"]"));
			 
			List<WebElement> datasinrow= driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td["+i+"]"));
			 for (WebElement getdat : datasinrow) {
	      String dataaa=getdat.getText();
	      System.out.println(dataaa);
	
			 
			}
			 
		   }
		   
		 }


}}
