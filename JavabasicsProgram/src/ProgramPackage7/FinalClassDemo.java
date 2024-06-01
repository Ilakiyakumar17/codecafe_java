//Program to demonstrate final class
package ProgramPackage7;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClassDemo {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		f1.show();
	}
}