package oops.constructor;

public class Person {
	// instance variables
	int id;
	String name;
	int age;

	// param arg  constructor [3 args]
	public Person(int id, int age, String name) {
		System.out.println("3 args constructr");
		this.id = id;
		this.age = age;
		this.name = name;
	}

	// param arg  constructor [ 2 args]
	public Person(int age, String name) {
		System.out.println("2 args constructr");
		this.age = age;
		this.name = name;
	}

	// zero arg constructor 
	public Person() {
		System.out.println("zero arg constructr");
	}

	//instance method
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}