package PageObjectSecond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

     
public class LoginPageObjectsForLoginTestCaseclass {
	
	
//---------------------------------  PageFactory WithoutFindBy ----------------------------------------------------------------------------
	
//    Find element um use pannama and @FindBy um use pannama namma oru elementa ahh find panna mudiyuma nu ketta mudiyum,
//    namma HTML la la irukka antha elemnts oda name or ID ahh iruntha atha eduthu namma apdiye variable name ahh pottu kalam
//    apdi potta PageFactory Html ku poi antha name la id irukkanu paakum , apdi illana antha name la poi antha value irukkanu paakum, so name layum
//    id la yum antha antha value irukkanu paathu iruntha atha apdiye eduthukum, 
	
 //so namma find panna pora elements ala irukka name or id values ahh use panni variables create pannanum, and nama page factory use pandrathaala namma antha 
//   web elements munnadi kanndippa stati use pannanum, and athey mari intha method um page factory ndra thala ithukkum, driver ahh initialise pannanum
	
	  // drawback:
	
       // name oh id oh iruntha intha methodology use annikalam, illanan itha inthan method ahh use panna mudiyathu
	// selenium intha maari direct ahh elemets oda id or name ahh variable ahh use panna nera poi htm la poi first id ahh paakum and athukappuram than
	// name ahh paakum, incase id oda vaue um name oda value yum orey maari irunthu namma ella elments ahh find panna name ahh mattum eduthu
	// potrutruntha, compiler first id ah check pannum and athukappuram than name ahh check pannum, so namakku execution time increase aagum
	

	  
	public static WebElement email; //html intha element od id emeil nu than irukku
	
	public static WebElement password;
	
	public static WebElement cookie_stop;
	
	public static WebElement submitBTN; //ippo ithu ellathukum direct ahh values ahh namma send pannikalam
	
	@Test
   public void login() throws InterruptedException {
	   
	   WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		driver.get("https://phptravels.net/login");
		
		PageFactory.initElements(driver, LoginPageObjectsForLoginTestCaseclass.class);
		
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		cookie_stop.click();
		submitBTN.click();
		
		
   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//--------------------------------------------    @FindBy   ----------------------------------------------------------------------------------------------
	
	// page object modela irukka code innum, reduce panna namma selenium la irukka pagefactory use panni reduce panlam, apdinna
	//page object model innum enhace pandran
	
	// page object model ahh find elements use pannama nammalala oru elemet ahh find mudiyuma nu kettal mudiyum, atha page factory
	//vachi pannalam athula @findby mu oru annotation irukku atha use panni panlam, athum elements ahh find pandrathuku than
	
	
	/*
	  public static WebElement username(WebDriver driver) {
	   return driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 */
	
	//mela irukka maari elements find pandratha vida page factory use panni innum simple ahh find panlam, epdinna
	
	//Step 1: first oru variable create pannikanum
	
	//  public static WebElement username;   // inga username nu ru variable create pannirukkan, ,mela usename enter pandra elementa hh
	                                         // find pannatdrathukku namma oru username nu oru method create pannirukka maari than ithu , 
	                                         //antha method ku username peru vachirukkan
	                                         //inga username nu oru variable ahh create pannitan avlothan
	
/*	@FindBy(how = How.XPATH , using="//*[@id=\"email\"]") //nammBy.xpath nu podrame antha maari, usinh=//*[@id=\"email\"] ithu namma xpath
	public static WebElement username;
	
	
	@FindBy(xpath = "//*[@id=\'password\'] ") //or simple ipdi kooda pottukalam
	public static WebElement password; // webelemet name password and atha epdi find pandranna athoda xpatha vachi
	
	
	@FindBy(xpath = "//*[@id=\'cookie_stop\']")
	public static WebElement hide;
	
	
	@FindBy(xpath  = " //*[@id=\"submitBTN\"] ")
	public static WebElement submit;                           */
	
	
	// ippo find element ahh method create panni pottatha apdi code reduce panni inga eluthirukkan, pagefactory use panni
	
	//keela method la pannatha inga pagefactory la simple ahh pannitan ithan pagefacorty model, itha apdiye logintestcase class la kondu poi 
	//intha classname  vachi access panni kalam, like did foe pageobjectmodel
	//and athula than namma intha elements kaana values ahh thara poram or click pandram or sendkeys panni values tharalam
	
	
	
	
	
	
	
//---------------------------------------------  using Methods   -------------------------------------------------------------------------
	
	
	// naan munnadi PageobjectModel login page la oru element ahh find panni vachiruntha atha kondu vanthu , 
	//inga oru method eluthi athukkul pottu vaikuran
	

	//usename, password, submit
	/*
	public void username() {
		driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
	}
	
   public void password() {
	   driver.findElement(By.xpath("//*[@id=\"password\"]"));
	}
	

    public void submit() {
    	driver.findElement(By.id("submitBTN"));
    }
        
         *inga namma driver.findElement(By.xpath("//*[@id=\"email\"]")); nu podm pothu driver na ennanu theriyathu
         *so driver nam ennanu sollanum, namma page objectModel ndra packahe la irunthu nan elemets ahh iga kondu vanthan
         *so anga than WebDriver driver = new EdgeDriver(); ndratha mention pannirukkan, so anga irunthu nan webdriver ahh snd
         *pannanum, atha inga receive pannanum, and receive pannitu atha vara result ahh retun pannanum, athukku retun type element ahh
         *return pandrathhaala webelement nu retun type podanum appothan anga intha element kaana values ahh send panna mudiyum
         *
         */
	
//	--------------------------------------------------------------------------------------------
	
	
	/*
	  public WebElement username(WebDriver driver) { 
	  return driver.findElement(By.xpath("//*[@id=\"email\"]"));
	 
	 *ippo nan LoginTestCase la object create pannirukkan loginPageObjects ndra class la irunthu antha class ahhh kuduthu
	 *object create pandrathaala anga oru dependanct create aaguthu athuthaan dependancy injection nu solluvaanga, apdi dependancy 
	 *create pandrathu nallathu illa, 
	 *
	 *so namma irukka methods ku ellam static nu potranum, apdi potta intha class name ku namma anga object create pannamaley
	 *inga irukka methods ellam use pannikalam, so methods ellathukum Static nu podanum
	 *
	 *so webelement ahh find pandra ella methods ahh static ahh vaikurom
	 */
		
	/*	
		public static WebElement username(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		
	}
	
         public static WebElement password(WebDriver driver) {
	     return driver.findElement(By.xpath("//*[@id=\"password\"]"));
	     
	     
	}
         public static WebElement hide1(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"cookie_stop\"]"));
        	 
         }
         
      
         
         public static WebElement submit(WebDriver driver) {
             return driver.findElement(By.id("submitBTN"));
         }
*/
		

        	 
    	 //return driver.findElement(By.xpath("//*[@id=\"submitBTN\"]"));
    
	
}
