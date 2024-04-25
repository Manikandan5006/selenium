//package PageObjectSecond;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class UpdateProfile{
//	
//	@Test
//	public void update() throws InterruptedException {
//		
//		
//     WebDriverManager.edgedriver().setup();
//		
//		WebDriver driver = new EdgeDriver();
//		
//		Thread.sleep(3000);
//		driver.get("https://phptravels.net/login");
//		
//		PageFactory.initElements(driver,LoginPageObjectsForLoginTestCaseclass.class);
//		 LoginPageObjectsForLoginTestCaseclass.username.sendKeys("user@phptravels.com");
//		   LoginPageObjectsForLoginTestCaseclass.password.sendKeys("demouser"); 
//		   Thread.sleep(2000);
//		   LoginPageObjectsForLoginTestCaseclass.hide.click();
//		   Thread.sleep(2000);
//		   
//		   LoginPageObjectsForLoginTestCaseclass.submit.click();
//		
//	  PageFactory.initElements(driver,PageObjectsforclassUpdateProfile.class );	 
//	  Thread.sleep(1000);
//		PageObjectsforclassUpdateProfile.profile.click();
//		PageObjectsforclassUpdateProfile.phone.sendKeys("87687686868");
//		PageObjectsforclassUpdateProfile.address.sendKeys("yyuhvhfhgj");
//		PageObjectsforclassUpdateProfile.clicksubmit.click();
//		
//	}
//	
//	
//	
//	
//	
//}