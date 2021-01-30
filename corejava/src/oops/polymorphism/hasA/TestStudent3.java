package oops.polymorphism.hasA;


public class TestStudent3 {

	public static void main(String[] args) {
		//create addres sobj
		Addressconstr addr = new Addressconstr("yyyyy road", "bangalore", "KA", "in", 24242);
		
		//create student obj with data
		Student2 s = new Student2(2121, "ram", "kumar", 3, addr);
		
		//print Student info
		s.showStudentInfo();
                //print address info
		s.address.showAddress();
	}
}
