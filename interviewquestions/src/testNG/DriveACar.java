package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	 
	       @Test(priority=0)
	  public void stsrtthecar() {
		  System.out.println("start the car");
		  
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
	       
	       /*
	           output
	        
	        
	         this is first gear 
fourth gear
second gear 
this is tird gear
start the car
PASSED: putfirstgear
PASSED: putfourthgear
PASSED: putsecondgear
PASSED: putthirdgear
PASSED: stsrtthecar
	        
	              ippo intha code oru undesired oreed la athavathu mathi maathi run aagirukku, first gear first ahhum
	              fourth gear second ahhum second gear third ahh um run aagirukku
	              so ipdi unoder agg execute aagirukku order ahh execute aagala
	              actuallu ithu epdi execute aaguthunna method name oda alphabetic order la
	              
	              testNG method name oda alphabetical order la eppovom execute pannum
	              
	              so namma priority set pannikalam athu 0 la irunthu start panlam
	              so kudutha priority padi than execution nadakkum
	              
	              
	  start the car
 this is first gear 
second gear 
this is tird gear
fourth gear
PASSED: stsrtthecar
PASSED: putFirstgear
PASSED: putSecondgear
PASSED: putThirdgear
PASSED: putFourthgear

                  order execution mention panna namma priority ndra keyword use pannikalam, priorty oru annotation kedayathu
                  @Test ndra anotation ku priorityndra attribute irukku avlothan 
	              
	        
	      */
	
	
	
	
	
	
	
	
	
	

}
