package testNG;

import org.testng.annotations.Test;

public class SkipTestCaseorIgnoreTestCase {
	
//	sila testcase  eluthum pothu oru sila testcase skip aagunum, sila test cases venanu sila situation la 
//	irukkum antha maari time la namma skip test cases use pannikalam
	
    @Test(priority=0)
    
          // by default ahh namma @Test la enabled=true nu thaan ella test case kum irukkum,
         //atha false nu potta antha testcase execute aagathu
	  public void stsrtthecar() {
		  System.out.println("start the car");
		  
	  }
           // false set pannitan so ithu execute aagathu
    @Test(priority=5,enabled = false)   //ippo enakku intha particular test mattum skipp pannanum                                     
    public void muicTurnedon() {
    	
    	 System.out.println("music turned on");
    }
    
	   
	       @Test(priority=1)
	  public void putFirstgear() {
		  System.out.println(" this is first gear ");
		  
	  }
	   
	
	       @Test(priority=2)
	  public void putSecondgear() {
		  System.out.println("second gear ");
		  
	  }
	   
	
	       @Test(priority=3)
	  public void putThirdgear() {
		  System.out.println("this is tird gear");
		  
	  }
	   
	
	       @Test(priority=4)
	 	  public void putFourthgear() {
	 		  System.out.println("fourth gear");
	 		  
	 	  }

}
