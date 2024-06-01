//Program to demonstrate Overloading - Compile Time Polymorphism
package ProgramPackage9;

public class OverloadingDemo {

	public static void main(String[] args) {

		System.out.println("------------------------ Constructor Overloading -----------------------");
		
		Point p = new Point(); //default constructor invoked
		System.out.println(p);

		Point p1 = new Point(14.5f); //single parameter constructor
		System.out.println(p1);

		Point p2 = new Point(12.5f, 20.50f); //two paramters constructor
		System.out.println(p2);

		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + MethodOverloading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("Hello ", "World"));
	}
}
