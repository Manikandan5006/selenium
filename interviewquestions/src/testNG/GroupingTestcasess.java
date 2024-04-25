package testNG;

import org.testng.annotations.Test;

public class GroupingTestcasess {

	/*
	   Scenario: A big basket is having a different kind of mobiles.
      Let US say there are Apple phones, Moto G, VIVO and Lenovo.
       I want to run tests only for VIVO and Moto phones. Write a program for that.
	  */
	
       //ippo enakku vivo and moto oda test cases mattum run aaganum, inga thaan grouping  concept use aagum
	
	 // 1.intha program kaana GroupingTest.xml  ithuku related aana explanation irukku atha padichitu next intha 2 vathu explanation ahh padi  2.so nan inga groups nu @test la oru parameter irukku ippo nan ella test cases ku groups nu pottu athukku oru name athu enna 
	 //name vena irukkalam,  inga groups pootu name ahh vachitu antha name ahh kondu poi xml file entha test case ahh include pannanumnu
     //nenaikurano or exclude pannanunu nenaikkurano athula intha name ahh tharalam
	
	@Test(groups= {"applegroup"})
	public void apple1() {
		
		System.out.println("phone1");
	}
	@Test(groups= {"applegroup"})
   public void apple2() {
		
		System.out.println("phone2");
	}
	@Test(groups= {"mottogroup"})
   public void motto1() {
		
		System.out.println("motto1");
	}
   
	@Test(groups= {"mottogroup"})
   public void motto2() {
		
		System.out.println("motto2");
	}
   
	@Test(groups= {"vivogroup"})
   public void vivo1() {
		
		System.out.println("vivo1");
	}
   
	@Test(groups= {"vivogroup"})
   public void vivo2() {
		
		System.out.println("vivo2");
	}
   
	@Test(groups= {"lenovagroup"})
   public void lenovo1() {
		
		System.out.println("lenova1");
	}
   
	@Test(groups= {"lenovagroup"})
   public void lenova2() {
		
		System.out.println("lenova2");
	}
   
   
	
}
