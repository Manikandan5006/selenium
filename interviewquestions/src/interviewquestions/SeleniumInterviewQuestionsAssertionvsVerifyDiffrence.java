package interviewquestions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumInterviewQuestionsAssertionvsVerifyDiffrence {
	
	
                      // hard assertion
	// hard assertion la athavathu normal assertin la assert fail aana code further ahh execute aagathu apdiye nindrum
	
	/*
	@Test
	public void assertTest() {
		System.out.println("before assert");
		
		// inga venumne assert ahh fail panni , assert fail aanathuku aapuram code next line ku poguma nu paakuran
		Assert.fail();
		  //or
//		Assert.asserEquals(True, false);
		System.out.println("after assert");
	}
	 
	*/                              // soft assertion or verify
	
	//softassertion or verify ndrathu assert fail aanalum further ahh athuku keeela irukka code execute aagum
	//SoftAssert nu oru class irukku athukku object create panni atha vachi than namma assertion pannanum
	
	
//	  @Test 
//	  public void verifyTest() {
//		  System.out.println("before assert");
//		  SoftAssert assert = new SoftAssert();
//	  
//	      assert.fail();
//	      System.out.println("before assert");
//	 
//	  
//	  }
//	 

}
