package basics;



/*public class FirstProgram {
	
	// ------------ PRIMITIVE AND REFERENCE DATA TYPE  --------------
	
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java la 2 data type irukku primitive and reference datatype
		//primitive na
		
		int num = 4;
		
//		reference data type:
		
		Date date = new Date();
		
		//inga namma tha space ahh create pandram intha variables ku 
		
		int a = 23;
		int b = a;
		 a=1;
		 
		 System.out.println(b);
		 System.out.println(a);  
    //output 23
	//	     1
		
		 // inga b ku a oda value ahh assighn pandran apdinna a maari b ku oru addreess eduthuathula 
//		 puthu number ahh store pannum, so atha naala a oa value ahh ku assingn pannaalum, a oda value ahh 
//		 again change panna a oda value acchange aagum b oda value apdiye than irukkum, yenn rendum vera vera memory loacation la irukku
//		 yenna rendum onnuku onnu lik illa
		 
	// but in reference data type:
		 Point p1 = new Point(4, 8);
		 
		 Point P2=p1;
		 //ithu reference data type ndrathaala p1 oda reference ah p2 ku tharan, so p1 la change panna athu
//		 p2 um affet aahum , yenna rendum ore address ahh than refer pannuthu, onnoda onnu link aayirukku 
		 System.out.println(P2); //java.awt.Point[x=4,y=8]
		 p1.x=5;
		 System.out.println(p1); //java.awt.Point[x=5,y=8]
		 System.out.println(P2); //java.awt.Point[x=5,y=8] */
		 
		 
//----------------------------------------------  Arithmetic operators  -----------------
	/*	 int c=12;
		 int v=5;
		  float r= c/v;
		  System.out.println(r); // 2.0 actual ans is 2.4
		  // nan floating la ans expect pannalum 2.4 ndra exact answer ahh athu implicit ahh convert panni
		  //2.0 convert panni kudukuthu , so enakku exact ans venumna nan explicit conersion pannanum, enakku float la than venumnu sllanum
		  float e= (float)c/(float)v; // first float ahh convert pannitu apram divide pannunu soldram
		 
		  System.out.println(e)	;	  //ans 2.4     */
		 
//-------------------------------------------------------------
	/*	  int f = 5;
		  f++;
		  System.out.println(f); // 6 starting la 5 irukku f++ pannathaala , 
		  System.out.println(f); // same athey 6
		  System.out.println(f); // same athey 6
		  
		  f--;
		  System.out.println(f); //5 first f++ pottu 1 increment pannathaala,
		                      // so athukappuram f-- nu pota thaala , 6 la irunthu1 - panni 5 varuthu
		  System.out.println(f);  // same athey 5
		  System.out.println(f);  // same athey 5
		  
		  //but
		  
		  int g = 5;
		 
		  System.out.println(g++); // starting la 5 tha varum and ithukappuram eggelam g varutho angellam 1 increment pandram
		  System.out.println(g); //6
		  System.out.println(g);
		  System.out.println(++g); //7
		  System.out.println(g); //7
		  
		   String fees = "4000";
		   switch(fees) {
			   case "3000":
				   System.out.println("you can buy");
				   break;
			   case "4000":
				   System.out.println("not enough");
				   break;
				   default:
					   System.out.println("you cant buy");
		   }
		   //op-->break tharalanna  kelle iruka fulla execute aagum
//		   not enough
//		   you cant buy
		   
//		   incase break kudutha output-->not enough    */
		   
//		 ------------------------------------------------------ factorial pgm --------------------------------------
		   
	/*	   int fact =1;
		   for(int i =1; i <=5 ; i++) {
			   fact*=i;
		   }
		  System.out.println(fact);     */
		  
//		  ------------------------------------------------ sum of n numbers --------------------------
		/*  int i =1;
		  int sum=0;
		  while(i<=8) {
			  sum+=i;
			  i++;
		  }
			System.out.println(sum);  */
			
//	   ----------------------------------------------------------------------------
	/*	  int k=1;
		  int sum1=0;
		  
		  do {
			  sum1+=k;
			  k++;
			  
		  }while(k<=8);
		  System.out.println(sum1);  */
		 
		  
//---------------------------------------------------------------------- break and continue
/*		   for (int i =1 ;i<7; i++) {
			   
			   if(i==3) {
				   break;
			   }
			   System.out.println(i);
		   }
		   for (int j =1 ;j<7; j++) {
			 
			   if(j==5) {
				   continue;
			   }
			   System.out.println("j"+j);
		   }
		   
		   //output
//		   1
//		   2  // inga 3 oda nindruchu
//		   j1
//		   j2
//		   j3 
//		   j4   // inga 5 ahh skip panniruchu, meethi ellathayum execute pannuthu
//		   j6
		   */
		   
