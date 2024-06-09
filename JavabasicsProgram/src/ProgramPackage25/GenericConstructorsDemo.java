//Driver Program for generic constructors
package ProgramPackage25;

public class GenericConstructorsDemo {

	public static void main(String[] args) {
		  System.out.println("Number to Double Conversion:");
		  
		  GenericConstructors obj=new GenericConstructors(10);
		  obj.show();
		  
		  GenericConstructors objOne=new GenericConstructors(136.8F);
		  objOne.show();
		  
			/*
			 * GenericConstructors objTwo=new GenericConstructors("Hello")); objTwo.show();
			 */

	}

}
