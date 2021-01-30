package oops.inheritance.ISAconstructor;

public class Person {
	//instance  variables
	private String name;
	private int age;
	private int id;

	//constr
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	//instance method
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}



