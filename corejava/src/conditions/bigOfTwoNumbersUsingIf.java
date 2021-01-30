package conditions;

import java.util.Scanner;

public class bigOfTwoNumbersUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First no:-");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter the Second no:-");
		
		int n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("big="+n1);
		}else
		{
			System.out.println("big="+n2);
		}

	}

}
