package Loops;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		// take size as input
	    //  print nos from 1 to the input  
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size");
		int size= sc.nextInt();
		int i=1;//init  
		
		while(i<=size) { // condition
			System.out.println(i);
			i++; // increment
		}
	}

}
