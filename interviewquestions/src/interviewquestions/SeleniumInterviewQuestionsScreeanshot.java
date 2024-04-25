package interviewquestions;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SeleniumInterviewQuestionsScreeanshot {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium_tutorials\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        
      /*  
        //ippo screen edukkanunaa,naan Takescreenshot ndra interface la use pannanum
        TakesScreenshot screenshot = (TakesScreenshot) driver; // TakesScreenshot interface ku driver ahh pass pannanum
                                              //verumdriver thanthaa error varum yenna, 
                                             //drive is webdrivers instace so atha eduthu screenshot la vaika mudiyathu
                                             // so namma atha type cate pannikanum Takesscreenshot ahh
        //ippo edutha screenshot enna output type nu solli atha store pannaaum, apdinna ithan namma source file, namma edukka pora screen shot
        //store aagur EDAM
        
       File sourcefile= screenshot.getScreenshotAs(OutputType.FILE);
       
       //ippo intha file file ku oru plave ready pannanum, athavathu namma file enga store aaganunu sollanum, athukku namma
       //File method use pannikalam, and ippo ennoda source file ahh athavathu screenshot edutha file ahh puthusaa create panna
       //file location la kondu poi paste pannanum, athuku **** commons.io **** nu jar download panni athula irukka package ahh
       // FILEUTILS ahh use pannanum
       
       //or 
       
       //apdi jar download panni panna vennamna, namma selenium la *** Filehandler ndra **** method vachi copy panlam
       //but athu sopaq.selenium la irunthu import pannanum
       
//       first file classku object create panni athoda mela irukka screen shot ahh store pandrathukku
       
       File destinationfile = new File("D://sample2.png"); // d drive sample.png oru file create panntan
        
//       FileHandler.copy(sourcefile, destinationfile); //or
         FileUtils.copyFile(sourcefile, destinationfile);    /*
         
//   ---------------------------------  alerts screenshot   ----------------------------------------------------
         
			/* naan normal ahh oru web page la poi screen shot eduthutan, aana enakku ippo oru alert click pannitu antha 
			 * alert varum pothu athayum sethu screenshot edukanum,  
         // namma page la rukka alert button a ahh click pandran
        
       
        
        WebElement ele =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
        ele.click();
        
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourcescreenshot =  screenshot.getScreenshotAs(OutputType.FILE);
          File destinationfile =  new  File("D://alertscre.png");
          FileUtils.copyDirectory(sourcescreenshot, destinationfile);
          
			/* ippo nan alet ahh click pannitu screenshot edukka try panna varathu, yen tha vatha alert ahh handle panna ma 
			  nammalala ethum seiya mudiyathu  so UnhandledAlertException: intha error varum, s itha handle panna than 
			  ***ROBOTS*** use pannanum, appo than screenshoot edukka mudiyum
			  *
			     */
        
//  --------------------------------    screenshot by using ROBOTS for hadnling alerts    -------------------------------------------------------------------     
        
      /*
        
        
        WebElement ele =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
        ele.click();
        // step1: create robot class
            Robot robot =new Robot();
         // step2:screensize edukkanum
             Dimension sreensize= Toolkit.getDefaultToolkit().getScreenSize();
         //edutha screensize ahh rectangle class la tharanum
              Rectangle rectable = new Rectangle(sreensize);
          ////finaly screensht edukurom, screencapture ndran robit class method use panni
            BufferedImage imgaefilesource =  robot.createScreenCapture(rectable);
          //screeshot store panna place soldran
          File destinationfile = new File("D://robotimg2.png");
          
          // fnall ahh image ahh write pandran
          ImageIO.write(imgaefilesource, "png", destinationfile);
        
        */
//-----------------------------------  again code try panni paakuran -----------------------------------------------------------       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
