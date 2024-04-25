
/*
package selenium;




import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadinfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        
        WebElement upload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
//        upload.click();
        
//        or using JS to click button
        JavascriptExecutor Jster = (JavascriptExecutor)driver;//driver ahh Js ahh matthi webpage work panna poran, so driver oda functionalites ahhum use pannikalam
        Jster.executeAsyncScript("arguments[0].click", upload);
        
        
        //windowpopupla file locationahh paste pann poran
        
        StringSelection ss = new StringSelection("C:\\Users\\User\\Downloads\\mmmmmm.txt") ;//string ahh plaintext and transferable ahh matthitan
        //atha clicpboard ku transfer panna poran
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        //javaoda class Robot use panni windowpopla key actions panna poram
        
        Robot rt = new Robot();
        rt.keyPress(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_V);
        // clip board la recenta hh irukuratha copy pannitan
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyRelease(KeyEvent.VK_V);
        rt.keyPress(KeyEvent.VK_ENTER);
        
        //avlothan
        
	}

}
*/
