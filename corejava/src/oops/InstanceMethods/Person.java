package oops.InstanceMethods;

public class Person {

	// id,name, age are instance variables
	int id;
	String name;
	int age;


	//display() is the instance method
	// from the instance method we can access the instance variables.
	public void display(){
		System.out.println(id);// print id
		System.out.println(name);
		System.out.println(age);
	}
}

