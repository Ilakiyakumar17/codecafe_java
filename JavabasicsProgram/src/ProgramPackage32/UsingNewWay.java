package ProgramPackage32;

public class UsingNewWay {

	public static void main(String[] args) {
		//Lambda Expression
		MyCube obj=(no) -> no*no*no;
		
		/*
		 * MyCube obj=(no) -> { return no*no*no; };
		 */
		
		System.out.println("Cube is "+obj.getCube(3));
		
		Operations opr;
		
		//Addition
		opr=(a,b)-> a+b;
		System.out.println("Addition is "+opr.performArithmetic(10,5));
		
		//Subtraction
		opr=(a,b) ->a-b;
		System.out.println("subtraction is "+opr.performArithmetic(10,5));
		
		//Multiplication
		opr=(a,b) -> a*b;
		System.out.println("Multiplication is "+opr.performArithmetic(10,5));
		
		//Division
		opr=(a,b) ->a/b;
		System.out.println("Division is "+opr.performArithmetic(10,5));
		
		//check for String Palindrome
		Palindrome<String> strPalin;
		strPalin=(data)->
		{
			String revData=new StringBuffer(data).reverse().toString();
			return data.equals(revData);				
		};
		System.out.println("Is CAR Palindrome? : "+strPalin.checkPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? : "+strPalin.checkPalindrome("RACECAR"));
		
		//check for Number Palindrome
		Palindrome<Integer> intPalin;
		intPalin=(data) ->
		{
			int rev=0, no=data;
			while(no!=0)
			{
				rev=rev*10+no%10;
				no=no/10;
			}
			if (data==rev)
				return true;
			else
				return false;
		};
		
		System.out.println("Is 110 Palindrome? : "+intPalin.checkPalindrome(110));
		System.out.println("Is 101 Palindrome? : "+intPalin.checkPalindrome(101));
	}
}