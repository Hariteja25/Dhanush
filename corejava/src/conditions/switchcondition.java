package conditions;

import java.util.Scanner;

public class switchcondition {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bank name");
		
		String s=sc.next();
		
		switch(s)
		{
		case "sbi" : System.out.println("10%"); break;
		case "icici" : System.out.println("11%"); break;
		case "hdfc" : System.out.println("12%"); break;
		case "citi" :System.out.println("13%"); break;
		}
	}

}
