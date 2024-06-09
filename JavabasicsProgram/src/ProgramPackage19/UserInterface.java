//Program to handle exceptions
package ProgramPackage19;

import java.util.InputMismatchException;
import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
	try {	
		Scanner sc = new Scanner(System.in);
		int startIndex, endIndex;
		String message,str;
		System.out.println("Enter the message: ");
		message=sc.nextLine();
		System.out.println("Enter the start index and end index: ");
		startIndex=sc.nextInt();
		endIndex=sc.nextInt();
		str=message.substring(startIndex, endIndex);
		System.out.println("The extracted message is: "+ str);
	
	}catch(StringIndexOutOfBoundsException ae) {
		System.err.println("Error! Invalid index ");
	
	}catch(InputMismatchException ae) {
		System.err.println("Error! Invalid input ");
	}
		
	}

}
