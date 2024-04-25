package interviewquestions;

import org.testng.annotations.Test;

public class SeleniumInterviewQuestionsSetTimeOutForTestCaseInTestNg {
	
	// oru test case evlo nerathula execute aaganunu namma time set panlam , anma set panna time la antha test case execute aagalanna
	//athu automatica fail aagidum
	
	
	//ippo intha test case ku 2 sec than time set pannirukan ,antha 2 sec la intha test case execute aagalanna 
	//athu fail aagidum
	
	@Test(timeOut = 2000)
	public void timeout() throws InterruptedException {
		Thread.sleep(3000);  // inga test case ulla 3 sec wait pannisollirukkan, but ennakku intha test case 2sec la execute aaganum
		                    // so automatic ahh ithu fail aagidum
   System.out.println("tttt");
      }
}
