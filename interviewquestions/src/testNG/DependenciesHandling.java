package testNG;

import org.testng.annotations.Test;

public class DependenciesHandling {
	//dependencies nan onnu saarnthu innonu irukurathu oru ithula problem na athu innoru ithalayum affect aagum
//	intha maari dependencies epdi manage pandrathu
	
	 // ippo nan flip cart site ahh test pannitu irukkan , athula naan cart ndra option ahh check pannanum, but enakku startingalay
	 //page open aagala, page open aana than nan ulla poi cart ahh check panna mudiyum, 1st site work aaguthaa illayanu nan check pannanum
     //athukapuram than nan  athukadutha case ku poga mudiyum
     //intha maari mater ahh testing use panni epdi handle panna poramnfdtara thaan paaka poram
	
    //problem1:  you have to admit a student to engineering
	//problem2:  you have to admit a student to higher secondary
	
	//pbllm1 la 10th 12th finish panniruntha tha avan engineering sera mudiyum atha finish pannalana mudiyathu
	//same athey tha pblem 2 layum
	
	
	//ipo nan enakku inga degree execute aaganuna athukku munnad irukku twelth execute aganum and tweth execute aaganunaa athuku munnadi 
	//irukka tenth execute aaganum, namma yosikkalam athukku namma priority potutu poiralamnu, so atha vachipottu paakuran . and naan
	//tenth execute pannalanna kooda athukku keela irukka tweth and degree execute aagum, but enakku exact ahh enna venunaa tenth and twelth mudikkalanna 
	//degree ku vara koodathu ,
	
	/*
	@Test(priority=0, enabled=false)
	public void tenthHighSchool() {
		System.out.println("tenth");
		
	  }
	
	@Test(priority=1)
    public void twelthHighersecondarySchool() {
		System.out.println("12th");
		
	   }
	
	@Test(priority=2)
    public void degree() {
		System.out.println("degree");
	
      }
	/*
	          tenth
              12th
             degree
        PASSED: tenthHighSchool
        PASSED: twelthHighersecondarySchool
        PASSED: degree
	 */
	
	// ippo 1st testcase ahh fail aakuran so output epdi varumna
	
	/*       12th
             degree
         PASSED: twelthHighersecondarySchool
         PASSED: degree*/
	//inga nan ennathan priority pottu  tenth ahh false nu pottu antha test case skip pannalum automaticahh priority 1 and 2 
	//run aagi twelth and engineering run aaguthu, but enakku degree varanunna athiku munnadi irukka 2 test case paas aana than
	//degreku vara mudiyum athey maari tenth execeute aana than athu pinnadi vara twelth execute aaganum
	// so inga nan priority set pandrathu velaiku aagathu
	// so naan enna panna poranna onnoda onnu dependencies nu poda poran , so onnu execute aana than athuku pinnadi vara mathathellam run aaganum 
	

	@Test(enabled=true)
	public void tenthHighSchool() {
		System.out.println("tenth");
		
	  }
	
	@Test(dependsOnMethods = "tenthHighSchool")
    public void twelthHighersecondarySchool() {
		System.out.println("12th");
		
	   }
	
	@Test(dependsOnMethods = "twelthHighersecondarySchool")
    public void degree() {
		System.out.println("degree");
	
      }
	/*tenth
12th
degree
PASSED: tenthHighSchool
PASSED: twelthHighersecondarySchool
PASSED: degree */
	// inga priority set pannalannaalum dependencies potta thaala enaku ellam oder ahh nadakkuthu
	

	//ipppo nan tentha hh enabled = false nu potta, kella irukka rendu method um tenth depend panni irukku aana tenth execte aagala
    
	//so meethi 2 um execeute aaagalannu sollum
	
	
	
	
	
	
	
	
	
	
	
	

}

