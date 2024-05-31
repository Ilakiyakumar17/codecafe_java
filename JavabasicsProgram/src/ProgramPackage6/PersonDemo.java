//Program to demonstrate creating objects
package ProgramPackage6;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String args[]) {
		Person p1 = new Person(); // default constructor invoked

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// p1.personName=name private member can't accessible
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new Person(name, age, city); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();

	}
}

