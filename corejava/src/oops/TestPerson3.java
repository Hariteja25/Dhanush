package oops;

public class TestPerson3 {

	public static void main(String[] args) {
		
		//create obj
		
				Person p=new Person();
				//set the data
				
				p.id=10;
				p.age=20;
				p.name="Dhanush";
				
				System.out.println("************p************");
				System.out.println(p.id);
				System.out.println(p.age);
				System.out.println(p.name);
				
				
				
				Person p2=p;
				//p2 has separate memory
				
				System.out.println("*************p2***********");
				System.out.println(p2.id);
				System.out.println(p2.age);
				System.out.println(p2.name);
				

			}

		


	}


