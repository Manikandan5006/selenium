package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/drag.xhtml");
        
//       -------------------- dragable ----------- doubt 
        
        Actions action = new Actions(driver);
        
      WebElement dragable = driver.findElement(By.id("form:conpnl"));
//        Actions action = new Actions(driver);
       action.clickAndHold(dragable).dragAndDropBy(dragable, 156, 234).build().perform();
        
//        ------------------------
        WebElement from = driver.findElement(By.id("form:drag"));
        WebElement to = driver.findElement(By.id("form:drop"));
        
       
        
        //action.clickAndHold(from).moveToElement(to).release(to).build().perform(); // inga  action.clickAndHold(from).moveToElement(to).release(to)
                                                                                 //itha build panni perform panna tha buld() . perform use pandram
        // or ipdi periya code podrathuku simple ahh oru code la panlam
        
        action.dragAndDrop(from, to).build().perform();
        
        WebElement clmfrom = driver.findElement(By.id("form:j_idt94:j_idt99"));
        WebElement clmto = driver.findElement(By.id("form:j_idt94:j_idt95"));
        action.clickAndHold(clmfrom).moveToElement(clmto).release(clmto).build().perform();
        
        
        
        
        
	}

}
