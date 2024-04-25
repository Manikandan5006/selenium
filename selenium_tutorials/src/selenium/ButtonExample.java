package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.leafground.com/button.xhtml");

        
        // ------------------ position of element - --------------------------
        
        /* oru button oa position ahh nan kandupudikkanum, antha element ahh eduthutu, instance create panni webelement la save pannitu
           ipposelenium point class irukka get location method use panni antha instance oda locationa ahh therinchuklam, getlocation la antha button oda
           x and y location ahh eduthu position ahh find panniakalam.*/
        WebElement position = driver.findElement(By.id("j_idt88:j_idt94")); 
        Point xypoint = position.getLocation();
        int x= xypoint.getX();
        int y = xypoint.getY();
        System.out.println("x" + x +"y" +y);
        
        //-----------------finding color of the button ---------------------------        
         /*     property   : value  
         /*     Background : red;  --->background is property and red is value 
          * ippo nan background colour  edukkanum, so background clour ndra prperty ahh eduthuta nann athoda value ahh get panniralam*/
        
        
        WebElement buttoncolor = driver.findElement(By.id("j_idt88:j_idt96"));
        String bgcolor= buttoncolor.getCssValue("Background");
        System.out.println(bgcolor);
        
        // Find the height and width of this button
        WebElement buttunsize = driver.findElement(By.id("j_idt88:j_idt98"));
        int bsizeheight = buttunsize.getSize().getHeight();
        int bsizewidth = buttunsize.getSize().getWidth();
        System.out.println("height" + bsizeheight + " width" + bsizewidth );
        
        //click and g home
//      driver.findElement(By.id("j_idt88:j_idt90")).click();
     // Check if the button is disabled
        WebElement disablebutton = driver.findElement(By.id("j_idt88:j_idt92"));
        String name = disablebutton.getText();
        System.out.println(name);
     // Check if the button is disabled
        if (disablebutton.isEnabled()) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
        
           //----------------------- Mouse over and confirm the color changed -----------------------------
        
        //find the element
       WebElement targetelement =driver.findElement(By.id("j_idt88:j_idt100"));
       
       //find the color before hovering the mouse
       String initialcolor = targetelement.getCssValue("background-color");
       //create action object to perform some mouse and keyboard actions
       Actions action = new Actions(driver);
       
       //namma entha element mela mouse curser vachihover pannanumo antha element ahh action object use panni mouse ahh hover pandram
        action.moveToElement(targetelement).perform(); //MoveToElement methond namma mouse ahh antha element mela vaikaporannu sollum
        
       // Get the color of the element after hovering
        String colorafterhover = targetelement.getCssValue("background-color") ;
     // Compare the colors to confirm if the color changed after hovering
        if(!initialcolor.equals(colorafterhover)) {
        	System.out.println("color changed");
        }else {
        	System.out.println("color not changed");
        }
        
        //------- puriyala----------------Click Image Button and Click on any hidden button -- wrong code--------------------
        
        // Click on the image button
        WebElement imagebutton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        imagebutton.click();
        
     // Click on the hidden button
        //WebElement hiddenbutton = driver.findElement(By.cssSelector("input[type='hidden']"));//
        //hiddenbutton.click();
        
        
        //How many rounded buttons are there?
          List<WebElement> allelements =driver.findElements(By.cssSelector(".rounded-button"));
          System.out.println("total rounded buttons"+allelements.size());
        
       
	}

}
