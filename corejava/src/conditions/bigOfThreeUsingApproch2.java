package conditions;

import java.util.Scanner;

public class bigOfThreeUsingApproch2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		
		int n2=sc.nextInt();
		
		System.out.println("Enter the Third Number");
		
		int n3=sc.nextInt();
		
		int big=n1;
		
		if(n2>big)
		{
			big=n2;
		}
		if(n3>big)
		{
			big=n3;
		}
		System.out.println("big="+big);
	}

}
