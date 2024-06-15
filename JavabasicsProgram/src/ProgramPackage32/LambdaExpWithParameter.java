package ProgramPackage32;

import java.util.function.Function;
import java.util.stream.Stream;

public class LambdaExpWithParameter {

	public static void main(String[] args) {
		
		 //Using Lambda Expression
        Message m1=(name)->{  
            System.out.println("Hello "+name);  
        };  
        m1.greet("Nikhil");
        
		Cube c = (a) -> {
			return (a * a * a);
		};
		System.out.println("Cube of 5 is "+c.calculate(5));

		Cube c1 = (a)->a*a*a;  // Finding the cube of a number			
		System.out.println("Cube of 4 is "+c1.calculate(4)); 
		
		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70);
		Function<Integer, Integer> sqr=(n)->n*n;
		stream.map(sqr).forEach(System.out::println);

		
		IsOdd o = (a) -> a % 2 != 0 ? true : false;

		System.out.println("Is 7 Odd Number? :" +o.CheckOdd(7));
		System.out.println("Is 8 Odd Number? :" +o.CheckOdd(8));
	}

}