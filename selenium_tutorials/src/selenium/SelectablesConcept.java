package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/list.xhtml");
        
        // ippo page la oru list of elements irukku atha ellathayum than naan findelements la eduthu list storre pannikanum 
        
//        naan list of elements ahh eduthu work panna poran , so nan athoda main xpath ahh eduthuthu, athu la xpath oda size paakum
        // pothu  size 1 nu varum , xpath mothathayum 1 ahh eduthukum, so nan xpath pudiyura edathula last la " /li " ahh yum potukura, ippo size
        //ethana elements irukko athana elements ahhyum kaatum.
        
        //broup of elements eduthu work pannum pothu namm xpath use pandrathu thaan nallathu
        
        List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"j_idt111\"]/div/div[2]/ul/li"));
        int siszee = selectable.size();
        System.out.println(siszee);
        
//        ippo naan continues ahh 3 element ahh click pannanum,
        //so athuku ctrl+ antha 3 elelemtns ahhyum click pannanum, so ithula namma keyboard and mouse operation rendayum senthu use panna poram
        
       //Athukku ACTIONS CLASS ahh use pannikuran
     /*   
        Actions action = new Actions(driver);
        
        //KEYDOWN ---> apdinna press pannite irukurathu artham
        //KEYUP-----> apdinna oru key ahh release pandrathunnu artham
        
        // inga findelements la xpath use panni ella elements ahh eduthu list la vachirukkan, so naan atha index use panni access pannikalam
        //inha normal ahh sipmle click um panlam, but naan clik kulla ennoda list of elements ahh thanthu and athoda gt use panni index eduthu 
        //antha elements ahh acces pandran
        
        action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
        
        //itheye namma innoru method la seiyalam DRGAND DROP use panni */
        
      List<WebElement>secondselectable = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
        int size2 = secondselectable.size();
        System.out.println(size2);  
        
        //simple way la multiple elements ahh click panni select pandran
        Actions action =new Actions(driver);
        
        action.clickAndHold(secondselectable.get(0));
        action.clickAndHold(secondselectable.get(1));
        action.clickAndHold(secondselectable.get(2));
        action.build().perform();
        
        
        
        
	}

}
