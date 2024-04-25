
package interviewquestions;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumInterviewQuestionsSwitchToActiveElement {

	 static WebElement q ;
	
	public static void main(String[] args) {
		
		// find elementey use pannama namma oru search term enter pannanu
		//inga css selector, idname, x path, nu ethyum use pnna koodathu, but search term ahh input area la enter search pannanum
		
		/*
		 * athukku namma swithto().activeElement() use panlam yenna namma page open
		 * panna odane namma paathurupppom namma curser automatic ahh antha input
		 * areala blink aagitu irukkum, apdinna athan active la irukkunu meaning so
		 * namma switch to active element kuduthutaaley namma search term enter
		 * panniralam
		 */

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		driver.switchTo().activeElement().sendKeys("csk \n");
		
		// 2nd way:
		 // find element use pannamaley namma 	PAGEFACTORY vachi koda panlam, apdinna namma webelement oda name or id itha directaa kuduthey namma lala
		//search panna mudiyum
		
//		step1: name or id ahh direct ahh namma varible variable name ahh use panna apdinna nammalalam panna mudiyum
//		so nan google inspectt panni antha search box oda name paakuran athu vanthu "q" so atha variable name ahh mela potru page factory vachi atha initite 
//		pannanum
		
//		itha main class la podanum , main obeject ku veliya
		PageFactory.initElements( driver,SeleniumInterviewQuestionsSwitchToActiveElement.class );
		
		q.sendKeys("rrr \n");
		
		
	}

}
