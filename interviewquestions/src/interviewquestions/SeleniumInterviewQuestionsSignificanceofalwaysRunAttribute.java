package interviewquestions;

import org.testng.annotations.Test;

public class SeleniumInterviewQuestionsSignificanceofalwaysRunAttribute {
	
	//ippo use ahh namma oru method ku mela depends on potu innoru method name potta  antha method faila aachuna intha methoad nadakkathu, 
	// enakku depend on um podanum, antha oru method ahh depend pannirukka innoru method fail aanalum antha enakku intha methoa method nadakkanum
	
	// inthamaari case la namma  ***** AlwaysRun =true *****  ndra parameter ahh use pannikalam
	
	@Test(timeOut = 2000)
	public void parentsPermission() throws InterruptedException {
		Thread.sleep(4000);
		
		System.out.println("parents permission granted");
	}
	

	
	@Test(dependsOnMethods ="parentsPermission",alwaysRun = true)
	public void loveMarriage() throws InterruptedException {
		Thread.sleep(4000);
		
		System.out.println("marriage happaend");
	}
	
}



// output

//marriage happaend
//PASSED: loveMarriage
//FAILED: parentsPermission

//at the same time error um vanthurukum aana athu vanthum test case run aaguthu, athan always run 
