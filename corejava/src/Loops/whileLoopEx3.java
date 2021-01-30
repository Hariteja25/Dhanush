package Loops;

import java.util.Scanner;

public class whileLoopEx3 {
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		
		while(sum<100) {
			
			System.out.println("enter num");
			int n1= sc.nextInt();

			if(n1 < 0) {
				continue;// stop the current run and go to the next run.....
			}
			
			if(n1==999) {
				break;// stop all the runs and come out of the loop
			}
			sum = sum + n1;
		}
		System.out.println("sum is : "+sum);
	}
	



}
