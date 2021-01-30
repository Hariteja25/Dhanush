package oops;

public class TestPerson4 {
	
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
				//assignment of p1 to p2
				//here new obj is not created
				//both p1 and p2 are pointing to the sameobj
				
				System.out.println("*************p2***********");
				System.out.println(p2.id);
				System.out.println(p2.age);
				System.out.println(p2.name);
				
				
				System.out.println("*************After change*****************");
				
				p2.age=22;
				p2.id=14;
				p2.name="Kumar";
				
				System.out.println(p.id);
				System.out.println(p.age);
				System.out.println(p.name);
				
				
				System.out.println(p2.id);
				System.out.println(p2.age);
				System.out.println(p2.name);

			}


}
