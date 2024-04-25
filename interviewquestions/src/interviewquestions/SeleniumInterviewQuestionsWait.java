package interviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\interviewquestions\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		/*2.ippo nan webbrowser kitta naanedukukka pora element unta ippo illa naalum intha time vara wait pannu athkull no such element
		   exception ahh kuduthuratha nu soldran, so intha elements ahh proceed pandrathuku munnadi ithana second s wait pannu apdinnu
		   implicit wat() use panni soldram
		   
		   pros:
		   ------
		  intha implicit wait() ndrathu driver initialise ahgi namma antha driver ahh driver.quit()  potu quite panndra varaium
		  athukulla irukka ella elements ku intha implicit wait() porunthum , so driver intialise panna odane wait ahhyum initialise panniranum
		  
		   cons:
		   ----- 
		   ippo implicit wait use panddra thaala intha implicit wait enna pannnumna, namma element ulla irukka illayanu ellam
		   paakathu, antha elemnt visible hh irukka, anthaelement ahh interactabl  ahh illayannu paakathu, apdi mpaakama athioda work ahh
		   process pannum
		    atahavathu  element irunthalaey pothum nu wait() operation pannum
		    
		   
		   
		    */
		
		driver.navigate().to("https://www.leafground.com/waits.xhtml");
		
		
		 WebElement elel1 = driver.findElement(By.id("j_idt87:j_idt89"));
		elel1.click();
		
		WebElement txt = driver.findElement(By.id("j_idt87:j_idt90"));
		txt.click();
		
	 /* 1.inga naan oru element ahh click pannitu athoda action nadakurathuku munnadi athula irukka innoru element ahh nana access panna
		  try pandran , nan clcick pana element ye innum process panni muduiklla driver la(webpage)  athukku timeuse panni ithana sec apuram than
		  athu open aaganunu program eluthirupaaga , athukulla athula irukka innoru element ahha 
		  access panna try pandrathaala. no such elelmnet error varum, ith overcome panna thaan namma **waits** londu vanthom */
		
		//so namma driver kitta odane antha element click panni innoru elementa hh pannum pothu odane exception tharavendam
		// oru particular seconds wait pannunu solla poram, implict wait() method use panni	
        	
		
		
		

		

	}

}
