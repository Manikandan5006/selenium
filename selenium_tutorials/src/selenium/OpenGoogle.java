package selenium;

import java.awt.RenderingHints.Key;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                                                 //ithula ennoda project ennanna first nan googlechrome open pannanum
		                                                 //and 2nd nan google home page poganum
		
		                                                 //1.open chrome
		                                                 //2.google home page
		
		                                                 // ippo first nan namma code ku namma first chrome browse ahh open panna soldram, so athu entha broweser nu
		                                                 // sollanum and athu entha browswer la irukkundrathayum sollaum.
		                                                 // ippo namma normal ah chrome p0ganumna manual ahh dektop poi chrome click panni ulla polam, but, namma code ku athu theruyathu so 
		                                                 //namma than athuku athoda name and atgu enga irukkunu sollanum, 
		                                                 //so athukku than namma set property use pandram
		
		                                                 //System.setProperty("name", "location");//  inga key vanthu namma  enna browser use panna poram and athoda name enna , and value vanthu athoda executable file athavathu antha browser oda driver file enga irukku(location)
        
		                                                 // :name
		                                                 //ippo normal human na name chrome nu kuduthale therichurum ,
		                                                 //but inga namma selenium ku athoda name la than sollanum.ex WEBDRIVER.CHROME.DRIVER nu podanum
		                                                 // intha nam ahh kuduthu ta selenium vanthu ok ivanga chrome browser use pandraangunu identify pannikum
		
		                                                 //: location
		                                                 //ippo ocation epdi kukkanum entha edathula irunthu antha exe file ahh edukkanumna, ippa namma chrome use panna poramna namma chrome driver install pannanum
		                                                 //atha poitu namma download pannikanum, naan ithula download pannitan, ippo ennoda complier ku chrome browser tha use panna poram nu theriyum
                                                         //C:\Users\User\eclipse-workspace\selenium_tutorials\src\chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
		
		                             //ippo nan antha browser ahh open panna sollanum, athuku namma selenium use pannanum, athula irukka web driver ahh concept ahh use pannanum, yenna browser related ahh panna vendiyathu ellam selenium la than pannanum
		                            //so
		                          //webdriv 
		                       /* mela irukuratha potutu nan ctrl+space aluthuna namma selenium related aana proposals ellam varanum, but varala so
		                        nammku intha project la java mattum than use pannitu irukkum, so ethavathu keyword potutu. press panna java oda keywords mattum than varum, 
		                        but namma ithula browser la work pandrathuku selenium concept use pandrathaala, selenium related aan entha oru keyword or proposas um varala 
		                        so namma selenium oda library ahh add pannanum, so intha project kku antha library oda path ahh add pannanum
		                        so intha project oda name selenium tutorial, atha right click pannitu build path -->configure build path -->libraries-->add external jars */
		
		                       /* namma java va use panni than code elutha poram , java vaala enna panna mudiyumo atha java la eluthippom
		                        *  additional ahh namma seiya vendiya task , oru web application kooda interact panna vendiya task ellam namma java la  panna mudiyathu so namma selenium ahh athukku refer pannika porom */
		 
		WebDriver driver = new ChromeDriver();// open chrome // inga webdriver ndrathu selenium oda majar component, intha lne fulla execute aagum pothu puthusaa oru chromebrowser launch aagum 
		
		                       // ithuvaraikkum code run panna output varum oru puthu chrome page open aagum,
		
		                       //ippo naan antha browser kitta google .co.in ndra url ahh eduthut va apdinnu soldram
		
		                       //so ippo namma oru url ahh get panna poram
		
		//driver.get("http://www.google.co.in");     //google home page  // so munnadi verum browser matuum vanthathu google illama ippo google ndra url ahh namma kondu vanthurukkum
		
                                                     //ippo intha browser ahh namma close pannanum athukku namma get.close and get.quite use panlam
		
		//driver.close();-------                     // ithu use panna current window mattum than close aagum which is selenium running the automated tests, remaining windows
		                                             //session actve la than irukkum
		
		
		//driver.quit();--------                      // but quite ndrathu all browser windows ahyum close pannirum
		
		                                              // ippo nan inga google la oru term search pannanum and antha term search panna udane athula  vara oru particular link ahh or search 
		                                             //result ahh mattum enakku eduthu kudukkanum antha maari nan code eluthanum
		
		
		                         //enter search term
		                         //click the wikipedia link itha thaan naan pannanum
		
		
                                 /*apdi pannum pothu googple page la or oru website la irukka ellame oru elememts than, example oru page ipen aana udane
		                    athula theriyura gmail ndra word, login, athula irukka box, image ndra word, ipdi athula paakura ellame oru elememts than
		                         atha vachithan ippo namma namaku thevaiyana visiyatha panna poram */
		
		                  /*namma fidElelnt use pandrappo athu oru 8 important parameters irukku  
		 *               className(string classname)  ====>student===>id,name,classname,xpath,cssselector,tagname,linktext,partiallink text
                                    .cssselector(string cssSelector)
                                    .id(String id)
                                    .linktext(string link text)
                                    .name(string name)
                                    .partiallink Text(string PartialLinkText )
                                    .tagname(string tagname)
                                    .xpath(string xpathExpression)
                         
                                -----------sendkeys--------------------
                                                                         */
		                       /*google la page inspection la poi search box oda  name eduthutu , ippo antha search box la automatica nan oru text ahh anuppa poran, send keys use panni namma
		                          anupavendiya text ahh anupalam
		
		                        ippo nana ennoda search term ahh ula kudutha udane atha enter button press panni earch panna vaikanum illa si athukku, nan 
		                        send keys koodave .keys nu pottu ennoda keyboard enter buttonayum ulla anupuran so athu automatic ahh search term ahh enter pannirum */
		
	//1.driver.findElement(By.name("q")).sendKeys("trichy" + Keys.ENTER);
		
		                       /* ippo namma epdi link kooda interact pandrathunnu paapom
		
		                       ippo nan mela irukka chrome page ahh open pannama , intha project excersize ku , 
		                       vera oru .com pottu directaa antha page kku pora maari link ahh tharan, so mela irukka chrome opening
		                       page ahh naan comment panniran  and 1.driver.findElement(By.name("q")).sendKeys("trichy" + Keys.ENTER); intha line ahhyum comment panniran */
		
		
	//4.driver.get("https://www.leafground.com/link.xhtml");
	                  
		
		                    /*---------- LINKTEXT() AND CLICK------------------------

		                     * 1.ippo nan intha page la poi oru link ahh click pannananu, so athuku antha link ahh findout pannanum, so antha page la poi inspect pnni
		                          athukulla anthatage kulla oru text irukkum athu thaan link text, yenna namma oru link ahh acess pannanumna link text method use pannikalam
		                     2. so antha text ahh eduthu potutu atha naan click pannanum, so click method um use pannikiran
		                     3.ippo automatic ahh antha page ku poi and dasboard poi automatic ahh atha click aggirum */
	 //2.driver.findElement(By.linkText("Go to Dashboard")).click();
	 
	                        /* ippo nan inga lovcatervalue athavathu antha text perusaa irukku athukku pathilla antha text la irukka sila word ahh mattum
	                         * illa athula irukka konja text ahh mattum tharanunnu nenacha namma partial link text use pannikalam,
	                         * 2.driver.findElement(By.linkText("Go to Dashboard")).click();  so intha code mella comment pannitu keela vera partial
	                         * link text ku eluthuran
	                         
	                         * --------------  PARTIALLINKTEXT()------------------------ */
	
	 //3.driver.findElement(By.partialLinkText("Dashboard")).click();
	 
                            /*  ippo namakku ore perula rendu link iruku , apdi irukkumm pothu athula oru link ahh nan click panna poran, apdi pannum pothu
                             * athula ethu seekiram nakkumna selenium antha page first entha link kooda interact pannutho, 
                             * first identify panna element matching ahh iruntha athukooda interact pannum atha than execute pannum */
		
		
		                     /* ippo namma enga Partiallink text ahh  use pannuvomna , ippo nammakitta oru webpage irukku athula CONTACT nu oru
		                      * element irukku ippo future la ath CONTACT OUR SERVICE nu maathiran, ithuve LINKTEXT use panni contact ndra element edukkanumnu 
		                      * nenaikum pothu anga page la namma CONTACT ku pathila CONTACT OUR SERVICE nu maathitom , so athala find panna mudiyathu error
		                      * varum, so athukku than namma PARTIALLINKTEXT use pandram,athula match aagura oru word ahh pathutu atha access panni excute pannum selenium
		                      * inga munadiyum contact nu ippaum contact our service nu irukku so common ahh contact irukku atha partial link text la thanthutaa atha eduthu kudukkum   */
	 
		
		              //naan text boxla work panna porathala, mela irukka 4.driver.get("https://www.leafground.com/link.xhtml"); intha link ahh eduthutu naan innoru link ahh pottukuran
	 
	      //-------- WORKING WITH TEXTBOXES----------
		
	driver.get("https://www.leafground.com/input.xhtml");
		
		
		                       // textbox ahh oda id find panni athukulla ennoda text ahh tharan
	
	                  // -------------type name .-----------------------------
	
