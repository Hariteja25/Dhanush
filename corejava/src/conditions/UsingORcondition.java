package conditions;

import java.util.Scanner;

public class UsingORcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the City");
		
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		
		if(s1.equals("Chennai") || s1.equals("hyd") || s1.equals("bang"))
		{
			System.out.println("Service is provided");
		}
		else
		{
			System.out.println("Service not provided");
		}

	}

}
