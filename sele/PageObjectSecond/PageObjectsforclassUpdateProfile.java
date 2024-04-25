package PageObjectSecond;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectsforclassUpdateProfile {
	
	
	@FindBy(xpath = "//*[@id=\\\"fadein\\\"]/div[2]/div/div/div[2]/ul/li[3]/a")
	public static WebElement profile;
	
	
	@FindBy(xpath = "//input[@id='Phone' and @name='phone'] ")
	public static WebElement phone;
	
	@FindBy(xpath = "//*[@id=\\'Address']\" ")
	public static WebElement address;
	
	
	@FindBy(xpath = "//*[@id='profile']/div/div[6]/button ")
	public static WebElement clicksubmit;
	
	

	
	
	
	
	
//--------------------------------------------------------------------------------------------------------------------	
	//  namma inga irukka first 3 useranme , password , submit intha page kum varuthu so  already LoginPageObjectsForLoginTestCaseclass la objects
	//eluthirukkam, so atha namma update profile ndra clsss ku kondu poi reuse pannikalam
	
	/*
	public static WebElement username( WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("submitBTN"));  }   */
//	----------------------------------------------------
	/*
	public static WebElement profile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[2]/div/div/div[2]/ul/li[3]/a"));
	}
	
	public static WebElement phone(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='Phone' and @name='phone']"));
	}
	
	public static WebElement address(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'Address']"));
	}
	
	public static WebElement clicksubmit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
	}*/
	
	

}
