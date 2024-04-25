
package selenium;

import java.util.List;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        /*
           
                      
      driver.get("https://seleniumpractise.blogspot.com/2016");
      WebElement calenderelement =  driver.findElement(By.id("datepicker"));
      calenderelement.click();
      
      WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
      
             String currentmonthname =  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
             String currentmonthyear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
             String onedate =currentmonthname +currentmonthyear;


      String expecteddate ="July 2024";


       ippo enakku july mont and 2024 calander la varanum athu var varaikum nan click pannite irukkanum
    athukku naan while loop use pannikuran, enakku month um july ahh irukkanunm an year um july ahh irukkanum, rendume correct ahh ahh iruntha
    nan loop ahh vittu veiya vanthuranum, condition ahh false ahh irunthhaa agn loop kulla poganum.
    ippo nan april la irukkan april ulla pogum july and aprill asame nu paakum , illa so false , and year 2024 true, so false and true =false varum condition la
     munnadi not(!) potrukkan so not flase = true, condition true ulla pogum
     july vanthuruchu compare pannuthu july thaan therinchaa true varum yearum true vatum true and true = true  and not(true) = false 
       condition false so loop ahh vittu veliya vanthurum, apdinna namakku thevaiyaana date kedachiruchu */

       /*
  while (!(currentmonthname.equals("July") && currentmonthyear.equals("2024")))
  { driver.findElement(By.xpath("//a[@title='Next']")).click();
  currentmonthname =
  driver.findElement(By.className("ui-datepicker-month")).getText();
  currentmonthyear =
  driver.findElement(By.className("ui-datepicker-year")).getText();
  }
  
  
  
 */

/*
          or keela irukka method la yum eluthalam, but intha calender ku work aagula
 
          while(true) {
  
          String currentmonthname =
          driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")
         ).getText(); String currentmonthyear =
          driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")
          ).getText(); String onedate =currentmonthname +currentmonthyear;
  
          System.out.println(onedate); if(onedate.contains("July 2024")) { break; }
          else { driver.findElement(By.xpath("//a[@title='Next']")).click(); }
  
  }
 
       Thread.sleep(4000);

       WebElement mydate =driver.findElement(By.cssSelector("table.ui-datepicker-calendar >tbody >tr:nth-child(5)>td:nth-child(2)"));
       mydate.click();
 */ 
      
//----------------------------------------------------------------------------------------------------------------------------
      
//      ------------------------- another excercise from another website    doubt  irukku program wrong---------------------------------
       /* 
        driver.get("https://phptravels.net/");
        
         String expecttext = "July 2024";
         
        
         
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         
         WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div[1]")));
         datePicker.click();
         
         Thread.sleep(5000);
         
         WebElement monthandyearvisibletext = driver.findElement(By.className("switch"));
         String name =monthandyearvisibletext.getText();
         System.out.println(name);
        
//        driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[3]/div/div[1]")).click();
//         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("datepicker")));
//         
         // xpath for dates in table row and column //*[@id="fadein"]/div[12]/div[1]//tbody//tr
        Thread.sleep(10);
         
//         while(true) {
//        	 
//        	 String monthandyearvisibletext = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[11]/div[1]/table/thead/tr[1]/th[2]")).getText();	 
//         
//         if(monthandyearvisibletext.equals(expecttext)) {
//        	 break;
//         }
//         else 
//         {
//        	 driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[12]/div[1]/table/thead/tr[1]/th[3]")).click();
//         }
//         
//        
            }
 
         
        
        
        
        
        
        )
   */      
        driver.get("https://www.expedia.ca/");
        
        
//    
        driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/div/div/div/button")).click();
        
  
        
        String expecteddate = "July 2024";
        String day = "29";
        
        driver.findElement(By.xpath("//*[@id='lodging_search_form']/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[2]/button")).click();
        
        while(true) {
        	
        String datename=	driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[1]/span")).getText();
        	
        if(datename.equals(expecteddate)) 
        {break;
        }	
        
        	driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[2]/button")).click();
        }
     
        List<WebElement> selecteddate = driver.findElements(By.xpath("//*[@id='lodging_search_form']/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[1]/table/tbody//tr//td"));
        
        for (WebElement ele : selecteddate) {
			System.out.println(ele.getText());
			ele.findElement(By.xpath("//*[@id='lodging_search_form']/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[1]/table/tbody/tr[5]/td[2]/div")).click();
			break;
		}
        
        
      
      //*[@id="lodging_search_form"]/div/div/div[2]/div/section/div[1]/div/div[3]/div/div/div[3]/div/div[1]/table/tbody//tr//td   
        
        
	}}
        
        
        
        
        