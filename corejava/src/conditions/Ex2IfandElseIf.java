package conditions;

import java.util.Scanner;

public class Ex2IfandElseIf {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n1=sc.nextInt();
		System.out.println("Enter the age");
		int n2=sc.nextInt();
		System.out.println("Enter the name");
		String s=sc.next();
		
		if(n1<0)
		{
			System.out.println("number is invalid");
		}else if(n2<18)
		{
			System.out.println("number is valid");
			System.out.println("age is invalid");
		}else if(!s.equals("admin"))
		{
			System.out.println("number is valid");
			System.out.println("Age is valid");
			System.out.println("name is not valid");
		}
		else
		{
			System.out.println("number is valid");
			System.out.println("Age is valid");
			System.out.println("name is  valid");
		}

	}
}
