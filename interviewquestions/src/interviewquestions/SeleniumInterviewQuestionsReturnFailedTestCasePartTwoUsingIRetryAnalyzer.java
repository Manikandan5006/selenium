package interviewquestions;

import static org.testng.Assert.fail;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SeleniumInterviewQuestionsReturnFailedTestCasePartTwoUsingIRetryAnalyzer implements IRetryAnalyzer {

	int failurecount=0;
	int retrylimit = 4;
	@Override
	public boolean retry(ITestResult result) {
		
		// inga retry method la lase nu vatha retry panna theve illanu artham TRUE kudutha retry pannanumnu artham
		if(failurecount<retrylimit) {
//			failurecount++;or
			failurecount=failurecount+1;
		return true;
		}
		return false;  
	}
	/* program explanation:
	  
	                  inga inga retryanalyzer ndrathu oru listene than so appo nan inbtha rertry analyzer ahh nan oru class kull irukka
	                  test cases ku kudukkuthuran, so eppelam antha test cases ellam fail aagutho appemal ,intha retryAnalyzser automatic ahh
	                  run aaga start pannitu antha fail anna test case run panni vidum, namma manual ahh run pannnumndra need illa
	                  
	                  so inga return valuse true ahh iruntha retry nadakum, false nu vantha retry nadkkathu
	                  
	                  so inga retry ethana thadava nadakkanumnu mela code naana sollirukkan oru 4 time nadakkanumnu. anga test case fail aana odane intha listener atha paakum
	                  so intha method ku varum, failurecount retry limit ahh vida chinnathu so 1 ahh increment panni keela pogum return true nu paakum so antha test case retry pannum
	                   
	                   ithey maari 4 time pannum
	                   
	                    so anga test case la fail aagutha illa pass aagutha illanu epdi therincgukurathu , athuku inth RetryAnalyser class ahh kondu poi anga irukka 
	                    test case ku  rerty Analyser nu oru parameter  irukkula athula poi intha class name kudukkanum, so intha listener antha test cases ellam listen pannite irukkum
	                    pass aggutha illa faila aaguthnu, fail aana retryanalyser ku vanthurum 
	                    
	                    SeleniumInterviewQuestionsReturnFailedTestCase ndra class irukka methods(test cases ) ku itha paas pandran
	  */
	}
































