package basics;

public class LoanAccount extends Account {
	 double interestrate;
	LoanAccount(String accountnumber, double balance, String owner,double interesrrate ){
	 super(accountnumber,balance,owner);
	this.interestrate=interesrrate;
	
	
	}
	
	@Override
	public void deposit(double amount) {
		System.out.println("cant deposite amount into loan account");
	}
	public void calculateInterest() {
        double interest = getbalance() * interestrate / 100;
        System.out.println("Interest for this month: " + interest);
    }
}
