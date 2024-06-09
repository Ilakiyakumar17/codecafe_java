//program to demonstrate try catch block
package ProgramPackage19;

public class TryCatchExample {
	static int performDivision(int x, int y) {
		System.out.println("I am in method");
		int z = 0;
		try {
			System.out.println("I am in try block");
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block: " + e.getMessage());
		}
		return z;
	}
	static float performDivision(float a, float b)
	{
		return a/b;
	}
}
