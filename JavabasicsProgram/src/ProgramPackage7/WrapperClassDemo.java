package ProgramPackage7;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		System.out.println(i);
        int b = i.intValue();
        System.out.println(b);
        
        int c = i;
        System.out.println(c);
        
        int a = 100;
        Integer il = a;
        System.out.println(il);

	}

}