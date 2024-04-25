/*
 * package datadriventutotials;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.testng.annotations.Parameters; import org.testng.annotations.Test;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class CorrectUsernameWrongPassword {
 * 
 * @Test
 * 
 * @Parameters({"username","password"}) // xml la irunthu paramter ahhkondu
 * varan so athoda name ahh inga podran public void
 * correctUsernameandWrongPassword (String usenamevalue,String passwordvalue)
 * throws InterruptedException {
 * 
 * WebDriverManager.chromiumdriver().setup();
 * 
 * WebDriver drive = new ChromeDriver(); drive.get(
 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 * 
 * Thread.sleep(4000); WebElement usernem =drive.findElement(By.
 * xpath("//input[contains(@class,'oxd-input') and contains( @name,'username')] "
 * )); usernem.click(); usernem.sendKeys(usenamevalue);
 * 
 * WebElement password = drive.findElement(By.
 * xpath("//input[contains(@class,'oxd-input') and contains( @name,'password')] "
 * )); password.click(); password.sendKeys(passwordvalue); WebElement
 * loginbutton = drive.findElement(By.xpath(
 * "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
 * 
 * loginbutton.click();
 * 
 * drive.quit(); } }
 */