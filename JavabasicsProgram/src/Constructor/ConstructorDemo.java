package Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		//object for default constructor.
		Constructor c= new Constructor();
		System.out.println(c);
		//object for parameterized constructor.
		Constructor c1=new Constructor("ilakiya",17);
		System.out.println(c1);
		//object for overloaded constructor.
		Constructor c2=new Constructor("ilakiya",17,15);
		System.out.println(c2);

	}

}
