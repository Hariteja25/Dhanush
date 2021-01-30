package Input;

import java.util.Scanner;

public class multipleInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int n1=sc.nextInt();
		
		System.out.println("Enter the Second number");
		
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		int sub=n1-n2;
		int mul=n1*n2;
		int div=n1/n2;
		int rem=n1%n2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);

	}

}
