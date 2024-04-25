package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {
	
	/*<!--xml namma parameter nu oru tag cirukku athuku oru name onnu tharanum and namma program ku tharanunu nenaikura value or input ahh
annga tharanum, apram ,antha name ahh kondu vanthu program la @test la parameter nu annotation irukku athula intha name ahh mattum tharanum
apdi thanthaa antha test case enna nenaikum na ok inga parameter annotation create pannirukkan athoda name ahh inga kuduthurukkan
 so athoda valus inga vara pothunu nenaikum so atha vaagikum,, atha receive panna program la irukka test case la parameter 
 receiver onnu potukuran, apdinna bracket la receive pandran  -->*/
	@Test
	@Parameters("the name of parameter")   // testcase la xml thara value ahh receive panna  inga String valueofparameter nu onnu potukukuran
	public void printname( String valueofparameter) {
		//testNG xml valiyaithuku oru parametr anupuran, athavathu run time la xml la irunthu anupuran
		System.out.println("this is"+valueofparameter);
	}

}
