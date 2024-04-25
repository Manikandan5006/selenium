package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropSortableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/list.xhtml");
        
        Actions action =new Actions(driver);
        
        driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[3]/div/button[2]/span[1]")).click();
        
        WebElement toele = driver.findElement(By.xpath("//*[@id=\"pickList\"]/div[4]/ul"));
        List<WebElement> allele = driver.findElements(By.xpath("//div[@class='ui-picklist-list-wrapper']//ul[1]"));
       WebElement fromelement= allele.get(1);
//       WebElement toelement = allele.get(5);
       System.out.println(allele.get(1).getText());
       
       action.clickAndHold((WebElement) allele);
       action.moveToElement(toele);
       action.release();
       action.build().perform();
       

	}

}
