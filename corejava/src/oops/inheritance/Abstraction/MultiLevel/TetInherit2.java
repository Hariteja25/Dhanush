package oops.inheritance.Abstraction.MultiLevel;

public class TetInherit2 {
	public static void main(String[] args) {
		RBI r = new Icici(); // CREATE obj for child and refer by parent
		r.createAccount(); // icici
		r.createPPF();  // icici
		r.getKYC();  // icici
	}
}

