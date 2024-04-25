package interviewquestions;

import org.testng.annotations.Test;

public class SeleniumInterviewQuestionsHowtoExecuteTestCseMultipleTimes {
	
	//enakku intha test case multiple times print aaganum without loop
	
	//inga @Test annotations ku invocation count nu oru parameter irukku athu kuduthu count mattum kuduthuta
	//pothu athu antha thdava execute aagum
	
	
	@Test(invocationCount = 4)
	public void test1() {
	
		System.out.println("i am multiple");
	
	}

}
