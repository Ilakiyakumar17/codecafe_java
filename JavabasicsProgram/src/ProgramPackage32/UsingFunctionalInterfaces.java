package ProgramPackage32;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display {
	static void show(String s) {
		System.out.println("****" + s + "*********");
	}
	void show1(String s) {
		System.out.println("****" + s + "*********");
	}
	String getName()
	{
		return "TNSIF";
	}
}

public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		// Consumer Functional Interface
		Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
		consumer.accept("Neha");		

		consumer = System.out::println; // method reference - instance inbuilt method
		consumer.accept("Pooja");
		
		consumer = Display::show; // method reference - static method
		consumer.accept("Java Programming");
		
		consumer = new Display()::show1; // method reference - instance method 
		consumer.accept("Hello");
		
		//Supplier  Functional Interface
		Supplier<String> supplier = () -> "Hello from Supplier!";
		System.out.println(supplier.get());

		//Constructor reference
		Supplier<Display> displaySupplier =  Display::new; //constructor reference 
		System.out.println(displaySupplier.get().getName());

		// Positive/Negative number test
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));

		// max test
		BiFunction<Integer, Integer, Integer> maxFunction = (x, y) -> x > y ? x : y;
		System.out.println(maxFunction.apply(25, 14));

		BiFunction<String, Integer, String> printFunction = (name, num) -> name + num;
		System.out.println(printFunction.apply("Good Evening", 2));

	}

}
