package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	//rendu visiyatha compare pandrathuku namma if or conditional stsmnt use panni periya program ahh eluthi compare pandrathuku namma test Ng la Assertions nu  irukku atha vachi

	// Asserts are validations or checkpoints for an application,
	//Asserts in Selenium validate the automated test cases that help testers understand if tests have passed or failed. 
	
	
	// oru developer than eluthana code ahh thanae selfreview panni test pandrathuku peru than Assertions
	String name="viji";
	private boolean fasle;
	boolean value = fasle;
	@Test 
	public void checkequal() {
//		 Assert.assertEquals(name, "afra");// output --> java.lang.AssertionError: expected [afra] but found [viji]
//		Assert.assertEquals(name, "viji"); // output ---> test passed
		
//	 Assert.assertNotEquals(name, "viji");  //output java.lang.AssertionError: did not expect [viji] but found [viji]
	  // content diferrent ahh iruntha passed aagirukkum, rendu content um onnu ndra thaala intha error vanthurukku
	 //yenna nann equal ahh irukka koodsthunnu than naan sollirukkan
	 
	 // boolean values ahh check pannanumna namma AsertTrue use pannikalam
	 
//	 Assert.assertTrue(value, "this should not be true"); //java.lang.AssertionError: this should not be true expected [true] but found [false]
	// inga na expct pannathu true ahh than but enaku vanthathu flase s athan error vanthurukku
	
	 Assert.assertFalse(value, "this should not be true"); // PASSED: checkequal 
	 
	}
	
	
}
