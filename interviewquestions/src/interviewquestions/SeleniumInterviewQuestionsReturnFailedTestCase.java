package interviewquestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumInterviewQuestionsReturnFailedTestCase {

	//1st way: testng-faled.xml will automatically create when the the test is failed and we can manualy run it
	
	/*
		 @Test
		 public void testcase1() {
			 Assert.assertEquals(true, false); // (true, false) inga purpose ahh true ahh expect pandran, aana false varumndra maari potrukan
			                                    // so inga false tha varum
		 } 
		 public void testcase2() {
			 
			 Assert.assertEquals(true, false); // ingayum athey maari potrukkan.inga 2 test case um fail aagura maari potrukkan, 	 
		 }
		 }
	
			 ithoda xml file ahh run pandra test fail nu vanthuruchu
			  java.lang.AssertionError: expected [false] but found [true]
			  
			  ithoda explanation ann ithodaxml file kuduthuruukan 
			  
			  inga 2 test case um fail aayiruch so fail aana test case enakku test output folder la testng-failed xml nu file poi senthurum
			  anga poi nan atha again rerun panni paakalam
			  	   
			  	   
			   keelairukka example ahh again mela irukka code ahh run pannioru test case pass panni vavhi fail aan 
			   test case file kulla poguthhanu pakuran
			 
			 */

//___________________________________________________
	
//2nd way: we can use analyser listener and by  use that listener we give that as parameter to test cases, but we have to give 
//	this parameter to all test cases, it will consume time

/*
  
 
@Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class)
public void testcase1() {
	 Assert.assertEquals(true, false); // (true, false) inga purpose ahh true ahh expect pandran, aana false varumndra maari potrukan
	                                   // so inga false tha varum
		 

}
@Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class)
public void testcase2() {
	 
	 Assert.assertEquals(true, true); // ingayum athey maari potrukkan.inga 2 test case um fail aagura maari potrukkan, 
	 
}


}

/* inga nan lisnere clss create panni atha ovvoru test case ku kudukkuran, ithey maari oru 100 test cases irukku vainga antha yella test caseku melayum poi
 * ennala @Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class)
 * kuduthutu irukka mudiyathu so enakku antha maari kudukka virumbala aanalum enakku retrylistener nadakkanum
 * 
 *   so athukku nan ****** IANNOTTION TRANSFORMER *********** use pannuvom
 *   
 *   ithula tranform() nu oru method irukku athavachi namma achive panlam, ithya epdi ovvor test case ku
 *  
 *   melayum @Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class) ipdi pandrathunna testNG.xml one time lister add pannita pothu
   
   
 */


//____________________________________________________________________________________________

//	3rd way:ovvoru time yum ella test mela yum retry listener ahh parameter ahh tharathuku   we have to create class for transformer
	

@Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class)
public void testcase1() {
	 Assert.assertEquals(true, false); // (true, false) inga purpose ahh true ahh expect pandran, aana false varumndra maari potrukan
	                                   // so inga false tha varum
		 

}
@Test(retryAnalyzer = SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer.class)
public void testcase2() {
	 
	 Assert.assertEquals(true, true); // ingayum athey maari potrukkan.inga 2 test case um fail aagura maari potrukkan, 
	 
}


}











