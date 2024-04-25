package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsHirarchyExample {
  @Test
  public void f() {
	  System.out.println("@test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" @before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" @before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@ After suite");
  }

}


/* intha order la than execution nadakkum, ithu namma xml intha order la code eluthuram
    @before suite
    @before test
    @before class
    @before method
    @test
    @After method
    @After class
    @After test
    PASSED: f

     ===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
    ===============================================

    @After suite

   ===============================================
   Default suite
   Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
   ===============================================


 */





