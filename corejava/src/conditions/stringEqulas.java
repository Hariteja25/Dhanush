package conditions;

import java.util.Scanner;

public class stringEqulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First String");
		
		String s1=sc.next();
		
		System.out.println("Enter the Second String");
		
		String s2=sc.next();
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("String are not equal");
		}

	}

}
