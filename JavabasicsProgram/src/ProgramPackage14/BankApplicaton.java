package ProgramPackage14;

public class BankApplicaton {

	public static void main(String[] args) {
		 BankImpl bank = new BankImpl();
	        Account account = new Account(123456, "Mithir", 155000, bank);
	        System.out.println();

	        account.deposit(2000);
	        System.out.println(account);

	        account.withdraw(1000);
	        System.out.println(account);
	    }


	}


