package oops.polymorphism.hasA;

public class Student2 {

	int id;
	String fname;
	String lname;
	int semester;

	Addressconstr address;// addres obj as instance variable

	public void showStudentInfo() {
		System.out.println(id);

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(semester);
	}

	public Student2(int id, String fname, String lname, int semester, Addressconstr address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.semester = semester;
		this.address = address;
	}
	
	

}

