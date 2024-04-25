package selenium;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        /*
        driver.get("https://www.leafground.com/radio.xhtml");
        WebElement radiobtuutonelement = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
        
        // already select aayirukka illayanu kandupudikka
        Boolean butn1   = radiobtuutonelement.isSelected();
        
        radiobtuutonelement.click();
        
        // already page load aana udane select aayirukka raduio box btuun ahh find pandran
        
        WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
        Boolean unche = unchecked.isSelected();
        System.out.println(unche);
        
        */
        
//        ----------------------------------------------------------------------------------------
        
//        --------------------------  checkbox ------------------------------------------------

        driver.get("https://www.leafground.com/checkbox.xhtml");
        //----------------- normal checkbox -------------------
        
//        WebElement normalcheckbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
//        normalcheckbox.click();
        
//        --------------checkbox with popup ------------------------
        /*
        WebElement checkboxbtn = driver.findElement(By.id("j_idt87:j_idt91"));
        checkboxbtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*")));
        
         WebElement notifyup = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));  //--- doubt gowtham bro
         String popup = notifyup.getText();
         System.out.println(popup);
         if (popup.equals("checked")) {
             System.out.println("Notification popup is displayed with 'checked'.");
         } else if (popup.equals("unchecked")) {
             System.out.println("Notification popup is displayed with 'unchecked'.");
         } else {
             System.out.println("Unexpected notification text: " + popup);
//         } }*/
        
//  
        /*--------------------2 check boxes 1 is clicked already we need find that and unlick that , and click the unclicked  1st element
      
   
        WebElement firstelement = driver.findElement(By.xpath());
        
        if (firstelement.isSelected()) { // 1st element true nu varum yenn athu already unchecked la irukku
        	firstelement.click();
        	
        	WebElement 2ndelement = driver.findElement(By.xpath());
        	if (2ndelement.isSelected()) { // 2nd element false nu varum yenn athu already checked la irukku, so atha click panni uncheched aakuram
            	firstelement.click();
        }     */
        	//--------------------------------------------------------------------
        
//     -------------  tri state check box  -------------------
        WebElement triStateCheckbox = driver.findElement(By.id("j_idt87:ajaxTriState"));
       
        triStateCheckbox.click();
        Thread.sleep(3000);
        if(triStateCheckbox.isEnabled()) {
        	  triStateCheckbox.click();
        }
      

        
        
        
        
    
        
           
	}
	
	
         

}
