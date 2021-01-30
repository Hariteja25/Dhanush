package conditions;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n1=sc.nextInt();
		System.out.println("Enter the age");
		int n2=sc.nextInt();
		System.out.println("Enter the name");
		String s=sc.next();
		
		if(n1>0)
		{
			System.out.println("valid no");
		}else
		{
			System.out.println("not valid no");
		}
		
		if(n2>=18)
		{
			System.out.println("Age is valid");
		}else
		{
			System.out.println("Age is not valid");
		}
		
		if(s.equals("admin"))
		{
			System.out.println("Name is valid");
		}else
		{
			System.out.println("Name is not valid");
		}

	}

}
