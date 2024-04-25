package datadriventutotials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenusingApachePoi {
	
  static  List<String> username = new ArrayList<String>();
  static  List<String> password = new ArrayList<String>();
//step1:
	public void readExcel() throws IOException {
		//file location ahh read pandran
		FileInputStream excel = new FileInputStream("C:\\\\Users\\\\User\\\\Documents\\\\datasforcode.xls");
		//nan enna type la ennoda file la save pannirukano antha type ku yetha maari class kulla antha excell ahh tharan nan 97-2003 type store pannan so
		//hssf workbook class eduthukuran
        Workbook workbook = new HSSFWorkbook(excel);
        // worbook la irunthu sheet ahh athoda name or index use panni eduthukuran
        Sheet sheet =workbook.getSheetAt(0);
        //antha sheet la irukka ovvoru row ahh iterate pandran
        Iterator<Row> rowiterator = sheet.iterator();
       
        while(rowiterator.hasNext()) {
        	//ovvpru rows ahh poran
        	 Row rowvalue=rowiterator.next();
        	 
        	 // rows ella iterate pani athula irukka column values ahh edukkuran,so antha particular rrow ahh iterate pandran
        	
         Iterator<Cell> columniterator  =  rowvalue.iterator();
         //iterate pannatjuku aapuran column la poi curser nikkum, antha data irukka coulunmn ku munnadi irukka empty column la than nikkum
         //hasnexr use panni next column la value irukkanu paakurom, true na antha columnku po nu apdi nu sola hasnext() use pandran
         int i=2;	 
         while(columniterator.hasNext()) {
        		 //ippo apdiye ovvoru column ahh poitu irukkum, namakku ethu pasword and user name nu theriyathu, so oru poi paatha 2 la cell la username um 3rd cell la paswoed um irukkum
        		 //again iterate pandrappo 4th la username um 5th la passwod um irukkum, so odd number athu user namekum and  even number na athu passwod kum nan eduthu atha oru list la stote pannikuran
        		 // intha edythula epdi antha sheet la 2nd  and 3rd and 4t number varumnu kekkalam, but prohrammnku athu athu theriyum
        		 
        		 if(i%2==0) {
        	  username .add(columniterator.next().getStringCellValue()); // we can use ToString here to cover cell into string
        			                                                     // inga ulla irukka cell value string ahh irunthanatha apdiye eduthukum,
        			                                                     //athanaala than getStringCellValue() use pandram.
        		 }else {
			 password .add(columniterator.next().getStringCellValue());
				}
        		i++;
        		
        	 }
        }
        
	}
	/* ipdi tha ippo list la cell values store aayirukkum
	 * username[Admin, Admin, knkdi, khjdok]
	  password[admin123, mkjskk, admin123, kjdkmkn]
	 */
	
//step3: ippo xl sheetla irukka datas ahh eduthu pichi username and password ndra list la vachirukkan, aippo antha list kulla irukka
	//ovvoru data vayum elemnt ku parameter ahh pass pannanum, ovvor element num pothey list la irukka ellathayum for loop pottu kudukalam
	public void testececute() throws InterruptedException {
     
		for( int i = 0; i<username.size(); i++) {
			 login(username.get(i), password.get(i)); //username list la irukka first index value ahh edukkum and password la irukku 1st index value ahh edukkum
		}                                            //rendu parameter kum values send pannitan
		
	}
	
	
	
	
//step 2:	
public void login(String usenamevalue,String passwordvalue) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement usernem =driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'username')] "));
		usernem.click();
		usernem.sendKeys(usenamevalue);
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'oxd-input') and contains( @name,'password')] "));
		password.click();
		password.sendKeys(passwordvalue);
		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginbutton.click();
		driver.quit();
}
	
public static void main(String[] args) throws IOException {
	DatadrivenusingApachePoi usingpoi = new DatadrivenusingApachePoi();
	usingpoi.readExcel();
	System.out.println("username"  + username);
	System.out.println( "password" +password);

}
}