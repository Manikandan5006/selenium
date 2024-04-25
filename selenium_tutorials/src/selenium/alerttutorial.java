/*

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerttutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.leafground.com/alert.xhtml");
        /*   alert ku object create panna mudiyuathu.
         
         *   alert indrathu oru interface than, ippo oru alertvaruthunna namma browser oda controll ellam antha alert ku poidum
             onve antha alert ku namma confirmation kuduthathuku apram thaan , namma matha actions panna mudiyum, oru alert click pannathuku appuram antha brower la namma etha click pannalum work aagathu
             so namma selenium la athayum sthu code eluthanum .athavathu namma driver (browser) control ahh namma alert ku switch pannamum.
             
                  ******   Alert alert  = driver.switchTo().alert(); ******
         * */
        
        /*
        //alertbox ahh find pannai click pandran
        WebElement alertbox =  driver.findElement(By.id("j_idt88:j_idt91"));
        alertbox.click();
        //alert popup aana udane browser controll fulla alertku pora maari pannanum, ithu important line 
        //alert code la eppovum ithu irukkanum
        //alertku webbrowseroda interface creat pannanu, so atha vachithan meethi operation panna poam
        Alert alert  = driver.switchTo().alert();
        
        //ippo alert pop up aayirukum , so atha naan kandippa ok kuduthu accept panni thaan aaganum
        alert.accept();
        
        //ippo oru alert ahh cancell panna poram 
        WebElement cancellbox = driver.findElement(By.id("j_idt88:j_idt93"));
        cancellbox.click();
        Alert confirmcancell = driver.switchTo().alert();
        //ippo vantha alert la irukka cancel ndra option ahh click panna poram, athukku inbuild ahh dismiss() ndra option irukku
        confirmcancell.dismiss();
        
        // prompt alert, ithukku same athey pmaari thaan , extra vara prompt la namma text aahh enter panni OK (accept) panna poram
        
        WebElement promptbox = driver.findElement(By.id("j_idt88:j_idt104"));
        promptbox.click();
         Alert promptaction = driver.switchTo().alert(); //controlla hh alert interface kku tharam
       promptaction.sendKeys("this Box is clicked "); // alert la vara question ku ans anupuran
       
       promptaction.accept(); //ok button press pandran
       //or cancell button press pandran
       
     //  Sweet Alert (Simple Dialog)   
    // inga sweet alert ndrathu selenium use panni elutha mudiyathu,so javascript ahh driver kooda interface panni js code execute panni code eluthanum
       //, you'll typically use JavaScript to interact with the dialog since Sweet Alert is not a standard browser dialog.
        
        
       
       
//       ------------------------- doubt irukku ithula code thappu  - goutham bro ta kekkanum----------- 
//       
//       WebElement sweetbox = driver.findElement(By.id("j_idt88:j_idt95"));
//       sweetbox.click();
//     
//        Alert sweetboxcancell = driver.switchTo().alert().
//        sweetboxcancell.accept();
//        WebElement closeicon = driver.findElement(By.id("j_idt88:j_idt98"));
//        closeicon.click();
//        driver.switchTo().defaultContent();
//        
        
//      WebElement sweetdia = driver.findElement(By.id("j_idt88:j_idt100"));
//      sweetdia.click();
//      WebElement close = driver.findElement(By.className("ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ui-state-hover"));
//      close.click();

//        ----------------------------------------------------------------------------------------------------
//         ------------------new page link and new excercise ---------- i am going to comment the aove link
//                       -------------------- window pop up -------
//        ippo namma file upload pannumpothu oru pop up onnu varum athula namma ssystem la irukka files ahh choose panni upload panlam, so apdi click panna udane
//        namma sysytem paths irunthu select pandra pp up window popup or os popup nu sollalam, that is not part our brower , its part of our os
        
        
        driver.get("https://html.com/input-type-file/");
        
        // so ippo nan  antha element ahh select panni click panniran ippo enna nadakkum puthu window popup onnum open aagum atha ennala handle panna mudiyathu
//        so naan direct ahh send keys thanthu athula irukka file ahh get pannikalam, nan enakku vendiya file ahh ullapo poi paathu athod link ahh copy panni inga tharan
        
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\User\\Pictures");
        
        
        
        
        
        
        
        
        
	}

}

*/
