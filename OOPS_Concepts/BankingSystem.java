class Account{
    private int accountNumber;
    protected double balance;
    public void setDetails(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit: $"+amount+" to "+getClass().getSimpleName());
    }
    public void withdraw(double amount){
        balance-=amount;
        System.out.println("Withdraw: $"+amount+" from "+getClass().getSimpleName());
    }
}
class SavingsAccount extends Account{
    private static double min_bal=100.0;
    public void deposit(double amount){
        super.deposit(amount);
    }
    
    public void withdraw(double amount){
        if(balance-amount>=min_bal){
            super.withdraw(amount);
        }
        else{
            System.out.println("Insufficient Balance in SavingsAccount");
        }
    }
}

class CheckingAccount extends Account{
    private static double limit=500.0;
    private double dailyWithdrawAmount;
    public void deposit(double amount){
        super.deposit(amount);
    }
    public void withdraw(double amount){
        dailyWithdrawAmount+=amount;
        if(dailyWithdrawAmount<=limit){
            super.withdraw(amount);
        }
        else{
            System.out.println("Daily Withdrawal Limit Reached in CheckingAccount");
        }
    }
}

public class BankingSystem
{
	public static void main(String args[]){
	    Account ac=new Account();
	    ac.setDetails(1001,1000.0);
	    Account ca=new CheckingAccount();
	    Account sa=new SavingsAccount();
	    sa.deposit(500.0);
	    sa.withdraw(200.0);
	    ca.deposit(700.0);
	    ca.withdraw(300.0);
	    ca.withdraw(300.0);
	    sa.withdraw(210.0);
	}
	

}