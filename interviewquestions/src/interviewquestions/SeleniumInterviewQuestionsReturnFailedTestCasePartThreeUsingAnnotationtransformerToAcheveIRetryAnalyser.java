package interviewquestions;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
/*
 
 
public class SeleniumInterviewQuestionsReturnFailedTestCasePartThreeUsingAnnotationtransformerToAcheveIRetryAnalyser implements IAnnotationTransformer
{
@Override
public void transformer(ITestAnnotation annotation , class testclass, Constructor constructor ) {
	
	annotation.setRetryAnalyzer(SeleniumInterviewQuestionsReturnFailedTestCase.class);
	// namaku entha clss kla test cases irukko antha class ahh inga tharanum
}
	
}

//intha class ethukkuna namma ovvoru time um retry analyser nu ella test case ku tharathuku pathila inga ItestAnotation onnu create pannndran
//athula nan entha class ku retry analyzer use panna porano atha nan inga set pandran,
//ithu epdi work aaagumna , namma @test annotation eppelam call aagutho appelam intha i annotation transformer um call aagum  antha iAnnotaton transformer la nan 
//Iretry analyser set pannirukurathaala, athum senthu ella test case ku run aagum

//ippo ovveru test ku itu tharathukku namma itha suite lecel la thanthukulam so testng .xml la poi listener create pannanum

// so xml la listerner claas ahh mattum potta pothum

//------------------------ xml file

/*
 
 <?xml version="1.0" encoding="UTF-8"?>
<!-- suite nu oru tag create panndran  -->
<suite name= "testsuite" verbose="2" >

<listener name = "interviewwuestions.SeleniumInterviewQuestionsReturnFailedTestCasePartThreeUsingAnnotationtransformerToAcheveIRetryAnalyser" ></listener>
<test name="firsttest">

<classes>

<class name="interviewquestions.SeleniumInterviewQuestionsReturnFailedTestCase"></class>

</classes>
</test>
</suite>
 
 
 
 
 
 
 
 
 
 
 
 
 */

