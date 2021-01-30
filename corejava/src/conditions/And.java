package conditions;

import java.util.Scanner;

public class And {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id");
		int n1=sc.nextInt();
		System.out.println("Enter the age");
		int n2=sc.nextInt();
		System.out.println("Enter the name");
		String s=sc.next();
		
		if(n1>0 && n2>18 && s.equals("admin"))
		{
			System.out.println("Valid data");
		}else
		{
			System.out.println("not valid data");
		}

	}

}
