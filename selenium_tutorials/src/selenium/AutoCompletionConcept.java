package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/AutoComplete.html");
        
         //ippo oru oru letter type panna odane ,namakku suggestion la anth letter related ahh irukka ellame show aaganum and namma
        //athula namakku thevaiyanatha choose pannanum.
        
        //1.1st antha input areakku naan text ahh enter pannanum
        
        
        WebElement sendingletter = driver.findElement(By.id("searchbox"));
        sendingletter.sendKeys("E");
        /* inga naan kandippa oru method use panniye aaganum illanan, ithu work aagathu, ennana, ippo nan oru key ahh kuduthutan athavathu
         * text ahh kuduthutan  kudutha odane athula irunthu antha text ku related ahh irukka ellathayume kshow panna oru popup or antha list of 
         * available word ahh ellam show panna oru promt open aaganum la, athukku konjam tim dukku, ippo exampleku naan antha text ahh mattum kuduthutu
         * skeela for loop la irukka antha text ku related aanatha search pannitu irukkum, but aana namma kudutha word or kaatum aana select pannathu , yenna
         * namma key ahh kudutha odane keela for poi theda aarambikkum, antha list of available options la poi select pannathu ,yenna antha available 
         * options open aaga late aagum, so namma inga explicit wait time oonu kudukkuram(thread.sleep)
         * , ithu enna pannaum, namma thara letter ahh enter pannitu antha available oprtions vara varaikum wait pannum ,yenna athukku than namma time kuduthurukkam
         *   */
        Thread.sleep(10000);
        
        List<WebElement> listofelements = driver.findElements(By.xpath("//*[@id=\"menucontainer\"]/ul/li"));
       System.out.println( listofelements.size());
//      char name =  listofelements.toString().charAt(5);
//      System.out.println(name); 
      
        
        for (WebElement serchableelementsinlist : listofelements) { //ippo ithula ella list fof elements um irukkum, eelemetns la irukka textum namma
        	                                                   //find panna vendiya textum same nu paathu atha edukanum
        	if(serchableelementsinlist.getText().equals("Egypt")) { //get text na antha tage kulla irukka visible text ahh edukkum, 
        	                                                    //athayum enakku thevaiyaana word yum pottu compare panni, ok nan atha click pandran 
        		serchableelementsinlist.click();
        		System.out.println("selectedtext" + serchableelementsinlist.getText());
        		break;
        		
        	}
		}
        

	}

}
