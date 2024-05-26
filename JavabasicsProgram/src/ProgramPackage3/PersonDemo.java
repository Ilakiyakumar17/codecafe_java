package ProgramPackage3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// Scanner use to get the user input
		Scanner ob = new Scanner(System.in);
		String name;
		System.out.println("Enter person name");
		name = ob.next();
	   System.out.println("Enter the person age");
	   int age = ob.nextInt();
	    String gender;
	    System.out.println("Enter the person gender");
	    gender = ob.next();
	    System.out.println("Enter the person taxable income");
		   int income = ob.nextInt();
	    Person person =new Person();
	    //person object and initialize values using a getter and setter method
	    person.setName(name);
	    person.setAge(age);
	    person.setgender(gender);
	    person.setincome(income);
	    //display person details using toString() method 
	    System.out.println(person);
	     TaxCalculation calc =  new TaxCalculation();
	    calc.CalculateTax(person);
	    System.out.println("After the calculating tax:");
	    System.out.println(person);
	    ob.close();
	    }

	}

