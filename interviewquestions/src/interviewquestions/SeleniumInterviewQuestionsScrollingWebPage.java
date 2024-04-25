package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsScrollingWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms11.htm");
        
        
        
        JavascriptExecutor executer =(JavascriptExecutor) driver;
        
		/*
		  //javascript execute pannanumna namma executescript use pannanum 
		  //scrollto some possition . apdinna oru particula position ku down la pogum
		  executer.executeScript("window.scroll(0,450)", ""); // execute script la 2arguments tharuvom, namma ethavathu webelement oda perform pannum pothu 2nd
		  arg tharaam Thread.sleep(10000); //scroll up pandran so y axes value ahhminus(-) la thantha up aagum
		   executer.executeScript("window.scroll(0,-450)","");
		 */
        
        // go to botttom of the page:
		/*
		  executer.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		  
		  Thread.sleep(5000); executer.executeScript("window.scrollTo(0,0)","");
		 */
         
         
         // go to specific element position in web page
        
      WebElement ele= driver.findElement(By.xpath("//a//span[@class='link']"));
      
        
        executer.executeScript("arguments[0].scrollIntoView(true);",ele);
         
        
        

	}

}
