package oops.InstanceMethods;

public class TestCalculator {
	public static void main(String[] args) {
		System.out.println("****c1 obj operations *****");

		// create object
		Calculator c1 = new Calculator();

		// set the data
		c1.n1 = 20;
		c1.n2 = 10;

		//call the methods using the object

		c1.sum();
		c1.sub();
		c1.div();
		c1.mul();


		System.out.println("****c2 obj operations *****");
		Calculator c2 = new Calculator();
		c2.n1 = 200;
		c2.n2 = 100;
		c2.sum();
		c2.sub();
		c2.div();
		c2.mul();
	}}

