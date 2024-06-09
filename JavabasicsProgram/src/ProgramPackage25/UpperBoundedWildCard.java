//Program to demonstrate upper bound wild card class
package ProgramPackage25;

import java.util.ArrayList;

public class UpperBoundedWildCard {
	//Parameter ArrayList(<?>) is List of any subclass object of Number
	public static Double sumOfList(ArrayList<? extends Number> al) // any subclass of Number class
	{
		double sum = 0.0;
		for (Number n : al) {
			sum = sum + n.doubleValue();
		}
		return sum;
	}

}
