interface ATM 
{
    void checkBalance();
    void withdrawMoney(double amount);
    void depositMoney(double amount);
}
class BankATM implements ATM 
{
	private double balance;
	public BankATM() 
	{
        	this.balance = 0;
    	}

        public void checkBalance() 
	{
        	System.out.println("Your current balance is: " + balance);
    	}

    	public void withdrawMoney(double amount) 
	{
        	if(amount <= balance) 
		{
            		balance -= amount;
            		System.out.println("You have withdrawn: " + amount);
        	} 
		else 
		{
            		System.out.println("Insufficient balance");
        	}
    	}
	public void depositMoney(double amount) 
	{
        	balance += amount;
        	System.out.println("You have deposited: " + amount);
    	}
}
public class ATM1 
{
	public static void main(String[] args) 
	{
        	ATM atm = new BankATM();
        	atm.checkBalance();
        	atm.depositMoney(500);
        	atm.checkBalance();
        	atm.withdrawMoney(200);
        	atm.checkBalance();
    	}
}