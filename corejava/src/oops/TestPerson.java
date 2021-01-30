package oops;

public class TestPerson {

	public static void main(String[] args) {
		
		//create obj
		
		Person p=new Person();
		//set the data
		
		p.id=10;
		p.age=20;
		p.name="Dhanush";
		
		
		Person p2=new Person();
		//p2 has separate memory
		p2.id=2;
		p2.age=10;
		p2.name="Kumar";
		
		//print
		
		System.out.println(p.id);
		System.out.println(p.age);
		System.out.println(p.name);
		
		System.out.println(p2.id);
		System.out.println(p2.age);
		System.out.println(p2.name);
		

	}

}
