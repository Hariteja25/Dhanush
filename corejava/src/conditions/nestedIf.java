package conditions;

import java.util.Scanner;

public class nestedIf {

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
			System.out.println("no is valid");
			if(n2>=18)
			{
				System.out.println("Age is valid");
				if(s.equals("admin"))
				{
					
					System.out.println("name is valid");
				}else
				{
					System.out.println("names is in valid");
				}
				}else
				{
					System.out.println("age is in valid");
			}
		}else
		{
			System.out.println("no is in valid");
		}
		

	}

}
