//Program to demonstrate List collection for user defined objects and 
//sort elements using comparable and comparator
package ProgramPackage27;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


class Point implements Comparable<Point>
{
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x)
			return Float.compare(this.y, o.y);
		return Float.compare(this.x, o.x);
	}
	
}
public class ListDemo {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		//List studentList = new ArrayList(); //
		Point p1=new Point(12,4.5f);
		Point p2=new Point(10,20);
		List<Point> pList=new ArrayList<Point>();
		pList.add(p1);
		pList.add(p2);
		Collections.sort(pList);
		
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);

		// Using Comparable interface
		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		// Adding Person objects into ArrayList
		List<Person> personList = new ArrayList<Person>();
		Person person1 = new Person("Abhijit", "Mumbai");
		personList.add(person1);

		person1 = new Person("Milind", "Pune");
		personList.add(person1);

		person1 = new Person("Saurav", "Bangalore");
		personList.add(person1);

		person1 = new Person("Madhur", "Delhi");
		personList.add(person1);

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Collections.sort(personList, new SortByName());

		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByCity());

		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}

}