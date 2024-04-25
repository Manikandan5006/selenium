package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {

	public static void main(String[] args) {

		/*
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
//        WebElement dropdownelement = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
//        ippo namma selectors ku oru object create pannanum, 
//        Select select = new Select(dropdownelement);
        //or we can store integer variable and pass that to the selectbyindex() or we can pass numbers directly
//        int myindexnumber = 2;
//      select.selectByIndex(myindexnumber);
        //--------------------------------------
      /* now i am going to show all the dropdown option on prompt
      List<WebElement> myoptions = select.getOptions();
      for( WebElement alltheoptionsinthelist:myoptions) {
    	  System.out.println(alltheoptionsinthelist.getText()); 
    	}
    	  */
//        dropdownelement.sendKeys("playwright");
      //----------------------------------=------
      
      
                 //and now i am going to select by -------- VALUE ------doubt in select topic and this code is wrong ------
             
//        driver.findElement(By.id("j_idt87:country_label")).click();
//     WebElement dropdownbyvalue = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]/select"));
//      Select select = new Select(dropdownbyvalue);
//     select.selectByValue("Germany") ;
////        
////     muliselectbox example
//     select.selectByIndex(1);
//     select.selectByIndex(1);
//     select.selectByIndex(1);         */


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/");
        
        //for table headers  //table[contains(@id,'customers')]//th or how many columns
        
        // for all rows //table[contains(@id,'customers')]//tr
        
//        for all table datas in row wise  //table[contains(@id,'customers')]//tr//td --> ithula  ---------- harizontal wise ahh ts ahh edukalam
        //apdinna 1st or tr ku poi athula fulla irukka td ahh edukkalm
        
        
        
		
		
		
		
    
        
        
	}

}
