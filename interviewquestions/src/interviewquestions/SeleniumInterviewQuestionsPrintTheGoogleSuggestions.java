package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewQuestionsPrintTheGoogleSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("game of thrones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
List<WebElement> ele =driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li"));

//(//ul[@role='listbox'])[1] this is for fir ul in the lot of ul tag
// (//ul[@role='listbox'])[1]//li we can use this
//(//ul[@role='listbox'])[1]//following::li we vcan use this
   
   //excecise 1:
/*  ippooru particular position la irukura serac sugestion ahh  click pannu nu soldran , so antha position ahh denote panna int position=0 nu 
  assighn pannikuran
  ippo position ahh 0 nupotutu atha ulla kondu poi increment apnna, starting la first position o nu potrukkan , so loop irukka irukka first element
  varum, next position 1 increment aagum and again loop la irukka irukka 2nd lelemnet varum and againl lop la irukka position ah 1 increment pandran
  ithey maari ovvoru element varappayum position onnu increment aahyite pogum, so oovoru element ahh for loop edukum pothu athoda position enakku
  enanu theriyathaundrathaala nan chumma velya oru position potu assighn pannitu atha loop la ovvoru element varum pothum antha position ahhyum change
  aggura maari panna antha appo vara elementyum and appo vara position ahh vachi namma sila operations ahh panlam
   ippo enakku 2 vathu element varum pothu loopla anga position la yum 2 nu varum so, 2 um match aagumara maari thaana so 
//
2.antha 2nd element ahh access pannanumna nan antha positon ahh use pannikalam, ithua yen use pandran na ennanala oru list kulla index use panna mudiyathu
  find elelemnets use panni antha elements ahh eduthu list la store pannum pothu athoda instance vachi ennala get index use panna mudiyum
  but ithulve antha loop ahh for each la or for la kuthu ovvoru elementa hh edukkum pothu angga ennala index use panna mudiyathu  */

/*
         int position=0;
             for (WebElement allele : ele) {
	         System.out.println(allele.getText());
	         position=position+1; //ot position++;
	
	
	            if(position ==3) {
		     allele.click();
		      break;
            	}
                  } */

//excecise 2: oru search seuggestion la irukka partiular  teram ahh contain panniruntha ex: game of thrones netflix la irukka "netflix" ndra term

//athukku nan get text vachi atha seilam

for (WebElement allele : ele) {
String textsinlist = allele.getText();
    System.out.println(textsinlist);
    
    if(textsinlist.contains("netflix")) {
    	//ippo intha term vantha naan allele ahh click panna poran
    allele.click();
    break;	
    }
    


      
   	}
         
		


	}

}
