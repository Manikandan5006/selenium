package selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class TablesConcept {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.leafground.com/table.xhtml");
        
        /*
//        driver.get("https://letcode.in/table");
          driver.get("https://seleniumpractise.blogspot.com/");
        
        
        
      driver.navigate().to("https://www.leafground.com/table.xhtml");
        
        // finding no of columns in the table:     
        
        WebElement table = driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]/div[3]")); 
       List<WebElement> noofcolmns = table.findElements(By.tagName("th"));
       int totalvlmns = noofcolmns.size();
       System.out.println(totalvlmns);
       
       
       List<WebElement> noofrows = table.findElements(By.tagName("tr"));  // finding no of rows in the table :
       int totalrows = noofrows.size();
       System.out.println(totalrows);
       
       
      
      WebElement ff = driver.findElement(By.id("form:j_idt89_data"));
      List<WebElement> tuu = ff.findElements()
       
       
       
       
       
   
    
//    WebElement secondpagebutton = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_paginator_bottom\"]/span/a[2]"));
//    secondpagebutton.click();
//    WebElement seccondpagetable =driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]/div[3]"));
//    List<WebElement> noofcolmns2ndpage = seccondpagetable.findElements(By.tagName("tr"));
//    int totalvlmns2 = noofcolmns2ndpage.size();
//    System.out.println(totalvlmns2);
//    
    
//    WebElement trdpagebutton = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_paginator_bottom\"]/span/a[3]"));
//    trdpagebutton.click();
//    WebElement thirdpagetable =driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]/div[5]"));
//    List<WebElement> noofcolmns3ndpage = thirdpagetable.findElements(By.tagName("tr"));
//    int totalvlmns3 = noofcolmns3ndpage.size();
//    System.out.println(totalvlmns3);
//    
//    WebElement fthpagebutton = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_paginator_bottom\"]/span/a[4]"));
//    fthpagebutton.click();
//    WebElement fourthpagetable =driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]/div[6]"));
//    List<WebElement> noofcolmns4thpage = fourthpagetable.findElements(By.tagName("tr"));
//    int totalvlmns4 = noofcolmns4thpage.size();
//    System.out.println(totalvlmns4);
//   
   
//    WebElement fifthpagetable =driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]/div[6]"));
//    List<WebElement> noofcolmns5thpage = fifthpagetable.findElements(By.tagName("tr"));
//    int totalvlmns5 = noofcolmns5thpage .size();
//    System.out.println(totalvlmns5);
 * 
 
                                       */
        
    /*
     * 
     //------------------ no of headers in tables and their names ------------------
     
        
    WebElement simpletable = driver.findElement(By.id("simpletable"));
    
    List<WebElement> tableheaders = simpletable.findElements(By.tagName("th"));
    
    int sizes = tableheaders.size();
    
    System.out.println(sizes);
    
   List<WebElement> ele =simpletable.findElements(By.cssSelector("th "));
   for (WebElement webEle : ele)
   {
	 String names =  webEle.getText();
	   System.out.println(names); 
   }
  
	
//	-----------  3 rows al irukka table datas ahh edukkuran ----------------
	
//inga naan cssSelectot use pannikuran, athukla css selctor vachi neraiya type la elements ahh find panlam, ithula elemets kulla irukka
	//child elements ahh accees panni edukkuran
	
  List<WebElement> threerowsdats = simpletable.findElements(By.cssSelector("tbody tr"));
  for (WebElement first3rows : threerowsdats) {
	String namesof3clm =first3rows.getText();
	System.out.println(namesof3clm);

	
                    }
	/* ippo enakku ella row la yum irukka first column edukkuran  that means first column la irukka table data's edukkanum
	   athavathu firsr row la first column, and row la irukka first column and third row la irukku first coulumn
	
	   so inga first name coulmn irunthu fitst datavayum and second last name coulumn irunthu first datavayum and third coulmnla first datavayum edukka mudiyaathu
	   yenna column wise ahh edukka mudiyathu, athukku pathilla ella row avayum edutthu athula irukka fierst index ahh edutjhaaley pothum
	   1st row la index 0 and 2nd rows la ndex0 and third  row la index 0, so naan oru foreach pottu eduthukuran
	
	  so tr ahh eduthutu athula irukka index ahh edukkuran
	  alredy mela tr eduthu vachirukka so atha use pannran	
  
  for (WebElement firstvaluein3rows : threerowsdats) { // first 4 rows eduthu onunonna iterate pandran, apdinna athula 4 row  la irukka elements um irukkum
	                                                   //and atha elemts la td ndra tage ahh mattum edukkuran
	
	 List<WebElement>colum = firstvaluein3rows.findElements(By.tagName("td")); //so rows kulla irukka ellam table data td than, 
	                                                                               //athula irunthu firstrow irukka 1st clm td oda index 0
	                                                      //and 2nd row la iruka 1st td colun index0 athey maari thaam meethi ellam,
	                           //so intha each and every time iterate aagum pothu ovvoru td la irukka first column webelement va get(0) nu pottu edukuran, athula get text pottu athoda name ahh therinchukuran
//	WebElement firstval = colum.get(1);
//	System.out.println(firstval.getText());
	 WebElement secondval = colum.get(1);
	System.out.println(secondval.getText());
	
             }
  
	
	
//ippo raj ndra name eduthu avanukku present absend column la tick podnum
  
//mela irunthu table size ahh eduthu antha size ku etha maari iterate pandran
//and already ella rows ahh eduthu vachirukka threerowdata ndra instance ahhyum vachikuran
	
	for( int i=0 ; i< sizes ; i++) {
	List<WebElement>iterratedtablecolumns = threerowsdats.get(i).findElements(By.cssSelector("td"));// rows la irukka  ella index  element ahhyum eduthu athula (chetterjee,raj,iron) ahh athoda td ndra css selectors use panni edukuran
	                  WebElement index1coulmn   = iterratedtablecolumns.get(1);// ovvoru coulumn la irujkka athuala 1stindiex la irukka values ajhh mattum edukkuran
	                  String names = index1coulmn.getText(); //1st  indexoda name ahh edukkuran
	       if (names.equals("raj")) {
	    	   WebElement elementneedtotick = threerowsdats.get(0).findElement(By.cssSelector("input"));// motha row layum irukka 3vathu coulumn la irukka input ndrabtag ahh edukkthu atha click pandran
	    	   elementneedtotick.click();
	    	   break;
			
		}
	       
		
	}
  
	
	
	
        //find the tanle element
  WebElement mytable = driver.findElement(By.id("simpletable"));
  //takinh rows to display table size and header names
    List<WebElement> tableheares   =  mytable.findElements(By.cssSelector("th"));
    int tablesize= tableheares.size();
    System.out.println(tablesize);
    for (WebElement tablerownames : tableheares) {
		 String headername= tablerownames.getText();
		 System.out.println(headername);
	}
             
  //taking tables datas from each rows
    //getting table rows
    List<WebElement> tablerowdatas = mytable.findElements(By.cssSelector("tbody tr")); // 3 rows ahh eduthutan
   int tablerowdatasize = tablerowdatas.size();
		  System.out.println(tablerowdatasize);
	for (WebElement weachrowdatas : tablerowdatas) {
		String names = weachrowdatas.getText();
		System.out.println(names);
	}
	
//	taking table dara from the 2nd coulumn
	for (WebElement secondclumn : tablerowdatas) {  //3 rows la irunthum, table datas irukka td dndra element ahh get panni athoda names edukuran 
		
List<WebElement> tdvalues =	secondclumn.findElements(By.cssSelector("td")); // elle td elements ahhyum get pannitan 
		
       WebElement firstclumnements = tdvalues.get(1); // athla first index elements ahh mattum thaiya eduthukuran
		String firstclumnvalues = firstclumnements.getText();
		System.out.println(firstclumnvalues);
	}
	
	// clicking the checkbox for only raj
	for (int i = 0; i <= 3; i++) {
		//index use panni motha TD elements ahhyum table la irunthu eduthu athula raj ndra table
		//dats ku mattum elementa hh click pandran
	List<WebElement> innerdatas = tablerowdatas.get(i).findElements(By.cssSelector("td"));
	
	WebElement innerdataname = innerdatas.get(i); 
	 String namess = innerdataname.getText();
	 if(namess.equals("raj")) {
		 tablerowdatas.get(3).findElement(By.tagName("input")).click();
		 
		 
	 }
	 }
		 */
		
	
	
	
//    -------------------------- ithu vara site la iruntu oru table excersise pandran site name mela irukku.driver.get la ---------
    /*      
    
    //for table headers  //table[contains(@id,'customers')]//th or how many columns
    
    // for all rows //table[contains(@id,'customers')]//tr
    
//    for all table datas in row wise  //table[contains(@id,'customers')]//tr//td --> ithula  ---------- harizontal wise ahh ts ahh edukalam
    //apdinna 1st or tr ku poi athula fulla irukka td ahh edukkalm
	
	
	 //all the rows and 2nd column in that
	//table[contains(@id,'customers')]//tr//td[2]
	
	
	List<WebElement> allrows = driver.findElements(By.xpath("//table[contains(@id,'customers')]//th "));
	System.out.println(allrows.size());
	for (WebElement ele : allrows) {
	String headernames = ele.getText();
	System.out.println(headernames);
	}
	
	//i am going to verify total country is 6 and ans also check java ids there or not
	List<WebElement> alldatainfirscolumn = driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr//td[1]"));
	List<WebElement> alldatasele = driver.findElements(By.xpath("//table[contains(@id,'customers')]//tr//td[2]"));
	for (WebElement we : alldatasele) {
		String name = we.getText();
		System.out.println(name);
		
	}
//	/----------------------------------------------------------------------------------------------
	
	 /*   ststus  company    contact    country    action
	     
	      -----  flipcart   selvi        usa       know morelink
	      
	               
	     
	      -----  amaxont    harshi         china       know morelink
	      
	            
	     
	      -----   ibmt       subha         india      know morelink
	      
	      
	      -----  selinuim    afra         india      know morelink
	      
	      ippo nan selenium ku munnadi irukka chechbox ahh click pannanun, inga ovvoru element um ovvoru element ku sibling than
	      
	      selenium ku pinnadi(following) afra sibling  and selenium ku munnadi(preceeding) antha chechbox sibling so ithey maari
	       itha vachi thaan namma xpatha eluthanum
	       
	       itheula naan table datas ahh edukkuran so first *td* potukuran so td ndra tag kulla athoda *text* ahh use pannikuran
	      next athu enna text nu taranum(*seleium*) nextu nan edukkura element selenium ku munnadi irukka, illa painnadi irukkanu eluthanum
	      (*preceding or following*) and next *sibling* nu pottu :: antha elemunk ogum athula antha check box *td* kulla *input* ndra tag la than irukku
	      
	   so xpath
	             //td[text()='selenium'] //preceding-sibling::td//input
	   
	 
	 driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
	 driver.findElement(By.xpath("//td[text()='USA']//following-sibling::td[1]//a")).click(); 
	 
	
	 */
	 
          
//---------------------------------------------------------------------------------------------------------------------------------
	 
	 
//---------------------------  another excercise from another website SORTABLE TABLE ------------------------------------------------
  /*       
	 
          
          //1.first element ahh click panna poran
          //2.CAPTURE ALL webelements in a list
          //3.capture text of all orignal elements into new(original) list
          //4.sort the original list of step 3
          //5.compare original list vs sorted list
          
          driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
          
           
          
        driver.findElement(By.xpath("//tr/th[1]")).click();
       
        List<WebElement> firtcolumnelemets = driver.findElements(By.xpath("//tr//td[1]"));
        
			/*
			 * 
			 * 
			 * List<WebElement> rowelements = driver.findElements(By.xpath("//tr//td[1]"));
			 * 
			 * for (WebElement iteratedrow : rowelements) { String firstcolumndatas =
			 * iteratedrow.getText();
			 * 
			 * System.out.println(firstcolumndatas); }
			 
          
          //so mela irukka for loop pottu pootu list of elements ahh handle pandrathuku pathila, new ahh namma *STREAM * 
          //          AHH USE PANNI ITERRATE PANLAM
        
        //for loop ku patila stream and map ahh use panni ielemnets kulla iterate panlam
          
          
        List<String> originallist  =firtcolumnelemets .stream().map(s -> s.getText()).collect(Collectors.toList());
        //inga firtscolumnelements ellam eduthu. stream kulla tharam , athu list aof objects ahh or sequences ahh handle pandrath
        //innum sola ponal athu oru pipeline maari firstclumn ndra list  la irunthu ovvoru elements ahhyum eduthu map kulla tharrum
        // intha map enna pannunna firtcolumnelemets  ndra list la irunthu stream valiya vara ovvoru elements ahhyum eduthukum, atha nan s ndra
       //variable save pannitu ippo s kulla ella elemets um irukkum athula iruntha nan getText mattyum edukkuran
        // ippo eduthathu ellathayum collectot ue panni collect panni athu oru list ahh maathikuran
        
        //return varathu List of strings ndrathaala athula List<Strings> eduthukuran
        
        System.out.println("originallist "+  originallist);
        
        List<String> sortedlist=  originallist.stream().sorted().collect(Collectors.toList());
        System.out.println("originallist "+  sortedlist);
  
        
    Assert.assertTrue(originallist.equals(sortedlist)); */
        
          
//	--------------------------------------------------------------------------------------------------------
	
//	-----------------------------------pagination  -------------------------------
        
        driver.get("https://datatables.net/");
//      first column datas #example >tbody >tr >td:nth-child(1)
        
     
        // en loop ethana thadava run aaganunu size edukkuran, ethana a tag irukko athu vara
//        ovvoru thadavayu ovvoru a link ku poi click panni athula irukka table data va oru list la edukka edkka poran
//        /oovoru thadavayum antha element ahh click panni edukkura data va store panni oru temporay list ahh create pannikuran
        //nan elements ahh  oru list ahh eduthu athula irukka text ahh list kulla anupuran , so nan data type ahh list string nu pottukuran
        
      List<String> storinglist = new ArrayList<String>();
      int asize = driver.findElements(By.xpath("//*[@id='form:j_idt89_paginator_bottom']/span/a")).size();
//      List<WebElement>  allele = driver.findElements(By.xpath("//*[@id='form:j_idt89_paginator_bottom']/span/a"));
      
      for(int i =1 ; i<=asize ; i++) {    	      	  String elemetnsneedtoiterate ="div.dt-paging.paging_full_numbers button.dt-paging-button[data-dt-idx="+i+"]";    	  //ovvoru pagekum poguthu    	 //inga naan ovvoru elemtayum click pannanumna again nan list of webelement kulla elements ahh edutu click pannanum/
    	  driver.findElement(By.cssSelector(elemetnsneedtoiterate)).click();
    	  List<WebElement> firstclmdata = driver.findElements(By.cssSelector("#example>tbody >tr >td:nth-of-type(1)"));    	  for (WebElement firstpagecolumndata : firstclmdata) {		String names =	firstpagecolumndata.getText();		   System.out.println(names);				}
      
    	  
    	  
      }} }
     
    
     
   	
    	
    	
    
    
    
        
        
	 
	
	
















