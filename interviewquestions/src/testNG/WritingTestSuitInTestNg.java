package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WritingTestSuitInTestNg {
	
	//Aim: open chrome and go to
	// 1.google.co.in 2.bing.com 3.yahoo.com  and then close the browser
/*	
	
	@Test
	public void openGoogle() {
		// inga line 15 la irunthu thaan program start aagum , so athu start aanathu epp and athu end aanathu epponu ndra time ahh
		//nan  calculate pannikuran 
		
	Long starttime=	System.currentTimeMillis();
		
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
		Long endtime=	System.currentTimeMillis();
		 long totaltime = starttime-endtime;
		 System.out.println("total time taken for google " +totaltime); //total time taken for google -6359
	}
	@Test
  public void openBing() {
	  Long starttime=	System.currentTimeMillis();
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
		Long endtime=	System.currentTimeMillis();
		 long totaltime = starttime-endtime;
		 System.out.println("total time taken for bing " +totaltime); //total time taken for bing -7014
	}
	@Test
  public void openYahoo() {
	  Long starttime=	System.currentTimeMillis();
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.quit();
		Long endtime=	System.currentTimeMillis();
		 long totaltime = starttime-endtime;
		 System.out.println("total time taken for yahoo " + totaltime); // total time taken for yahoo -41195
	}
	
	*/
  
	
	//  total ahh 3 thukum 17 millseconds aayirukku, ippo client enta enakku time athigama irukku ithu la enakku time kammiya irukkanum
	//itha improv pamnni ithoda  execution time innum oraikanum client soldran, so athuku yetha maari naan improve pannanum
	
	//inha ovvoru time um 1 browser open pandran and tha close pandran and innoru browser open pandrana and athayum close pandran, athey maari 3ahh vathu
	// so intha 100 test cases iruntha enna seiya nammaku time than athugam aagum, so itha naan improve panna
	//oru time oru brower open pannitu athukulla nan bing and yahoo ahh open pannitu and final ahh oru time nan atha close pannita pothum
	
    //itha seiyya namma testNG la enna option iruuku epdi work pannuthunu paakalam
	// ithukku test case ennanan 1 time oru broser open aaganum, athula meethi 2 workahhyum pannitu last ahh 1 time atha close pannanum
	
	// athukku namma ********@beforesuite***** ndra Annotation ahh use panlam
	
	//********siute na ennana the collection of test case nu meaning
	
	// inga enakku ovvoru time um browser open aagi close pandtarthu oru time open aagitu antha 1 time 3 web pages ku poitu
	//last ahh 1 time mattum close pandran
	
	// first namma 3 test cases kulla(methods kulla) porathuku munnadi code mela irukka @beforesuite ahh paakum,beforesuite na
//	before all test cases in class nu meaning, so athukulla enna irukkunu paathu first atha pannum, ithula system starting time ahhyum 
	// oru browser open pandrathathayum eluthirukkan, class kulla  starttime and driver ndra 2 variablebls ahh declae panniran , yenna
	//class la irukka yela testkum athu commob thevapadum ndrthaala
	
	WebDriver driver;
	Long starttime;
	@BeforeSuite
	public void browserLaunching() { // step1 : inga varum inga browswer open pandran and tnoda startimg time eduthuran
		Long starttime=	System.currentTimeMillis();
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		
	}
	
	@Test  //ste2: alphabetic order la intha test case execute aagum
	public void openGoogle() {
	
		driver.get("https://www.google.com");
		
	}
	@Test
  public void openBing() {
	 
		driver.get("https://www.bing.com");
		
	}
	@Test
  public void openYahoo() {
	  
		
		driver.get("https://www.yahoo.com");
		
	}
	
	@AfterSuite // ella test cases um run aanathuku appuram aftersuit run aagum,and system la browser open aana time and end aana time ahh calculate pandran
	
	public void broswerClosing() {
		driver.quit();
		Long endtime=	System.currentTimeMillis();
		 long totaltime = starttime-endtime;
		 System.out.println("total time taken for yahoo " + totaltime);
		
	}

	
	
	
	
	
	

}
