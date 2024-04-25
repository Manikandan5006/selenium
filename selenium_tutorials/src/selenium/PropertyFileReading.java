package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileReading {
	
	

	public static void main(String[] args) throws IOException {
	
	/*
		// TODO Auto-generated method stub
		
//		ovvoru time um webdriver = driver podama irukka inga variable ahh potukuran
		WebDriver driver;
		
		/* ippo namma driver.setproperty la namma enna driver use panna poram antha driver oda location enga irukkunu namma solluvom
		//oru vela  atha apdiye clint kitta tarum pothu a namma system oru location la chromedrver irukkurarha namma eduthu set property l thanthathu
		 * avan system la epdi antha location la irukkum, oru vela ava chrome thavira firfox or, edge , ippdi etha vena use pannika aasa padalam
		 * but namma  oru driver use panni ithan use pannanumnu solla mudiyathu, so ethu ethellam easyaa vary aagumo  etheu ethellam uniform ahh irukkatho
		 * atha ellathayum configurable ahh veliya oru file ahh vaikanum,apdi irunthaa than code proper ahh work aagum
		 * illana code namma system la mattum than work aagum, client system la work aagathu
		 * 
		  
		     property file .properties ndra extension la mudiyum , intha property file  KEY= VALUE vaa than store aayirukkum  
		   
		   ithukku namma namma project mela right click panni file option la new file onnu create pannikanum, antha
		   file namma ENND BROWSER USE PANDRAM, AND ATHODA LOCATION ENGA IRUKKUNU POTTU VACHIKALAM
		   
		   POTUTU NAMMA program code la poi set property la chromedriverlocation kudukka vendiya edathula, namma intha file la 
		   irukuratha sollanum and athula file enna browser kuduthamo athayum sollanum          
		           
		  
		
		// ippo namma  config.properties ndra file la irunthu BROWSER AND DRIVER LOCATION hh edukka namma oru 
		//file input stream ahh use pannikanum
		
		//file inputstream la file ahh input ahh kudututan
		FileInputStream fileinputstream= new FileInputStream("config.properties");
		//ippo properties file ahh rad panna properties object create panni athula kudukkanum
		Properties properties =new Properties();
		properties.load(fileinputstream);
		//yen file ahh load pannitan ippo antha file ahh irukka enakku thevaiyana value ahh edukkuran
		// namma config.properties thara ella key = valueas ahh than tharuvom, so naan key ahh mattum kudutha pothum athu value ahh eduthu kudukkum
		
		// ** so athukku namma get property method use pannanum, key ahh kuduthutu atha string la store pannanum 
		
		
		 String browser = properties.getProperty("browser");
		 
		 // ippo location ahh edukkuran
		 String location = properties.getProperty("DriverLocation");
		
		
			/*
			 //--------------------------------------
			  //browser driver location ahh direct ahh tharaama file la irunthu eduthu
			  tharam System.setProperty("webdriver.chrome.driver",location ); WebDriver
			  driver = new ChromeDriver();
			 //--------------------------------------
		 
		 // ippo namma client cofiguration file enna browser or use pannalum atha open aagura maari eluthuran, avan oruvela
		 //chrome use panna chome open aaganum, firfox use athu open aaganum, but ithukku first clint antha file poi avanuku thevaiyana
		 // browser name and antha browser entha location la irukkunu avan eluthikalam 
		 //equalsIgnoreCase ethukunna oru vela end user or client vanthu file la captitals or cap+ small la eluthiruntha atha ignore panniru value va eduthukum
		 
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",location ); 
			 driver = new ChromeDriver();
			 //incase file la browser name firefox nu eluthirunthu athoda location  firefox  ku iruntha atha edukuran,
		 }else if(browser.equalsIgnoreCase("firfox")) {
			 System.setProperty("webdriver.gecko.driver",location ); 
			 driver = new FirefoxDriver();
			 
		 }
		 
		 // inga enna mater na useual ahh namma broser location ahh setproperty vachi eluthuvom(system.setproperty)
		 //inga file irukka propertry ya get panni podrom
		 
		 
		 */
		 
         //--------------------  mela irukka code ahh apdiye keela eluthuran ------------------------------------------------------------------------
		
		
		WebDriver driver;
		
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		Properties property = new Properties();
		property.load(fileinputstream);
		 
	 String browser =    property.getProperty("browser");
	 String location =   property.getProperty("DriverLocation");
	    
	    //System.setProperty("webdriver.chrome.driver",location);
	    //driver =new ChromeDriver();
	 //or
	 
	 if(browser.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver",location); 
		 driver= new ChromeDriver();
	 }else if (browser.equalsIgnoreCase("Firefox")) {
		 System.setProperty("webdriver.gecko.driver",location);
		 driver = new FirefoxDriver();
	 }
	    
	
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
