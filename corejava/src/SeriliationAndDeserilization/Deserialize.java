package SeriliationAndDeserilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String args[]) throws Exception {
		File file = new File("obj1.txt");

		FileInputStream fis = new FileInputStream(file);

		ObjectInputStream in = new ObjectInputStream(fis);

		Student s = (Student) in.readObject(); // get studnet obj from file

		System.out.println("desrialization successs");
		System.out.println("id =" + s.id + " , name = " + s.name);
		System.out.println("refno = " + s.refNo);
		in.close();
	}
}
