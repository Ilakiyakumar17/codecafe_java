package ProgramPackage33;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//Create a list of integers from an array
		List<Integer> numList=Arrays.asList(2,3,4,5,6);
		
		//Retrieve a stream from a list
		Stream<Integer> stream=numList.stream();

		//Perform map operation for squaring each element from list
		stream=stream.map(x->x*x);
		stream.forEach(x->System.out.println(x));
		
		stream=numList.stream();
		Function<Integer, Integer> fun=(x)->x*x;
		stream=stream.map(fun);
		
		//Display squares of each element
		//stream.forEach(x->System.out.println(x));
		stream.forEach(System.out::println); //method reference
		
		//Count number of elements 
		stream=numList.stream();
		System.out.println("Count : "+stream.count());
				
		//Collect all squares into another list
		stream=numList.stream();
		List sqrList=stream.map(x->x*x).toList();
		//sqrList=stream.collect(Collectors.toList());
		System.out.println("Number List is "+numList);
		System.out.println("Square list is "+sqrList);
		
		//Method Reference
		numList.stream(). //retrieving stream
			map(x->x*x*x). //performing cube for each element
			forEach(System.out::println); //display each cube
		
		//Using Functional Interface reference
		Function<Integer, Double> sqrt=x->Math.sqrt(x);
		Consumer<Double> consumer=x->System.out.println(x);
		numList.stream().map(sqrt).forEach(consumer);
		
		System.out.println("----------------------------------------");
		//Creating List of names
		List<String> nameList=Arrays.asList("Neha","Mihir","Pooja","Dhruv","Meet");
		System.out.println(nameList);
		
		//Limit
		Stream<String> strStream=nameList.stream().limit(3);
		System.out.println("Top 3 Names");
		strStream.forEach(System.out::println);
		
		//Skip first 2 names
		System.out.println("Skip 2 Names");
		nameList.stream().skip(2).forEach(System.out::println);
		
		//distinct
		strStream=nameList.stream();
		strStream.map(s->s.length()).distinct().forEach(System.out::println);
		
		//filter
		System.out.println(numList);
		
		//stream=numList.stream().filter(x->x%2==0);
		
		Predicate<Integer> evenPredicate=x->x%2==0;
		stream=numList.stream().filter(evenPredicate);
		stream.forEach(System.out::println);
		
		System.out.println("------------------------------");
		System.out.println(numList);
		
		
		stream=numList.stream();
		//Returns sum of numbers
		Optional<Integer> result;
		result=stream.reduce((x,y)->x+y);
		System.out.println(result.get());
		
		//returns maximum of numbers
		BinaryOperator<Integer> binaryOpr=(x,y)->x>y?x:y;
		stream=numList.stream();
		result=stream.reduce(binaryOpr);
		System.out.println(result);
		
	}

}
