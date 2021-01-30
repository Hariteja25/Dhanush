package oops;

import java.util.Scanner;

public class TestPerson2 {
	
	public static void main(String[] args) {
		
		Person p=new Person();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int n1=sc.nextInt();
		
		System.out.println("Enter the age");
		int n2=sc.nextInt();
		
		System.out.println("Enter the name");
		String s=sc.next();
		
		System.out.println("id="+n1);
		System.out.println("age="+n2);
		System.out.println("name="+s);
		
	}
	

}
