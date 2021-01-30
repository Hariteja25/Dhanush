package oops.inheritance.multilevel;

public class Person2 {

	int id;
	String name;
	int age;


	public Person2(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public void displayPerson(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}


}
