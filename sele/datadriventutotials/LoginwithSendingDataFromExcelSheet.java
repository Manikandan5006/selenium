package datadriventutotials;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginwithSendingDataFromExcelSheet {
	       WebDriver driver;
	       
	       String[][] data=null;
	       
	       @DataProvider(name ="logindatas")
	       public String[][] testdata() throws BiffException, IOException {
	    	   
	    	   data=excellSheetdatas();
	    	   return data;
	       }
	       
	   public   String[][] excellSheetdatas() throws BiffException, IOException{
		   
		   FileInputStream excelfile = new FileInputStream("C:\\Users\\User\\Documents\\datasforcode.xls");
		   Workbook excelworkbook=Workbook.getWorkbook(excelfile);
		  Sheet excelsheet=excelworkbook.getSheet(0);
		  int datainrows=excelsheet.getRows();
		  int dataincolumns=excelsheet.getColumns();
		  String rowsandcoulumnsdata[][] = new String[datainrows-1][dataincolumns];
		  
		  for(int i =1 ; i<datainrows; i++) {
			  for( int j =0 ; j < dataincolumns ; j++) {
		rowsandcoulumnsdata[i-1][j]  =  excelsheet.getCell(j, i).getContents();  
			  }
		  }
		return rowsandcoulumnsdata;
		   
	   }
	       
	   
	@Test(dataProvider ="logindatas" )
	public void correctUsernameandCorrectPassword(String usenamevalue,String passwordvalue) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");

		
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		
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
	
	
	
}
