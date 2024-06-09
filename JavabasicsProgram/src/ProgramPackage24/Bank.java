//Program to demonstrate Bank interface
package ProgramPackage24;

public interface Bank {
	int MINBAL=5000; //fields are static and final
	static final int DAILY_LIMIT=25000;
	public abstract void deposit(int amt) throws DepositLimitExceedsException;
	void withdraw(int amt)throws InsufficientBalanceException; //public and abstract
}