//	 driver.findElement(By.id("j_idt88:name")).sendKeys("manikandan"); // or intha code ahh naan ipdiyum human readable format ku ethamaari eluthalam, itha namma oru instancla save pannitu antha instance ahh next operation use pannikuran 
	
    WebElement entername = driver.findElement(By.id("j_idt88:name"));
    entername.sendKeys("Manikandan");
		
		                     /*-------------------Append another word --------------------
		                      
		                      *  next naan oru element find panni athula  already irukka letters or term oda extra innoru term APPEND pandran,
                                eppovum oru element ahh find out panni athula sila operationa hh pannanumna , antha tage la namma, id, name ,class,  inthamaari
		                        attributs ahh vachithan pannuvomm, apdi ithu ethum illana ,namma athoda ---XPATH--- VACHI pannuvom, 
		
		                     -----------Xpath ------------------ inga x path ndrathu  element antha browser la antha page la entha edathula irukkunu kanndupudichu athavachi
		                       operation pandrathu , XPATH EDUKKANUMNA page la poi inspect panni, antha element ahh hover panni highlight panni right click 
		                       panni copyXpath nu xpatha ahh edukkalam*/
		
		                     //-------- inga direct ahh APPEND panna method illa, irukkura txt oda sethu innoru text ahh sendkeys send pandran
		
