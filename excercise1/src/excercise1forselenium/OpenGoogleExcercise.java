package excercise1forselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGoogleExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\excercise1\\src\\excercise1forselenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
//	driver.get("http://google.co.in"); 
	//navigating to the target page
	driver.get("https://www.leafground.com/input.xhtml");
	WebElement enterText = driver.findElement(By.id("j_idt88:name"));
	enterText.sendKeys("Harshita");
	WebElement appendText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
	appendText.sendKeys("  text added");
	WebElement retrieveText = driver.findElement(By.name("j_idt88:j_idt97"));
	String value = retrieveText.getAttribute("value");
	System.out.println(value);
	WebElement clearTExt = driver.findElement(By.id("j_idt88:j_idt95"));
	clearTExt.clear();
	WebElement disabledtextboxcheck = driver.findElement(By.id("j_idt88:j_idt93"));
	Boolean result=disabledtextboxcheck.isEnabled();
	System.out.println(result);
	WebElement inputarea = driver.findElement(By.id("j_idt88:j_idt99"));
	inputarea.sendKeys("harshi5@gmail.com");
    inputarea.sendKeys(Keys.TAB);
    WebElement nextelement = driver.switchTo().activeElement();
    String tagname = nextelement.getTagName();
    System.out.println(tagname);
    
	
	


	}

}
