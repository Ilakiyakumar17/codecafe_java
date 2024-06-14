//Program to demonstrate Command Line Arguments 
package ProgramPackage29;

public class WrapperClassDemoOne {

	public static void main(String args[]) {
		System.out.println("Hello World");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}

}
