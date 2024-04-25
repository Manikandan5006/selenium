package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsPrintTheGoogleSearchResultsURLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
		    
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("game of thrones",Keys.ENTER);
	// oru page la irukka ella urls aahhyum edukkanum
       List<WebElement> links =  driver.findElements(By.xpath("//a"));
      int sise= links.size();
      System.out.println(sise);
     /* 
       for (WebElement alllinks : links) {
    	   //href ndra attributes la ella urls um irukkum  so antha attributes ahh edukuran, apdina ahref ndra attributes
           //la irukka values ellam enakku varum
   	 // System.out.println(alllinks.getAttribute("href"));
	
		 
	}
	*/
       
	/*
	 * // ippo enakku antha page irukka 
	    https://www.imdb.com
	   Game of Thrones (TV Series 2011–2019)
	   
	   ipdi oru heading irukkuna antha heading ku mela oru link irukkum, enakku antha maari irukka ella linkymm naan edukkanum
	   
	   step1: athukku antha website antha links ellam entha tage la irukku paaru, and next antha motha page ahh select pamdra tag(<div>)
	   edukkanm ex: //div[@id=search] itha potta anta moththa page um me select aagum la antha mar edukkanum
	   so athula iruntha namma thevaiya link oda xpath ahh eluthanum athan romba mukkiyam
	     
	   
	 */
       
       List<WebElement> mainlinks=driver.findElements(By.xpath("//div[@class='e9EfHf' and @id='cnt']//following::h3//following::div/cite"));
       for (WebElement everylinkinmainlink : mainlinks) {
		System.out.println(everylinkinmainlink.getText());
	}
       
       
       
       
         
       
       
       
       
       
       
    
       
 
	}

}