//----------------------------------------------------------  Array  -------------------------
		/*   int[] array = new int[10];
		   array[1] =5;
		   
		   for(int i=0;i<array.length ; i++) {
			   if(i==1) {
				   continue;
			   }
			   array[i]=i; 
		   
		   }
		  for(int i = 0;i<array.length;i++)
		  System.out.println(array[i]);
	
	}
	*/
	
	
//--------------------------------------------  method  ------------------------------------------------
	
/*	public static void main(String[] args) {
		calci(5, 5);

	}
	
   public static void calci(int value1, int value2) {
	    int a=value1;
	    int r = value2;
	    int d= a+r;
	    System.out.println(d);
   }                                 

//	------------------------------------------------ returning values and usimg it for other operations
	public static void main(String[] args) {
	int res=	calci(5, 5);
	
       res=res+5;
       System.out.println(res);
	}
	
   public static int calci(int value1, int value2) {
	    int a=value1;
	    int r = value2;
	    return   a+r;
	    
	
   } */
//-------------------------------------------------------- recursive method ----------------------------------------------------
	
	/*  public static void main(String[] args) {
	
		natnum(4);
		
	}
	
	public static void natnum(int n) {
		
		//base case : athavathu intha recursive la enga stop aaganumnu firs sollanum, and athukappuram recuresive nase la antha function result
		//kedaikura vara recursive pannanum
		
		if(n==1) {
			System.out.println(n);
		}else {
			System.out.println(n);
			natnum(n-1);
		}
		}    */
		
//		   ---------------   factorial   --------------------

/*	public static void main(String[] args) {
		int res=factorial(5);
		System.out.println(res);
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}  
	
	
	

}// end of class */
//	----------------------------------------------- creating objects for class and giving values directly by using objects --------------------------
/* public class FirstProgram {
	
	  String name="viji";    //type1: variable and values ahh ingaye assihn panlam
	  int age = 100;         //type1:
	
	 String nativeplave;     //type2 : variables ku values intha class la irukka method la use panni antha method ahh class oda object create panni call pannum pothu 
	                         // call pandra edathula values ahh tharalam
	 int pincode;
	 
	public  void form() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nativeplave);
		System.out.println(pincode);
	}
	
	public static void main(String[] args) {
		
		FirstProgram fp = new FirstProgram();
		fp.nativeplave="salem";
		fp.pincode=763663;
		fp.form(); 
		//creating 2nd object
		FirstProgram fp2 = new FirstProgram();
		fp2.nativeplave="trichy";
		fp2.pincode=8938;
		fp2.form();
	}
		
	} */
	
//--------------------------creating objects for class and giving values  by parameters for the method in tha class using objects  ------------------------------	
	
/*public class FirstProgram {
	
	 int salary;
	 String job;
	 String joining_date;
	 String pf;
	 
	 public void jobdetails(int slry, String jb, String jbdte, String pff) {
		 salary=slry;
		 job=jb;
		 joining_date=jbdte;
		 pf = pff;
		 System.out.println(slry);
		 
	 }
	 
	 
	 public void prinpg() {
		 System.out.println(job);
		 System.out.println(joining_date);
		 System.out.println(pf);
	 }

  
	public static void main(String[] args) {
		
		FirstProgram firstprog= new FirstProgram();
		firstprog.jobdetails(15000, "analyst", "jun9","2000");
		firstprog.prinpg();
		
		
	
	
       } //end of class main
}//end of first program */


// 3 type la namma variable ahh class la create pannitu athukku values ahh 3 type la tharalam,  first aclass kulla variable ahh create pannum pothey values ahh kuduthu create panlam
// 2ndn class la variables mattuum create pannitu athukaana values ahh antha class ku object create panni antha object vachi tharalam

// 3rd variable ahh matyum class la  delare pannitu athu oru method create panni antha method la parameters avachi namma class ku object create anni antha object

// valiya parameter irukka  method ku namma arguments ahh pass panni class la irukka variables ku parameter la vantha values ahh apdiye assign panlam

	
//-------------------------------------------------- access modifiers gettes and setter ---------------------------------------------------------------------------------------
	
