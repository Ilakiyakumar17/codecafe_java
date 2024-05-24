package Basics;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before operators:"+a+""+b);
		++a;
		  int c= ++a +b+a--;
		 System.out.println("c value after the operators:"+c);
		 int d= c++ +a+b--;
		 System.out.println("d value after the operators:"+d);
	System.out.println("a,b,c,d value after the operators"+a+""+b+""+c+""+d);
		 x = (10==x)?1:0;
		 System.out.println(x);

	}

}
