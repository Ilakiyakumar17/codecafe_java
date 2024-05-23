package Basics;

import java.util.Scanner;

public class Studentdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid;
		String sname;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the sid and name:");
		sid=s.nextInt();
		sname=s.nextLine();
		
		System.out.print("sid:"+sid+"and sname:"+sname);
	

	}

}