/*public class FirstProgram {
	
	private String salary;
	private String job;
	 String joining_date;
	 String pf;
	 
	 public  void jobdetails(String slry, String jb, String jbdte, String pff) {
		 salary=slry;
		 job=jb;
		 joining_date=jbdte;
		 pf = pff;
		 System.out.println(slry);
	 }
	 // setters
	 // vera oru class la private values ahh access inga set method kulla rendu values ahhyum tharam, new values ahh yum private variableku set pannikalam
	 public void setvalue(String str,String job) {
		 salary=str;
		 job=job;
	 }
	 // vera oru class la private values ahh get panna  or return inga get method kulla rendu values ahhyum tharam
	 //getters
	 public String getValues() {
		return salary;
		 
	 }
	 
	 
	 public void prinpg() {
		 System.out.println(job);
		 System.out.println(joining_date);
		 System.out.println(pf);
	 }

 
	public static void main(String[] args) {
		
		FirstProgram firstprog= new FirstProgram();
		firstprog.jobdetails("15000", "analyst", "jun9","2000");
		firstprog.prinpg();
		
		FirstProgram secondobj = new FirstProgram();
		secondobj.job="IPO";
		secondobj.joining_date="87473";
		secondobj.salary="3443";
		
		
	
	
      } //end of class main
}//end of first program
	
	/* inga 2nd ahh oru class athavathu vera oru class la intha first program ahh import panni use pannitu irukkan athula slary and job ahh firstclass la private ahh pottathaala atha namma intha 
	 * class la direct ahh use panna mudiyathu, but oru first class la irukka oru method ahh vachi edukkamalam, athukku antha method al antha variables ahh use pannirukkanum, inga antha method ahh First class kulla 
	 * than irukku, so nan innoru class la irutha antha method ahh call pannikalam athula irukka private variableum work aagum  */

/*
	 package basics;

public class JoinedProgramWithFirstProgram {

	public static void main(String[] args) {
		FirstProgram secondobj = new FirstProgram();
		
		secondobj.job="IPO";  // ithula error varum                
		
		secondobj.joining_date="87473";
		
		secondobj.salary="3443"; //ithula error varum
		
		secondobj.jobdetails("15000", "analyst", "jun9","2000"); //ithuku peru tha getter
		
		//so antha class la irukka private values ahh access panna atha eduthu oru setvalues kulla potu atha nammalaala access panna mudiyum, change pannaum mudiyum
		secondobj.setvalue("2000","cooli"); // inga naan private variableku values ahhye set pannnikuran, that mens values ahh nan inga irunthu tharan
		
		
	// vera oru class la private values ahh get panna  or return inga get method kulla rendu values ahhyum tharam	
		String print=secondobj.getValues();
      System.out.println(print+"salary"); 2000salary

	}
}	 
	 */
	
//------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------- constructors -------------------------------------
//constructor nan namma class perulaye function create pandrathau, create panni antha class la irukka variables ku default vaules ahh set pandrathu , so eppelam 
//object create pandramo appellam intha constructors automatica hh call aagikum, ithula 2 type irukku 
//1.basi constructor(constructor without parameter)
//2.constructor with parameter


 /*                               //1.basi constructor(constructor without parameter)
 public class FirstProgram{
	

     int mark;
     String name;
     
     FirstProgram(){
    	 mark=300;
    	 name="afra";
     }

      
	 public static void main(String[] args) {
		FirstProgram firstpgm = new FirstProgram();
         System.out.println("main"+firstpgm.mark);		
	}
} */
	
 
/* public class FirstProgram{
		

     int mark;
     String name;
     
     FirstProgram(){
    	 mark=300;
    	 name="afra";
    	 System.out.println("i am java");
     }

      
	 public static void main(String[] args) {
		FirstProgram firstpgm = new FirstProgram();
         System.out.println("main"+firstpgm.mark);	
         
         FirstProgram firstpgm1 = new FirstProgram();
         String name= firstpgm1.name;
         String o =  firstpgm1.name="uuu"; // i can change the values again
         int num=firstpgm.mark=900;
         System.out.println(o);
         System.out.println(num);
         
        
	}
}
//o/p
// i am java
// main300                 */
 
//              -----------------------------------------------//2.constructor with parameter
	
/*public class FirstProgram{
	

    int mark;
    String name;
    
    FirstProgram(String name,int mark){
   	 this.mark=mark;
   	 this.name=name;
   	 System.out.println(mark);
    }

     
	 public static void main(String[] args) {
		FirstProgram firstpgm = new FirstProgram("vivij",300);
        System.out.println("main"+firstpgm.mark);	
        
        FirstProgram firstpgm1 = new FirstProgram("mama",899);
        String name= firstpgm1.name="arya";
        System.out.println(name);
        String o =  firstpgm1.name="uuu"; // i can change the values again
        System.out.println(o);
        int num=firstpgm.mark=900;
    
        System.out.println(num);
        
       
	}
}          */
	
	
	// oru normal method kum intha constructor kum enna difrrence na namma method ku return type pottukalam, and constructor ku mudiyathu, 
