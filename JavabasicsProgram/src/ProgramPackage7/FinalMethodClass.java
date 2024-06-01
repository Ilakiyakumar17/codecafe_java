//Program to demonstrate final method 
package ProgramPackage7;

//class with final method
class FinalMethodClass {
	// constructor
	FinalMethodClass() {
		System.out.println("This is a default constructor");
	}

	final int a = 50;

	// Final method
	final void show() {
		System.out.println("Value of a: " + a);
	}
}
