package interviewquestions;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumInterviewQuestionsHandlingAuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// we cant do inspect that  authentocation popup  and we cant send keys
		// so namma username and password kuduthaa than login aagum
		
	   // inthamaari situation la namma thirt party image recognition tool***** SIKULI AND AUTOIT ***** use pannikalam
		//antha tool use panni username and password ndra tha mattum crop panni eduthu athu athu rendukun enna input podanumnu sollalaam
		//athey maari sighn in button crop panni eduthu athula click pannu nu sollalaam
		
		//BUT INTHAMARI PANDRATHU BEST PRACTICE ILLA, yenna third part tool la code eluthi atha kondu vantu selenium oda interact panna vaikanum
		// ithu velaiku aagathu so
		
        // ITHUKKU PATHILA NAMMA  user name and password oda credentials ahh namma direct ahh url valiyaave kudukkalam
		
		      //  http://username:password@url.com //Sending credentials via URL
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
	    
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth"); // ipo ithula autentication popup than varum nammalaala
		//send keys kudukka mudiyathu and inspect um panna mudiyathu
		//so namma direct ahh inth url laye password and user name ah sethu send pannidram
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");//username:password rendume admin thaan inga
		
		//ippo direct hahve username passsword ahh nan url ahh thanthaaala ipo direct ahh athu open panna udane site kulla login panni
//		poirukkum
		
	     
		
		

	}

}
