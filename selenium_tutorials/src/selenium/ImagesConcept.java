package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //oru image broken image ahh illayanu kandu pudikurathu
        driver.get(" https://demoqa.com/broken");
        
        WebElement imageele = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/img[2]"));
        
        //oru image broken ahh irukka nu epdi find pandrathunna, naturam width ndra oru css property ahh vachi find pandlam
        // antha naturalWitdth =0 vaa iruntha antha image broken image nu sollalam
        
        if(imageele.getAttribute("naturalwidth").equals("0")) {
        	System.out.println("image is broken");
        	}
        	else {
        		System.out.println("image is not broken");
        	
        }

	}

}