//	driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")).sendKeys("the text is added"); // inga xpath la // (double slash)ndrathu ---> relative xpath nu solvom (single slash) potta athu absolute xpath nu solluvom
                           //or
	WebElement addtextintextbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[2]/div/input"));
	addtextintextbox.sendKeys("the text is added");

                        /* impotrant: selenium la oru text ahh apend pannum pothu already irukkura text oda amma thara textum append aagirum 
                         * atha overide pannathu**************/

		                 /* --------------------- retrieve word in prompt from textbox or element -------------------
		                  * 
		                  *  ippo already oru text box la irukka text ahh nan get or retrieve panna poran ,ippo nan text ox kulla irukka value ahh get panna poran, 
		                    atha apdiye edukka mudiyathu, so forst nan name ahh vachi antha element ahh access pandran,ippo HTML paatha theriyum antha elelment la poi namma get panna vendiya
		                    value ennanu paakurom ie: namma thevaiyaana term and athu entha attribute la irukkunu paathutu , antha attribute eduthu athukana value la paatha nammakku thevaiyana term edukkalam
		                    romba simple ahh athu entha attribute la irukkunu paathu athoda valu(namaku thevaiyaana text)e ahh edukkanum, 
		
		                    finala hha kandu pudicha term ahh edutha odane atha print pandran, 
		                    so element ahh kandupudichu athula irukka atribute ahh pathu athoda value ahh edutha naama ippo atha 
		                    oru instance la store pannitu, atduthu atha print panlam  */
		
