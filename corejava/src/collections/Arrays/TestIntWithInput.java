package collections.Arrays;

import java.util.Scanner;

public class TestIntWithInput {
	public static void main(String[] args) {
		// 1. input size
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// 2. declare the array with size
		int [] numbers = new int[size];

		// 3. input the numbers
		for(int i=0; i< size ; i++) {
			System.out.println("Enter number : "+  (i+1));
			int num = sc.nextInt();
			numbers[i] = num;
		}

		// display integers
		System.out.println("**********print all elements****************");
		for(int d : numbers) {
			System.out.println(d);
		}
	}
}
