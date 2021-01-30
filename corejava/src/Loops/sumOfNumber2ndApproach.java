package Loops;

import java.util.Scanner;

public class sumOfNumber2ndApproach {
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		 /*
		   n * (n+1)/2
		  * */
		int sum = size * (size+1)/2; 
		
		System.out.println("sum = "+sum);
	}

}
