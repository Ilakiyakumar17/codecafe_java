//Program to demonstrate concurrency
package ProgramPackage24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {

	public static void main(String[] args) {
		Account a1 = new Account(101, "Amit", 50000);
		System.out.println(a1);

		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			Runnable task = new AccountThread(a1, 1000 * (i + 1));
			executor.submit(task);
		}

		executor.shutdown();
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("------------------------------------");
		System.out.println(a1);
	}
}
