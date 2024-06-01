//Program to demonstrate Single Inheritance 
package ProgramPackage11;

public class SLInheritanceDemo {

	public static void main(String[] args) {
		
		Citizen c = new Citizen("Partha", "258741962525", "Chennai", 9159186845L);
		System.out.println(c);
		
		Student student = new Student("Gayatri", "8080808080", "Bangalore", 9888878787L, 10, "City College");
		System.out.println(student);
	}
}
