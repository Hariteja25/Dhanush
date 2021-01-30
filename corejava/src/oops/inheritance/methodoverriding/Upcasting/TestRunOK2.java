package oops.inheritance.methodoverriding.Upcasting;

public class TestRunOK2 {
	public static void main(String[] args) {
		RBI r = new Hdfc();// create obj for HDFC and refer by RBI
		r.createAcc();  //RBI
		r.processLoan();  //Hdfc



		r = new Icici(); // create obj for Icici and refer by RBI
		r.createAcc();//RBI
		r.processLoan();//Icici



		r= new SBI() ;// create obj for SBI and refer by RBI
		r.createAcc();//RBI
		r.processLoan();//SBI
	}
}

// r.processLoan() from class the logic is executed can be predicted only at runtime...

// that depends on the object pointed by r.
// r can refer to hdfc obj or icici obj or sbi obj


