package oops.InstanceMethods;

public class TestCalculator2 {
	public static void main(String[] args) {
		// create the obj
		Calculator2 c1 = new Calculator2();

		System.out.println("****c1 obj operations *****");
		int a=90;
		int b=40;

		//call methods using obj
		c1.sum(a,b);
		c1.sub(a,b);
		c1.div(a,b);
		c1.mul(a,b);



	}}

