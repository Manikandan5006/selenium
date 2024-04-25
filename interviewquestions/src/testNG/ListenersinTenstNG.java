package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ippo nan listner eluthittan, ippomnan oru class kulla intha listener kudutha antha class la ethavathu oru method fail 
//aana inga irukka irukka method onna athu automatic ahh eduthukum, so testNG la poi intha listener ahhyum entha class intha
//lister use pannanundratha yum sollanum

 public class ListenersinTenstNG implements ITestListener{
	
	// nan listener eluthittan so itha ellathayum namma engayum call panna nundra avasiyuam illa namma test execution ahh poruthu athuve call aagigkkum
//	ithula irukka methods ku suite aagura maari iruntha
 
	@Override
	public void onTestStart(ITestResult results) {  //
		System.out.println("test case is going to execute");
		
	}
	
	@Override
    public void onTestSuccess(ITestResult results) { //oru test case success aanathuku appuram enna pannanundratha sollalam
		System.out.println("test case is passed");
	}
	
	@Override
    public void onTestFailure(ITestResult results) { //oru test case fail aanathuku appuram enna pannanundratha sollalam
		// ippo oru vela ui automation pannitu irukkomnu vachipom, ui ethavathu oru reason kaaga fail aagirukkum, antha samayathula screen shot edutha use fulla ha irukkum
       //so namma implement pamndrappo, ethavathu oru method fail aana automatic ahh intha method call aagum, suppose ippo oru test case fail aaguthu antha samayathula intha method namma  write panni vachiruntha direct ahh inga varum inga namma
       //screenshot edukkura process ahh eluthi vachiruntha athu auto matci ahh fail anna test case ku screenshot eduthu kudukkum
		System.out.println("test case is failed");
  }

	@Override
   public void onTestSkipped(ITestResult results) {
		System.out.println("test case is skipped");
      }

	@Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult results) {
	
		 // ippo oru 100 test cases irukku athula oru 10 test case irukku apdinna nammaku 90% sucesss thana,  anthha maari case faile aayiruchu
//		but sucess percentage la tha irukku apdinna enna pannalam apdingaratha inga eluthalam
		System.out.println("test case is within success rate");
	
       }

	@Override
   public void onStart(ITestContext context) {
		
		// onstart naellathukum munnadi ithan nadakkum, athukappuram tha onteststart nadakkum, 
		//ella mudichathuku appuram on finish nadakkum
		System.out.println("test case is start before everything");
	
        }
 
	@Override
    public void onFinish(ITestContext context) {
		System.out.println("test case is finished after everything");
		
	}
	


	
	
}
