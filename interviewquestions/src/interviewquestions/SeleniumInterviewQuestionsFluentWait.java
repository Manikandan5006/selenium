package interviewquestions;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SeleniumInterviewQuestionsFluentWait {

	private static final int WebDriver = 0;
	private static final int FluentWait = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\interviewquestions\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.leafground.com/waits.xhtml");
		
		WebElement elel1 = driver.findElement(By.id("j_idt87:j_idt89"));
		elel1.click();
	/*	
		
	  //ippo wait interface use panna poram,<> ithuu peru generics
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)) //10 sec ku webpage ahh wait panna soldran
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	WebElement getingtext =	 wait.until( new Function<WebDriver, WebElement>() { //inga <WebDriver, WebElement> ipdinna webdriver use panni web element ahh find panna poram

			@Override
			public WebElement apply(WebDriver t) { //namma inga appy ndratha change panna mudiyathu
				
				
				return driver.findElement(By.id("j_idt87:j_idt90"));  // itha naan save pannanumna mela wait la than save panna mudiyum
				                                                    //  so nan getingtext nu nu store pannikuran, so return varatha
				                                                 // mela than edukka mudiyum
			}
		} );
	String text = getingtext.getText();
		System.out.println(text);
		
		/*  ***** ippo intha code nan 10 secs ku driver ahh wait panna solliyum, ecxception vantha atha
		//ignor panna solliyum, atha ignore panna ma no such element exception adichiruku, ithan than interview la keppanga
		 // epdinna eventhough IGNOR PANNALUM NOSUCHELEMENT ECEPTION EROR  VARUTHU ATHUKU REASON ENNANU KEPPANGA
		//SO ITHU THAN NAMMA IMPORT PANNA PAKAGE AHH PAKKANUM, YENNA OREY NAME LA  MULTIPLE CLASS IRUKURUKKUM
		
		//NAMMA INTHA NOSUCH ELEMENTS class ENTHA PACKAGE KULLA IRUNTHU EDUKKANUNMNA  ****OEPNQA.SELENIUM *** KULLA IRUNTHU EDUKKANUM, BUT NAMMA JAVA.UTILL LA IRUNTHU
		//NOSUCH ELEMENT class AHH IMPORT PANNIRUKKAM, SO IGORE PANNANLUM ANTHA ERROR VARUM
		 // SO PAKAGE AHH CORET AHH IMPORT PANNANUM 
		  * 
		  */
		
//		---------------------------- mela irukka code ahh again try pandran  ---------------------
		
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(4)).ignoring(NoSuchElementException.class);
		
	WebElement mytext =wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(org.openqa.selenium.WebDriver t) {
				
				return driver.findElement(By.id("j_idt87:j_idt90"));
			}
			
		});
	mytext.click(); 
		
		
		
	}

}
