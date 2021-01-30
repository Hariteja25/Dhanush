package oops.polymorphism;

public class TestData {
	public static void main(String[] args) {
		 
		Data d = new Data();
		
		d.save("kumar");
		
		Person p = new Person();
		d.save(p);
		
 	}
}
