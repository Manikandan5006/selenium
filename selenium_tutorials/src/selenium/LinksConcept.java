package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksConcept {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        /* ippo namma normal ahh oru linka ahh use panni antha link oda web page kulla poganuna, namma 
           driver .get()  thana use pannuvom, athu simple ahh antha webpage kulla mattum than pogum
            but apdi pannumpothu athula oru draback irukku , .get() use panna ulla poitta 
           nammalaala back varathukku athula options illa , so namma oru webpage kulla poitu and next athula irunthu back varanum, or 
           refersh pannanunu nenachalo namma get ku pathila ***** NAVIGATE().TO  ***   Use panni kalam */
        
        //interview question :
                             //  get() -----> in driver.get() method we can not go cak to previous url and we cant referesh page
                       // navigate() ----> but can do referesh and can go back to previous page and move forword to next page
        
       driver.navigate().to("https://www.leafground.com/link.xhtml");
       
       WebElement homepage = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
       homepage.click();
       
       driver.navigate().back(); // or we can go forword
       
// --------------------------------------------------------------------------------------------------------------------------------    
//  ------------------------ find where am  supposed to go without clicking me   -----------
       
      WebElement findingtargetelement = driver.findElement(By.linkText("Find the URL without clicking me."));
      
       String targetlocationname = findingtargetelement.getAttribute("href");
       
       System.out.println("targetlocationname"+ targetlocationname);
       
       
//       --------------------------------  verify the link is broken  ---------------------------------
       
//     ippo antha broken link ahh click pandram
       WebElement brokenlinkelement = driver.findElement(By.linkText("Broken?"));
       brokenlinkelement.click();
       //ippo antha page kulla pogum, antha link broken ahh illayan therinchukka namma antha web page oda title hh get
       //panna therinchurum
       //inga nan yen clik pannitu tie therinchukuran na, clck panna odare new page varum, driver interface antha web page oda intercat panna thana
//       sonan driver la irukka title ah eduthu therinchukuran, oru webpage la antha tab oda name enna theriyutho anthan antha page oda title
      String pagetitle = driver.getTitle();
      System.out.println(pagetitle);
      //oru if statement vachi atha paakalam
      
//      usally namma contain() ahh oru elementsla irukka atribute oda values  vahi antha element ahh kandupudikka use aaguthu
      //intha contains vachi namma xpatha kooda find panla
      
     // ex:[contains(@id,'attribute value')]
      
      //ex:findelements(By.xpath("//*[contain(@id,'atribute value')]"));
      
      if(pagetitle.contains("404")) {
    	  System.out.println("this link is brokn");
      }else {
    	  System.out.println("not broken");
      }
       
      //antha link open aagalye so athula irunthu veleiya varan,so
      
      driver.navigate().back();
//      -------------------------------------------duplivate link--------------------------
      
      // ippo marupadiyum home ku poran
      
      // homepage.clear(); // intha motha program ahh yum run pannum pothu intha oru line mattum error vanthu nikkum, 
                       //and ithukku keela irukka lines kooda execute aagathu.
      
       /**** stale element reference: stale element not found **** INTHA ERROR VANTHU NIKKUM,  ithu rommba important interview question
      
           ippo oru page ahh refresh panndram or element ahh find out pani atha element ahh click panni innoru page kku poitu again antha home page or that previous
           page ke varum pothu antha page refresh aayirukkum, alredy irukka elemnet ala namma puthu 
           operarion ahh perform panna nenacha STALE ELEMENT REFFERNCE ECEPTION VARUM
           
           stale elemnt refrence enna sollum na , neenga oru element ahh thedi perform panna nenaikuringa but antha element intha page la currentahh illa
            
          so entha element aku ponumo atha again find panni click pannanum
       
      *correct explanation:
      *                   the element has been deleted entirely
      *                   the element is no longer attached to the DOM
      
      
       namma page vera oru edathuku redirct aayirukku or referesh aayirukkuna antha case again antha webelement ahh finnd panni click pannanum
      */
      WebElement homepage1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/a"));
      homepage1.click();
      
      
      //--------------------------------------------   find how many links in a web page  ----------------------------------
      
      //web page total ahh entha link irukkunu find pannnanu, so namma link tage la irukku <a> inda tag ahh vachi find panlam
      
    List<WebElement> findinglinks = driver.findElements(By.tagName("a"));
      findinglinks.size();
      
      
       
       
       
       
       
       
       
       
       
       
       
       
        

}
}
