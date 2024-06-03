package ProgramPackage14;

public class BankImpl {
	public void deposit(Account account,double amount, double DEPOSIT_LIMIT)
	{
		if(amount > DEPOSIT_LIMIT)
			
		             
	              System.err.println("Deposit not possible... exceeds Deposit Limit");
		else
			      account.setBalance(account.getBalance()+amount);
		System.out.println("Deposited" + amount + "into account:" + account.getAccNo());
		
	   }
	
	  public void withdraw(Account account,double amount, int MIN_BALANCE)
	  {
		  if(account.getBalance() - amount >= MIN_BALANCE)
		  {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawn "+ amount + "from account :" + account.getAccNo());
		  }
		  else
			  System.out.println("insufficient balance in account :" + account.getAccNo());
	  }

}

