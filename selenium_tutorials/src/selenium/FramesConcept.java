package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        /*              oru HTML page kulla different HTML ahh embed pandrathuku use aagut=ra tag  than frmaes nu solvanga

                        namma web pages la sila adds lam varum la athellam than frames

                        iframe ndra tag kulla tha oru HTML page la irunthu innoru HTML page ahh embed pannuvom

                        oru element ahh inspect pannumpothu view frame source nu varuthunna antha element oru frameku ulla irukku atham

                        ippo oru webdriver  la oru  page oda native HTML mattum than store aayirukkum, that means top level HTML kulla irukka data va mattum than athaala edukka mudiyum

                         oru frame nu onnu iruntha atha webdriver vachi access panna mudiyathu, yenn athu embed pannirukaanga, or nested HTML
                         so namma webdriver kitta HTML kulla irukka  default content ahh paakathu athukula irukka IFRAME kulla irukka conten ahh paaru sollanum

          */
        
        //webdriver kitta frame ku Switch panna sollanum, like alerts maari
        
      /* 1 */    driver.switchTo().frame(0);    // inga frae kku NAME and ID apdinnu ethuyum illa , antha page 1st time frame ndra tag varuthu so nan ithukku index "0" nu kuduthukuran
                                        //aduthu aduthu vara frame edukurathukku  index 1 index 2 nnu tharam
         
         WebElement butunwithinframe = driver.findElement(By.id("Click"));
         butunwithinframe.click();
                          // ippo mela irukka frame illama run panna error varum athu ennanu yenna keela expalin pannirukuuan
         
                          /* oru frame nu onnu iruntha atha webdriver vachi access panna mudiyathu, yenn athu embed pannirukaanga, or nested HTML
                             so namma webdriver kitta HTML kulla irukka  default content ahh paakathu athukula irukka IFRAME 
                             kulla irukka conten ahh paaru sollanum
                         */
         
          
         String text=  driver.findElement(By.id("Click")).getText(); //atha elementaa click panni athukulla irukka text ahh get pandran
         System.out.println(text);
         
//       -------------------------------------------------------------------------------------------------------------------------------------------
         
   /*     ippo normal ahh oru HTML page ku  ulla  irukka  oru HTML kooda (frame) kooda interract pannanom, 
         ippo antha frame kulla irukka innoru frame kooda
         epdi acces pandrathunu paapom  like epdinna
         
          HTML --->
                    HTML -->
                              HTML
          */
         
         //so first frame la irunthu default HTML kku switch pannikanum,yemma mela (/* 1 */) intha line la paaru namma frame ku switch pannirukkam
         
         driver.switchTo().defaultContent();  //frame la irunthu default browser page ku vantan, intha default content than namma frame la irunthu default content kku 
                                              // switch pannum
         //namma paga le irukka frame kulla poran
         driver.switchTo().frame(1); // yenna namma mela 1st frame ku  index 0, and ithu 2nd frame so index 1
         
         //ippo antha frame kulla irukka innoru frame ku switch pannikuran . 2nd frme ku id irukuratha naala naan id eduthukuran
//         WebElement frmaeelement = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
         driver.switchTo().frame("frame1");
         WebElement butninsideframe =driver.findElement(By.id("Click"));
         butninsideframe.click();
         
         // find how many frames are there
         
         List<WebElement>totalframes =driver.findElements(By.tagName("iframe"));
         int size = totalframes.size();
         
         System.out.println(size);
         
         
         
         
 
         
         
        

	}

}
