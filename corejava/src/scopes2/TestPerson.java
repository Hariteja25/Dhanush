package scopes2;

import  scopes1.Person;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();

		//set data
		p.id = 1200;
		p.name="user1";
		p.age=45;

		//print
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
	}
}