//and method ajj ethana thadava vena call pannikalam, but contsructor ahh oru object create pannum pothu  mattum than athuva implicit ah call aagum
	
/*public class FirstProgram {
    String name;
    int age;
    double salary;

    // Constructor without parameters
    public FirstProgram() {
        System.out.println("Default constructor called.");
        name = "John Doe";
        age = 30;
        salary = 50000.0;
    }

    // Parameterized constructor
    public FirstProgram(String empName, int empAge, double empSalary) {
        System.out.println("Parameterized constructor called.");
        name = empName;
        age = empAge;
        salary = empSalary;
    }

    public static void main(String[] args) {
        // Creating an object using default constructor
    	FirstProgram emp1 = new FirstProgram();
        System.out.println("Employee 1:");
        System.out.println("Name: " + emp1.name);
        System.out.println("Age: " + emp1.age);
        System.out.println("Salary: " + emp1.salary);
        
        // Creating an object using parameterized constructor
        FirstProgram emp2 = new FirstProgram("Alice", 25, 60000.0);
        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + emp2.name);
        System.out.println("Age: " + emp2.age);
        System.out.println("Salary: " + emp2.salary);
    }
}   */
	
///----------------------------------------------------------------------------------------------------------------------------------------------------

//-----------------------------------------------  inheritance  ---------------------------------------------------------------------------------------
	
// intha inheritance ku Account ,savingsAccount,CheckingAccount,LoanAccount, class ahh paaru athukku than inga main method create pannirukkan
/*
public class FirstProgram {
	
	public  static void main(String[] args) {
		Account account = new Account("728827278", 100, "viji");
		account.deposit(100);
		account.deposit(100);
		account.withdraw(120);
		SavingsAccount sa = new SavingsAccount("282772", 500, "89779", 20);
		sa.addinterest();
		
		 CheckingAccount ca = new  CheckingAccount("877676", 3888, "khjj", 90);
		 ca.withdraw(120);
	}
	
}
	*/

//------------------------------------- polymorphism or method overloading ------------------------------------------
//method overloading na ore perula neraiya methods iruntha based on the signature of that method namma use pannikalam
/*
public class FirstProgram {

    private String name;
    private double baseSalary;
    private double bonus;
    private double commission;

    // Constructor with name and base salary
     FirstProgram(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = 0.0;
        this.commission = 0.0;
    }

    // Constructor with name, base salary, and bonus
     FirstProgram(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.commission = 0.0;
    }

    // Constructor with name, base salary, and commission
     FirstProgram(String name, double baseSalary, double commission) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = 0.0;
        this.commission = commission;
    }

    // Method to calculate salary with bonus
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Method to calculate salary with commission
    public double calculateSalary(double salesAmount) {
        return baseSalary + (commission * salesAmount);
    }

    // Getters and setters (unchanged)
    // ...
 // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public  static void main(String[] args) {
    	FirstProgram fp1 = new FirstProgram("uhjs", 899080);
    	FirstProgram fp2 = new FirstProgram("uhjs", 899080,9000);
    	
    	
    }
}

*/

//____________________________________________________ method overiding_____________________________________________

//nammaa man parent class l irukka oru class ahh subclass la overide oannikaalam.

/*
class Shape{
		

	public double calculateare() {
		return 0;
	}
}

class Rectangle extends Shape{
	private double width;
	private double height;
	
	 Rectangle(double width, double height){
		 this.height=height;
		 this.width= width;
	 }
	 
	 @Override// ithu optional than podalam podamalum irukkalam
	 public double calculateare() {
		 double area = height *width;
		 System.out.println(area);
		 return area;
		 
	 } 
}
	class Circle extends Shape{
		 private double radius;
		 
		 Circle(double radius){
			 this.radius = radius;
		 }
		 
		 

		    @Override
		    public double calculateare() {
		       radius= Math.PI * radius * radius;
		       System.out.println(radius);
		       return radius;
		    }
	}
	
	
	
	public class FirstProgram{
		
		public static void main(String[] args) {
			
			Rectangle rec = new Rectangle(2, 4);
			Circle cir = new Circle(23);
			
			rec.calculateare();
			cir.calculateare();
		}
		
	}
	
	*/


//_______________________________________ types of inheritance -----------------------------------------------

