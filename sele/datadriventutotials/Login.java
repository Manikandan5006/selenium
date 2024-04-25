package datadriventutotials;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/*
public class Login {
	
	// datas ahh  taharathuku oru method onnu create pannikuran and antha method ahh dataprovider ndra annotation use panni atha daata provde mmaathikuran
	// so athula  oru 2 dimentioan array onnu create panni values hh athula potukuran, ippo antha 2d data va nan
	//dataprovider method kulla retun pandran, anthya method ku mela @dataprovider ndra annotation pottu athukku oru name craete pannikuran
	// ippo ennoda datas ahh kudukurathukaatha fine panna elemnts irukka methoda ku intha @dataprovider anootation name ahh tharan @Test(dataProvider ="logindata" )
	
	
	//ippo intha datava excel sheetla irunthu read panni edukkuran
	
 String[][] Data=
	 {
		{"Admin","admin123"},
		{"Admin","hjhshh"},
		{"jghfh","admin123"},
		{"jghghgh","jgytftrg"}
		
	};
	
	
	@DataProvider(name="logindata")
	public String[][] logindataProvider(){
		return Data;
		
		
	}
	
	
// ippo intha method ku logindata  ndra @dataprovider name kuduthurukkan, so nera mela pogum, antha method etha retun
//	pannirukku paakum, Data ndra 2d string ahh mela irunthu eduthu return pannum.
	//ippo  {"Admin","admin123"} intha datas iterate panni String usenamevalue, String passwordvalue ku tharum , atha namma method kulaa use pannikalam
	//so dataprovider 2d data va onu onna iterate pannum , first data va edukkum  usenamevalue passwordvalue la kudukkum, antha firstvalue ahh method kulla use pannikuram
//	2 nd time athey maari iteration nadakkum, ithey maari 4 uteratuon nadakkum
	
	@Test(dataProvider ="logindata" )
	public void correctUsernameandCorrectPassword(String usenamevalue,String passwordvalue) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		WebElement usernem =drive.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'username')] "));
		usernem.click();
		usernem.sendKeys(usenamevalue);
		
		WebElement password = drive.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'password')] "));
		password.click();
		password.sendKeys(passwordvalue);
		
		WebElement loginbutton = drive.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		loginbutton.click();
		
		drive.quit();

}*/


public class Login {
	
	WebDriver driver;
	
	String [][] data =null;
	
	@DataProvider(name="logindata")
	public String[][] loginDataprovoder() throws BiffException, IOException {
		 data = logidadataactualdatasfromsheet();
		return data;
	}
	
	//namma excell sheet la irunthu datas ahh read panni edukka poram
	public String[][] logidadataactualdatasfromsheet() throws BiffException, IOException {
		
		//step1: data va athoda location ahh irunthu eduthu atha fileinputstreem ku thanthu read pandram
		
		FileInputStream excelfile =new FileInputStream("‪C:\\Users\\User\\Documents\\datasforcode.xls");
		
		//step2: intha excel afile ahh JXL jar la irukka oru method aana workbook ku tharanum, ithu yen ipdi tharamna , excell open
		//panna odane home page la new workbook, and new empty work book, and nammaold xl file nu neraiya varum, athula namma mela 
		//irukkaparticular locaton la  irukka excel ahh open pannu u soldran
		 Workbook workbook =  Workbook.getWorkbook(excelfile);
		 
		 //step3:
		    //oru excel sheet ahh open panniyachu. ippo athula sheet1, sheet2,sheet3, nudatas irukkum, atha athoda  sheet name ahh
		 //mention panni edukkama, or athoda indenukber pottu edukkalam index(0) ndrathu sheet1 ,  index ndrathu (1)sheet2 ,  index(2) ndrathu sheet3 nu varum
		 //so nan athoda index ahh pothu eduthukuran
		 Sheet sheet =  workbook.getSheet(0); // work book la irukka fitest sheet ahh eduthutan
		 
		 //step 4: ippo anth sheet la irukka rows and columns ahh edukkanum
		 
		  int rowscount=  sheet.getRows();  //2
		    int column_clunt=  sheet.getColumns();  //4
		    
		    //step5: edutha rows la irunthu first row that means athoda heading ahh thavira(username, password) metthil ellathayum eduthu
		    //oru array la vachikuran
		     String testdata[][] = new String[rowscount-1][column_clunt];
		     
		    //step6: ippo intha array la irukka datas ahh ellam nan for loop vachi onu onnu edukkanum, eduthu excel data kumu oru arry structure
		     //irukkum athula irunthu namma 2 dimentionl array structure kuka kudukkanum
		     // row ahh iterate panna oru forloop and athukulla column iterate panna oru loop
		     
		     for(int i= 1 ; i< rowscount; i++ ) { // oth row la username and pwd irukku, so atha vitutu 1st row la iterate aaga 1 lairinthu start pndran
		    	 for(int j = 0 ; j<column_clunt ; j++) {
		    		 //[0,1] admin              [1,1] padmin normal xl sheet la inth maari irukkum, atha namma 2d arrayla
		    		 //[0.0] admin             [0,1] admin intha maari irukumm, so 2d yetha maari index values ahh tharanum
		    		 //athavathu  [0,1] admin   nu normal xl sheet index la irukuratha [0.0] admin  ipdi 0.0 ku maathani tharanum
		    		 testdata[i-1][j]   =sheet.getCell(j,i).getContents();
		    	 }
		     }
		     return testdata;	 
	}
	// ovvoru time um browser open aagi close aagurtha thadukka oru time mattum open aagi last ahh close pandra maari test ahh maathikuran
	// ithula @beforesuite kooda use pandlam , but naan inga oru test case mattum eluthurukkanaala, @beforetest use panni atha seiran
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
	WebDriverManager.chromiumdriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
	}
	 @AfterTest
	 public void aftertest() {
		driver.quit();
	 }
	
	@Test(dataProvider ="logindata" )
	public void correctUsernameandCorrectPassword(String usenamevalue,String passwordvalue) throws InterruptedException {

		
		WebElement usernem =driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'username')] "));
		usernem.click();
		usernem.sendKeys(usenamevalue);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'password')] "));
		password.click();
		password.sendKeys(passwordvalue);
		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginbutton.click();
		
		


}  
}














