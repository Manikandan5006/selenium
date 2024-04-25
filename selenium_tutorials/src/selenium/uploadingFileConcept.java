/*

package selenium;

import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.Transferable;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

//import javax.swing.TransferHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.emulation.model.SensorMetadata;


public class uploadingFileConcept {

	public static <Clipboard> void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
        upload.click();
        
        //selenium aala webpage kooda mattum than interact panna mudiyum, once file upload pannumpothu openaagurathu window popup, so namma 
        //ithuku java va than use panni upoad pannanum
        
        /* inga naan click pannitan, panna odane oru window popup varum, so nan athula, ennoda file name ahh choose pannio upload pannanum 
            or antha window open aana odane filename ndra inputbox la namma file enga irukkundra location ahh kooda kuduthu open kudutha, upload aagum
            inga normal ahh selenium thara maari send key ahh ellam kudukka mudiyathu
         
         
         * ***** athukku pathila namma antha file location ahh eduthu oru Clip board la paste panni vachiranu, namma java use panni
             clipboard la irukka text ahh ctr+v kuduthu edukuram,
             yenna namma ethayavathu cut(ctrl+x) pandram or copy(ctrl+v) pandram , atha kondu poi innoru edathu vaikura vara athu oru temporay storage la thahan 
             irukkum, inga cilp board la thaan athellm irukkum,namma cut pannathuku apporamum, or copy pannathuku appuramum athu clopboard la than
             poi irukkum, and namma ctrl+v kudukkum pothu athu target la paste aagirum
          
         * itha thaan namma file upload la yum seiya poram
         
          
         * so firstetha datava clipboard ku kondu poganuna nammaloda file location ahh , and then namma ctrl + v tharappo clipboard la
             recent ahh irukku intha locationa hh pate aagum
         *  second upload button clisk aana udane windowpopup la vara file name ndra input areala namma clipboard la irukka loacationa hh
            copy pate pannitu enter press pannaudane athu upload aagum
          
         * clip board ku namma epdi intha data va(namma location ahh ) kodu poganunnaa JAVA la irukka TOOLKIT ndra method vachi than
            windowls irukk aellam oru tool than , so intha clipboard um oru tool than, athu windows la default ahh ve irukkum
          
         * so toolkit la defaul toolkit ku poram  and antha default toolkit la irukka dsystemclipboard ndra toolkta eduthukuran
            appuram systemclipboard la namma content(location path) ahh setpanna poram.
         
         * set content set pannumpothu athula 2 parameter irukkum, athual 1st transferable, antha tranferable ku data va namma munnadiye
           STRINGSELECTION CLASS USE PANNI namma content oda patha(namma file loaction ahh) athula kuduthu than antha instance la ahh than 
           eduthu transferableku tharanum
         * owner null than,
         * "C:\\Users\\User\\Downloads\\mmmmmm.txt
         * 
         * 
        /*
 
      
      
        String filePath = "C:\\Users\\User\\Downloads\\mmmmmm.txt";

        StringSelection selection = new StringSelection(filePath); //itha stringselection oru string ahh plaintext convert panni atha object ahh tharum
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        
        //mele irukk 3 line la copy panni clipboard la file  location ahh potutan
        
        //ithuku appuram namma paste operation pannanum(ctrl+v)

        Robot rt = new Robot();
        /* inga robot class vachi namma keybord operationa hh panlam
           ithukku munnadi Ations class vachi keyboard operationa hh perform panniruppam, but inga atha use pannala yenna
           namma action Class ahh Web application based, web appliation kullaye namakku ethavathu keybard actions ahh simulate pananuna appothaiku
           use panlam, namma ippo windows based work pannitu irukurathaala, Robotvclass than use pannanum  
        
        //ippo nan paste panna poran
        rt.keyPress(KeyEvent.VK_CONTROL); //ctrl  //keypress kulla irukka keyevent ndra system virtual keybord kulla nan controll press pandran
                               // +
        rt.keyPress(KeyEvent.VK_V); //v //v ahh press pannitan , ippo ctrl+v press pannitan
        
        //control ahhyum release pandraan and v ya um release pandran
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyRelease(KeyEvent.VK_V);
        //ippo ctrl_v press pannitan, clipboard la irunthu FILEINPUT box ku location vanthurukkum,// clip board la recenta hh irukuratha copy pannitan
        //ippo nan enter pres pannanum
        rt.keyPress(KeyEvent.VK_ENTER);
        rt.keyRelease(KeyEvent.VK_ENTER);
        
        // so avlothan ithu oru method------------------------------------------------------------------------
        
        //2nd method: sendkeys
        
                       // namma upload pandran button ahh inxspect pannum pothu, athula ("type = "file") nu HTML la irunthathunnaa namma direct ahh 
                     //sendkeys use panni patha ahh kuduthu files ahh upload pannikalam
        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]")).click();
        
        driver.findElement(By.xpath("input oda xpath ahh podanum")).sendKeys("C:\\Users\\User\\Downloads\\mmmmmm.txt");
        
//        ----------------------------------------------------------------------------------------
        
//        3rd Method: executing javascript for click -->HTML la type=file illatahppo intha method use panlam
        //sils samayam namma upload button click pandrappo athu vela siyyathu antha samayathula namma JS use panni click pannikalam, athan than edpdinnu paaka poram
        
        //buttun ahh click panna popran click aagathu
        WebElement uploadbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
        //so
        //intha tha js Executer use apanna ppran
        //driver ahh javascript execter ahh mathi perform panlam, athukku driver ahh direct ahh JS ku assign panna mudiyathu , typecaste pannikuran
        
        JavascriptExecutor js =  (JavascriptExecutor)driver;
        //inga js class vachi athula irukku exectescript use panni athukulla 2 parameter ahh anuppa poran
        //onnu enna opertion panna ppran(buttuon ah click pannanum) , innonu entha ele,ent ku antha operation ahh panna poram
js.executeScript("argument[0].click", uploadbutton); //ipdibutton click panlam     
     
	}

}


*/
