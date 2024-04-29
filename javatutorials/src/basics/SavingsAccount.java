package basics;

public class SavingsAccount extends Account {

	    double interestrate;
	SavingsAccount(String accountnumber, double balance, String owner,double interestrate) {
		super(accountnumber, balance, owner);
		this.interestrate=interestrate;
	}
	
	public void addinterest() {
		double interest= getbalance()*interestrate/100;
		deposit(interest);
		System.out.println("interest added successfully");
		
	    }

     }
