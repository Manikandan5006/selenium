package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");

  
         WebElement downloadlink = driver.findElement(By.id("j_idt93:j_idt95"));
         
        downloadlink.click();
        
        //ippo nan file ahh download pannitan, so nan athu download aagirukka, namma download loacation la irukkanu therinchukanum, athukku
        //1st namma download panna antha file file enga pogunnu therinchu antha sysytem la antha PATH ahh eduthu vachikanum
        //selenium vachi namma file system la iryukknu namma la therinchukka mudiyathu so namma, ithuku java tha use panni aaganum
        
        //java la FILE nu oru method irukku atha vachi nammaatha findout panlam
        
        //C:\Users\User\Downloads nan download panna intha location la than antha file irukkum so atha eduthu athukull 
        //download panna file irukkanu paakanum
        
        
        File files = new File(" C:\\Users\\User\\Downloads"); ////C:\Users\User\Downloads nan download panna intha location la than antha file irukkum so atha eduthu athukull 
                                                             //download panna file irukkanu paakanum
        //ippo antha patha irukka ella file ahh yum first list pannanum
        File[] totalfiles=files.listFiles();
        
        //foreach la pottu namma file it=rukkanu paakanum
        
        for (File evryfilesinpath : totalfiles) {
        	if(evryfilesinpath.getName().equals("TestLeaf Logo.png ")) { //oovoru file ahh poitu athoda name ahh vachi, namma download panna file name ahhyum vachi compare panni find pandran
        		
        		System.out.println("file is presrnted");
        		break;
        		
     
        
//        ------------------------ file uploading la doubt irukku   
        
//        WebElement fileid = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
//        fileid.click();
//         String myfle = C:\Users\User\Downloads\mmmmmm.txt;
//        		 
        
        
//       
        
        
        
        		
        	}
			
		}
        
	}

}
