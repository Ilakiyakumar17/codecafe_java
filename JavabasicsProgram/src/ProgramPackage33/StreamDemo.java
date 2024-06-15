package ProgramPackage33;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//Create list of Employee
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(101, "Aniket", "Programmer",56000));
		empList.add(new Employee(102, "Komal", "Analyst",50000));
		empList.add(new Employee(103, "Sanket", "Tester",45000));
		empList.add(new Employee(104, "Akanksha", "Programmer",66000));
		empList.add(new Employee(105, "Prathmesh", "Analyst",56000));
		empList.add(new Employee(106, "Pranav", "Programmer",68000));

		System.out.println(empList);
		System.out.println("------------------------------------");
		//retrieving stream
		Stream<Employee> empStream=empList.stream();
		
		//map - retrieve 5% of salary
		List<Float> incentive=empStream.map(emp->emp.getSalary()*0.05f).toList();
		System.out.println(incentive);
		
		//filter - employee whose designation is Programmer
		empStream=empList.stream();
		empStream=empStream.filter(emp->emp.getDesignation().equals("Programmer"));
		empStream.forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		empStream=empList.stream();
		//filter - employee whose salary <=50000
		empStream=empStream.filter(emp->emp.getSalary()<=50000);
		empStream.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		//reduce - employee with minimum salary
		BinaryOperator<Employee> binaryOpr;
		binaryOpr=(e1, e2)->e1.getSalary()<e2.getSalary()?e1:e2;
		Optional<Employee> result=empList.stream().reduce(binaryOpr);
		System.out.println(result);
	}

}