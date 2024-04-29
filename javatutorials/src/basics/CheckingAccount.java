package basics;

public class CheckingAccount extends Account {
 
	double overdraftlimit;
	CheckingAccount(String accountnumber, double balance, String owner,double overdraftlimit) {
		super(accountnumber, balance, owner);
		 this.overdraftlimit=overdraftlimit;
		
	}
	
	 @Override
	 public void withdraw(double amount) {
		 
		 if(getbalance()+overdraftlimit>=amount) {
			super.withdraw(amount); 
		 }else {
			 System.out.println("amount execeeded");
		 }
	 }

	
	
	
}
