//Program to demonstrate Thread Synchronization
package ProgramPackage24;

public class SynchronizationDemo {

	public static void main(String[] args) {

		Account acc = new Account(101, "Amit", 50000);
		System.out.println(acc);

		// Five account threads running parallel and sharing same resource
		AccountThread thread[] = new AccountThread[5];
		for (int i = 0; i < 5; i++) {
			thread[i] = new AccountThread(acc, 1000 * (i + 1));
			try {
				thread[i].join(); // waits main thread till execution of all child thread finish
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(acc);

	}

}