//   String values=  driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"); // inga attribute oda value ahh edukuram angthan namma edukkavendiya word irukku
	//or
	WebElement gettingvaluefromtext = driver.findElement(By.name("j_idt88:j_idt97"));
	String value = gettingvaluefromtext.getAttribute("value");//vaue eduthu ippo itha oru string datatype pottu oru intance create panni antha instance ahh print panlam
	System.out.println(value);
	//System.out.println("this is the word taken from the textbox element"+values);
		
		                   /*-------clear text-----*/
	
	//driver.findElement(By.id("j_idt88:j_idt95")).clear(); //or
	WebElement cleartext = driver.findElement(By.id("j_idt88:j_idt95"));
	cleartext.clear();
	
	                     /*------- find the text box is disabled or not-------*/
	                    
	                     /* ippo namma oru textbox disbaled la irukkuna atha namma epdi kandupudikurathunna, first antha element ahh eduthukanaum
	                      * element find pannitu(id,classname,name,xpath, tagename,linktext,partial link text ithula ethavathu onnu use panni find pannu ) antha 
	                      * element la disable nu potrukka attributre ahh edukkanum , eduthu selenium method la isenabled method use panni find pannikalam*/
		
	
  WebElement disabledchech= driver.findElement(By.name("j_idt88:j_idt93"));
  Boolean result = disabledchech.isEnabled(); //is enable ahh irukkanu paakum, illa disabled la than irukku so result false nu varum 
  System.out.println(result);
   
              
                             /* ----------------Type email and Tab. Confirm control moved to next element -------------------    
                                  
                         * ippo namma textboxla emaila la type pannitu  tab press pannanum, apdi pannum pothu antha elentla irunthu next 
                           element ku controle poganum */
  
                                              // Find the email input field
  WebElement inputfield = driver.findElement(By.id("j_idt88:j_idt99"));
                                              // Type the email address
  inputfield.sendKeys("rsviji5@gmail.com");
                                            //Simulate pressing the Tab key
  inputfield.sendKeys(Keys.TAB);
                                           
                                           /*namma ta ahh press panna udane aduthu enga antha element poganunndratha element ahh 
                                            *find panni anthu switch aaga vaikanum*/
                                   //Find the next element where focus should have moved
  WebElement nextelement = driver.switchTo().activeElement();
                                       /*switches the WebDriver's focus to a different contex
                                         In this case, we are switching to a different target, which is the active element on the page.
                                         returns the currently active element on the page.
                                         An active element is the element that currently has focus, meaning it is the element
                                         that would receive keyboard input if the user were to type something. 
                                         For example, if you were to click on a text input field, that field becomes the active element.*/
                                   //Confirm that control has moved to the next element
      String tagname =  nextelement.getTagName();
      System.out.println(tagname);
         
                                    //----------------- Just Press Enter and confirm error message*  ---------------
     driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
     
     
  
     /* ---------------------------------- puriyala and padikkanum	                            //------------------ Click and Confirm Label Position Changes -----------------------
      //// Find the element to click on
      WebElement elementtoclick = driver.findElement(By.className(""));
      //find the initial position of the label
      WebElement initiallable = driver.findElement(By.id("j_idt106:j_idt113"));
      initiallable.getCssValue("position");
      //click the element
      elementtoclick.click(); */
     //-----------------------------------------------------------Type your name and choose the third option---------
      
      
        driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("viji"+ Keys.ENTER);
        driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("subha"+ Keys.ENTER);
        driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("harshitha"+ Keys.ENTER);
      
      
      //name type pannitan i[po naan dropdown menu button ahh kandupudichu athula irunthu 3rd option ahh select pannanum
        
        WebElement dropdownbuttun = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/button"));
        //ippo nan dropdown la oprtions ahh select pannanumna, SELECT method ahh use panni athu la argumentahh 
        //nan find panna dropdown element oda instance ahh pass pannanum
        
        Select select = new Select(dropdownbuttun);
        select.selectByIndex(3);

      
  
	     
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
	}

}
