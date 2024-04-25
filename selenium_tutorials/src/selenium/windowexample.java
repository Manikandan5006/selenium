package selenium;

import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        
      
        
        // ippo namma puthu window onnu open aayirukkum, ithukku munnadi namma parrent window la senja ella operationa hh yum, ippo open aayirukka new window la yu
        //seiyanum, athukku paarent window la irujkka handle ahh namma new window kkum pass pannanum, appo than new window la namma work panna mudiyum
        //namma prrent window la epdi driver interface use panni pannamo antha driver interface new window la panna mudiyum.
        
        //athukku namma first parrent window or curent window (palaya window or namma new window open pandrathuku munnadi work pannitu irukka window) enga irukkunyu identify pannanum
        
        // ippo namma puthy window open panni athula ethavathu work pannitu and atha cut pannitu marupadiyum namma  control ahh current window ku kondu varam
        
        //so namma current window ahh therinchukarathuku namma selenium la oru method irukku,
        
// --------------------//***** old to new window switch pandrathuku munnadi intha line kandippa poadanum ***** --------------
        
              
         
        String oldwindow =  driver.getWindowHandle(); // Get handles of current windows // ithu vanthu current ahh focus la irukka window oda identity window oda identity ennanu store panni eduthukum, 
                                                    //athavathu nan  puthu window ku porathuku or antha window botton element ahh click panni puthu windowkku
       //ku porathukku munnadi old window oda identity ennanu first store panni vaiukuran
        

 
 
 
       // oru puthu window va open panna koodiya element ahh click panndran
       WebElement openwwindowelement = driver.findElement(By.id("j_idt88:new"));
       openwwindowelement.click();
       
       //ippo button ahh click pandran, ippo old window la irunthu control ahh new window ku kondu poganum
      Set<String> allwindowhandles = driver.getWindowHandles(); // Get handles of all windows // intha handles ahh new and old window oda 
                                                                //rendu controles um irukkum,cause its handles all windows
                                    //driver.getWindowHandle(); ndrathu current ahh antha oru window la ennena irukko athu retrun pannum
                                   // but intha getWindowHandles() ndrathu open la irukka multiple brwser ahh retun pannum,
                                   // athavathu namma driver moolama open panna ethana window irukko atha ellathayum store pannikum
                                   // ithu set of string , atha morethan one ahh store pannikalam.
      
      
      //inga namma handle ahh value irukuravaraikum apdiye iterate pannite irukkum, apdinna intha allwindowshandles(getwindowhandles) hha 
      // old and new window operations ellam irukku , so old window la irukka ellathayum new windows ku kondu varum,
      //so new window la irunthu vara ellathayum for loop pottu oru name la eduthukuran(newwindow)
      
      for (String newwndow : allwindowhandles) {
    	  
    	  driver.switchTo().window(newwndow); // ippo puthusa open aaha windows ku control maaridum
      }
    WebElement sidebuton =   driver.findElement(By.id("menuform:j_idt40")); //oru button ahh click pandran athuoru side popup button
    sidebuton.click(); //atha click pandran
    WebElement textboxinsidebutton= sidebuton.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a")); //atha click panna udane first element vachi 2nd element ahh click pandran
     textboxinsidebutton.click();
     //ippo atha window avv close pandram.close() use panna antha current window than close aagum, .quit() use panna all windows um close aagum
//      driver.close();
      
      // ippo intha line la epdi old windowla irunthu new window ku poga sonnamo, ippa athey maari, 
      //new window la irunthu old window ku switch pannanum
      
      driver.switchTo().window(oldwindow) ; //itha potta drive moolama open aana window first ku kondu pogum./ ippo namma control parrent window ku vanthurukkum
      
      
      
   
   
        
        
//      -------------------------------------------------------
      
      // ------------------------------ find the number of opended windows  --------------------
      
      WebElement sizeofwindows = driver.findElement(By.id("j_idt88:j_idt91"));
      sizeofwindows.click();
   int numberofwindowsopedned =   driver.getWindowHandles().size();
      System.out.println(numberofwindowsopedned);                               
      
      
//      --------------------****-ippo parent window avv thavira puthusa open aana 2 window vaum  close pannanum  ----*****----------
      //String oldwindow =  driver.getWindowHandle(); // old window or oda details ahh eduthukuran, already mela potutuan so itha comment panniran
        
       WebElement elmtofclosingexcepparent = driver.findElement(By.id("j_idt88:j_idt93"));
       
       elmtofclosingexcepparent.click();
       
       //ippo open aana ella windows ahh yum get panndran
      Set<String> allopedwinows = driver.getWindowHandles();
      //ippo oru foreach use panndran, athula ella windows um irukkum, athuala child windows ahh 
      //parent windows oda compare panni, athu child window avva iruntha atha ellathayum close pandran
       
      for (String allwindows : allopedwinows) {
    	  if(!allwindows.equals(allopedwinows)) { //ithuve if(allwindows.equals(allopedwinows)) ipdi potta atha compare pandratha artham
    		                                      // but naan check pandran, fron la not ! potuta, parrent window =! allopedndwindows la child window oda compare panni
    		                                     //  apdinna alopend windos la first chiled window oda parent ahh comparae pandran , window =! childwindow, ipdi vantha close pandran
    		  
    		  
    		  driver.switchTo().window(allwindows); //.close(); // ipdi close () ingaye potuta parentwindow oda sethu ellame close aayirukum
    		  driver.close();                       //so first childwindow varuthu controlahh athuku switch pandran, and compare panni close pandraan
    		  
    	  }
		
	}
       
       
       
      
      
      
      
      
      
      
       
	}

}
