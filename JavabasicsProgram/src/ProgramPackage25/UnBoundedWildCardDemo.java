//Driver Program for Unbounded wild card
package ProgramPackage25;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Display Integer values");
		//Display List of Integers
		UnBoundedWildCard.display(intList);

		List<String> strList = Arrays.asList("Hi", "Hello", "How are you");
		System.out.println("Display String values");
		//Display List of String
		UnBoundedWildCard.display(strList);
		
		Person persons[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		List<Person> personList = Arrays.asList(persons);
		System.out.println("Display Person values");
		//Display List of Persons
		UnBoundedWildCard.display(personList);
	}
}
