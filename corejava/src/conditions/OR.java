package conditions;

import java.util.Scanner;

public class OR {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Servive");
		
		String s=sc.next();
		
		if(s.equals("hyd") || s.equals("bang") || s.equals("chennai"))
		{
			System.out.println("Service is provided");
		}else
		{
			System.out.println("Service s not provided");
		}
	}

}
