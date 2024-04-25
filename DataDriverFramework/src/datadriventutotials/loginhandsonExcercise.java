package datadriventutotials;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class loginhandsonExcercise {
	
	String[][] data;
	
	@DataProvider(name ="login") 
	public String[][] dataprovider() throws BiffException, IOException {
		
		return data =ecxelvalues();
	}
	
	
	
	public String[][] ecxelvalues() throws BiffException, IOException {
		
		FileInputStream excel = new FileInputStream("‪C:\\Users\\User\\Documents\\Book2.xls");
		 Workbook worbook = Workbook.getWorkbook(excel);
		Sheet sheet= worbook.getSheet(0);
		int rows = sheet.getRows();
		int column = sheet.getColumns();
		 String rowsandcolumndatas[][] =   new String [rows-1][column]; //4*2 ku oru array create pandran ithan ennoda 2d array size 4*2(username and pawd venandrathaala)
		                                                                //row-1 potrukkan
		 
		 for( int i=1 ; i< rows; i++) {
			 for( int j =0 ; j < column; j++) {
       rowsandcolumndatas[i-1][j]	= sheet.getCell(j, i).getContents();
       System.out.println(rowsandcolumndatas);
       
			 }
			 
		 }
		return  rowsandcolumndatas;
	
	}
	

@Test(dataProvider = "login")
public void findingElemtstoPassLogingvalues(String usenamevalue, String passwordvalue) {
	
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

}
