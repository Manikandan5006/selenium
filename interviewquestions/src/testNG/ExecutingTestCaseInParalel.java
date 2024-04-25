package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingTestCaseInParalel {
	@Test
	public void opengoogle() {
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.quit();
	}
	@Test
	public void openbing() {
		System.setProperty("WebDrver.chrome.driver","\"C:\\\\Users\\\\User\\\\eclipse-workspace\\\\interviewquestions\\\\src\\\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bing.com");
	driver.quit();
	}
	
	// ippo intha 2 test um onnu open aagi close aanathuku appuram innonu open aagi close aagum, rendum onnoda onnu depend panni illa rendayum onna run panna
	//rendum affect aagumndra maari entha situation ahhm illa, so nan rendu test case ahhum onna run panna mudiyum, atha ennala testNG la panna mudiyum


}
