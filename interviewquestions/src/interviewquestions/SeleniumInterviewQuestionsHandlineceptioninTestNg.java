package interviewquestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class SeleniumInterviewQuestionsHandlineceptioninTestNg {

	
	// ippo oru test case ahh run pannum pothu athu intha exception tharum nu therinchu antha exception ahh athuku parameter ahh
	//kuduthutaa antha test case fail nu kaatama, pass nu kaatum , athu failnu kaatathu  run aagum an passed ku varum
	
	// ***** ExpectedException  ******* nu podanum
	
	/*
	   @Test(timeOut = 2000) public void timeout() throws InterruptedException {
	   Thread.sleep(3000);
	  
	   aagidum System.out.println("tttt"); }
	 */
	
	//ithula kandippa exception varum , yenna nan test cae ahh 2 sec la finish panna soldran, but athu ulla 3 sec eduthukuthu so exception
	//varum
	
	//intha case la namma ExpectedException use pannikalam
	
	
	@Test(timeOut = 2000,expectedExceptions =ThreadTimeoutException.class )
	public void timeout() throws InterruptedException {
		Thread.sleep(3000);  // inga test case ulla 3 sec wait pannisollirukkan, but ennakku intha test case 2sec la execute aaganum
		                    // so automatic ahh ithu fail aagidum
   System.out.println("tttt");
      }
}



/* -------   OUTPUT----failed nu varama passed nu vanthuruku
 *  
 * [RemoteTestNG] detected TestNG version 7.3.0 PASSED: timeout
 * 
 * =============================================== Default test Tests run: 1,
 * Failures: 0, Skips: 0 ===============================================
 * 
 * 
 * =============================================== Default suite Total tests
 * run: 1, Passes: 1, Failures: 0, Skips: 0
 * ===============================================
 */