/*
                                                  Single Inheritance:
                                                  
           In single inheritance, a class inherits properties and behaviors from a single superclass.
        Example: class SubClass extends SuperClass.
        
                           // Superclass
               class Animal {
                  void eat() {
            System.out.println("Animal is eating...");
             }
                }

                       // Subclass inheriting from Animal
            class Dog extends Animal {
                    void bark() {
                System.out.println("Dog is barking...");
               }
                   }
                   
                                ----------------------------------------------------------

                                                Multilevel Inheritance:
                                               
                In multilevel inheritance, a class inherits from a superclass, and then another class inherits from the subclass,
                forming a chain of inheritance.
            Example: class SubClass1 extends SuperClass and class SubClass2 extends SubClass1.
            
            
            
            public class Animal{
                       void eat() {
        System.out.println("Animal is eating...");
                      }
            }
            
            class Dog{
               void bark(){
               }
            }
            
            class labrador extends Dog{
                   void color() {
                         System.out.println("Labrador is brown in color.");
                      }
            }
            
            
            -------------------------------------------------------------------------
            
            
            

                                             Hierarchical Inheritance:
                              In hierarchical inheritance, multiple subclasses inherit from a single superclass.
                    Example: class SubClass1 extends SuperClass and class SubClass2 extends SuperClass.
                    
                    
                    
                    // Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass1 inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Subclass2 inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                            Multiple Inheritance (Not supported in Java):
                            
                     Multiple inheritance occurs when a class inherits properties and behaviors from multiple superclasses.
                     Java does not support multiple inheritance of classes to avoid the diamond problem,
                     where ambiguity arises if two superclasses have a method with the same name.
                     However, Java supports multiple inheritance through interfaces, where a class can implement multiple interfaces.
               Example: class SubClass implements Interface1, Interface2.
               
               
              // Vehicle interface
interface Vehicle {
    void accelerate();
    void brake();
}

// Engine interface
interface Engine {
    void start();
    void stop();
}

// Cargo interface
interface Cargo {
    void loadCargo();
    void unloadCargo();
}

// Car class implementing Vehicle and Engine interfaces
class Car implements Vehicle, Engine {
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    public void brake() {
        System.out.println("Car is braking...");
    }

    public void start() {
        System.out.println("Car engine started.");
    }

    public void stop() {
        System.out.println("Car engine stopped.");
    }
}

// Truck class implementing Vehicle, Engine, and Cargo interfaces
class Truck implements Vehicle, Engine, Cargo {
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }

    public void brake() {
        System.out.println("Truck is braking...");
    }

    public void start() {
        System.out.println("Truck engine started.");
    }

    public void stop() {
        System.out.println("Truck engine stopped.");
    }

    public void loadCargo() {
        System.out.println("Cargo loaded onto the truck.");
    }

    public void unloadCargo() {
        System.out.println("Cargo unloaded from the truck.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.brake();
        car.stop();

        System.out.println();

        Truck truck = new Truck();
        truck.start();
        truck.accelerate();
        truck.loadCargo();
        truck.unloadCargo();
        truck.brake();
        truck.stop();
    }
}
               
               
               
                ----------------------------------------------------------------------------------
               
               
               
                   
                            Hybrid Inheritance (Combination of multiple inheritance types):
                            
                       Hybrid inheritance is a combination of multiple types of inheritance.
               Example: A scenario where a class inherits from two different classes and implements one or more interfaces.

  
 class vehical{
         String model;
         int year;
         
         Vehical(String model,int year){
                  this.model= model;
                  this.year= year;
                  
         }
         
         public void cardetails(){
         system.out.println(mode + year)
      
      } //end of class vehicals
  
  interface Engine{
  
  void start();
  void stop();
  
  }
  
  interface ElectricEngine {
    void charge();
    void discharge();
}
  
 class car extends Vehicals implements Engine,ElectricEngine{
 
          Car(String model,int year){
          super(model, year)
 }
      
       public void start(){
       
        System.out.println(model+"Car engine started.");
    }
    
    public void stop() {
        System.out.println("Car engine stopped.");
    }
 
 
  }
  
  class ElectricCar extend vehcals implements ElectricEngine{
  
        public ElectricCar(String model, int year){
         
           super(model, year)
           
        
        }
  
      public void charger(){
            System.out.println("Electric car is charging.");
             public void discharge() {
        System.out.println("Electric car is discharging.");
    }
      }
  
  }
  
  public class Main{
  
   Car car = new Car("lambogani",1998);
       car.displayDetails();
        car.start();
        car.stop();
   ElectricCar electricCar = new ElectricCar("Tesla Model S", 2023);
         electricCar.displayDetails();
        electricCar.charge();
        electricCar.discharge();
  
  }
  
  
 
 */
 
	//---------------------------------------------------------------------------------------------------------------------------------