package oops.polymorphism.hasA;

public class Person1{
	
	//instance variables
	int id;
	String name;
	int age;
	Address1 address;// addres obj as instance variable
	
	public void showPersonInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}
