package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectSecond.LoginPageObjectsForLoginTestCaseclass;
import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class LoginTestCase {
	
	 
	public void logintest() throws InterruptedException {
	
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		driver.get("https://phptravels.net/login");
		
		// page object model ahh find elements use pannama nammalala oru elemet ahh find mudiyuma nu kettal mudiyum, atha page factory
		//vachi pannalam athula @find mu oru method irukku atha use panni panlam, athum elements ahh find pandrathuku than
		                               //-----------------------------------------//
		PageFactory.initElements(driver,LoginPageObjectsForLoginTestCaseclass.class);
		
		//inga keela irukka 4 code ahh execute pandrathuku munnadi namma wendriver ahh inialise pannanum,illana nulponterexception adikkum
		
		//veruma @findy potrukka nala athu automatic ahh webdriver mooliyama initialise aaggikaathu,, namma oru webelement ahh find pannanumna oru webelement venum
		
		//ithukku munnadi intha class class la intialise panna driver ahh (WebDriver driver = new EdgeDriver()) ahh namma pageobject model ku
		
		//inga irunthu anuppi vittam athavathu driver.ithan athu (LoginPageObjectsForLoginTestCaseclass.username(driver).sendKeys("user@phptravels.com")); 
		
		//anga method la intha webdriver ahh receive panna webdriver driver ahh (public static WebElement username(WebDriver driver) { ) kuduthom
		
		// so page facrory namma use pannathaala namma pagefactory la irukka initelements ahh use panni, driver ahh kudukanum and antha driver ahh entha element ku
		
		//kudukkanumnu sollanum, inga namma LoginPageObjectsForLoginTestCaseclass ku than driver ahh kudukkanu, yenna anga tha nan elements ahh find pannirukkan
		
		//driver kudutha thaana page oda interact panni elements ahh edukkum so athukku than , *** itha mela initialise pannirukkan ******
		
/*	   LoginPageObjectsForLoginTestCaseclass.username.sendKeys("user@phptravels.com");
	   LoginPageObjectsForLoginTestCaseclass.password.sendKeys("demouser"); 
	   LoginPageObjectsForLoginTestCaseclass.hide.click();
	   Thread.sleep(2000);
	    
	   LoginPageObjectsForLoginTestCaseclass.submit.click();              */
		
		
		
		
		
		
		
		
		
//---------------------------------------------------------------------------------------------------------------------------
		
		//PageOjcetsecond ndra package la irukka oru class la nan find [andra elemnts ahh thaniya potrukkan ,aana athukaana
		//webdriver ahh inga irunthu than naan send pannanum, so anga iruka class ahh inga pottru object  create panni, antha element 
		//kaana vaues ahh inga irunthu anuppanum
		
		//anga antha class la nann static nu pottathaala inga LoginPageObject ndra class ku object create pannamaey nan anga irukka
		//methods ahh use pannalam apdinna antha class name ahh direct ahh pottu use pannikalam 
		// apdinna ***            LoginPageObjects loginobj = new LoginPageObjects();
		//                          loginobj.username(driver).sendKeys("user@phptravels.com"); apdinna podama
		//     LoginPageObjects.username(driver).sendKeys("user@phptravels.com"); ipdi pottukalam atha keela potrukkan
		
//		LoginPageObjects loginobj = new LoginPageObjects();
	/*	
		LoginPageObjectsForLoginTestCaseclass.username(driver).sendKeys("user@phptravels.com");
		
		LoginPageObjectsForLoginTestCaseclass.password(driver).sendKeys("demouser");
		
		LoginPageObjectsForLoginTestCaseclass.hide1(driver).click();
		
		LoginPageObjectsForLoginTestCaseclass.submit(driver).click();        */
		
		// innoru class la intha 3 elements um find pannndra maari vantha inga already namma eluthirukka intha page objects ahh
		// namma puthusa elutha pora classkum tharalam
		
		
		
		
		
		
		
		
//--------------------------------------------------------------------------------------------------------------------------------	
		
		/*   
		 * intha elements ahh ellam namma thaniya oru class create panni (anta class tha pageobject model) athula antha class la
		 * methods create panni athula irunthu namma inga return pannanum
		 * 
		 
		 * WebElement username= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 * username.click(); username.sendKeys("user@phptravels.com");
		 * 
		 * WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 * pwd.click(); username.sendKeys("demouser");
		 * 
		 * WebElement login = driver.findElement(By.id("submitBTN")); login.click();
		 */
		 
//		 driver.quit();
		 
		
	}

}
