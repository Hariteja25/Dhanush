package Loops;

import java.util.Scanner;

public class takeInputNumbersContinuosly {
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		
		while(sum<=100) {
			
			System.out.println("enter num");
			int n1= sc.nextInt();
			sum = sum + n1;
			
		}
		
		
		System.out.println("sum is : "+sum);
	}

}
