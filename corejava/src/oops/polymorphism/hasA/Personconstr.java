package oops.polymorphism.hasA;

public class Personconstr{
	
	//instance variables
	int id;
	String name;
	int age;
	Addressconstr address;// addres obj as instance variable
	
	public void showPersonInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

	public Personconstr(int id, String name, int age, Addressconstr address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

}
