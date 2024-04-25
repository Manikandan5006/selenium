/**
 * 
 */
package interviewquestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumInterviewQuestionHitUrlWithoutUsingGetorNavgatemethods {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		//ippo nan get url  or navigate to use panama chrome browser ahh launch pannanum
		
		//athukku namma javascript use pann panlam
		
		String url = "http://www.google.com";
		
		//java la double quote kulla than nammaku String enclose aaganum ,, anan nammainga double " " than kudukanum
		
		 //so double quote ("") kulla innoru double qoute or single ' kudukkanumna nalla namma 
		                                            //esc(\) kudukkanum
		
		//athavathu oru double quote kulla innoru double quote podanunuuna (\++\) ipdi than podanum
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("window.location= \'" +url +" \' " );
		
		//ippo nammaku chrome page open aagirukum   \ '"+ +"'\
		
		
		
		
		

	}

}
