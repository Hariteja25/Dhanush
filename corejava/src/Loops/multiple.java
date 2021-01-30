package Loops;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int sum=0;
		int big=0;
		int small=0;
		
		for(int i=1;i<=size;i++)
		{
			System.out.println("enter the num"+i);
			int n1=sc.nextInt();
			sum=sum+n1;
			if(i==1)
			{
				big=n1;
				small=n1;
			}
			if(n1>big)
			{
				big=n1;
				
			}
			if(n1<small)
			{
				small=n1;
			}
		}
		System.out.println(sum);
		System.out.println(big);
		System.out.println(small);

	}

}
