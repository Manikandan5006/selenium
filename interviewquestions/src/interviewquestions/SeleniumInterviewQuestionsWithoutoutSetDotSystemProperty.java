package interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsWithoutoutSetDotSystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		/*
		 
		  system.setproperty() illamaley namma broswe open panna mudiyumanu ketta mudiyum,
          athukku first namma chromedricerod aoda location ahh eduthu copy pannikanum
          and system la environmenet type environmental variable ahh select panni athukulla poikanum, athula total system ke namma environmental variable
          ah set pannanum, 
         1. go to environmental variable ---> 
         2.  go to system variables ----> 
         3. click the path and edit
         4.  C:\Program Files\Common Files\Oracle\Java\javapath 

                          ipdi ennoda path ithukku munndadi add pannirunthathu irukkum, athula poi namma : vachi
           nanna chromedrver location ahh set pannikanum

             C:\Users\User\eclipse-workspace\selenium_tutorials\src\C:\Program Files\Common Files\Oracle\Java\javapath 
                we dont need to mention tha chromedriver.exe here
           5. restart the system 
           6. we ca go and in cmd prompt. go to cmd  an type chromedriver
           7 . now i added the enviroment variable
           8. ippo nan eclipse poi class create pannitu thula system.set property pottu ennoda webdriver name and anthoda location ahh
          system.set property ndra line ahhye use pannama  direct ahh webdriver driver = new chromedriver(); mattum potu run panlam
    
		 
		*/
		
		//ippo run panna run aagum, intha system.set property oda vela ennana nanna intha ystem.set property la kukura link ahh system environmental
		//variables ahh poi temporary ahh atha set appanum, inga apdi pannama  naan direct ahh poi permanant ahh  anga poi set pannitan

	}

}
