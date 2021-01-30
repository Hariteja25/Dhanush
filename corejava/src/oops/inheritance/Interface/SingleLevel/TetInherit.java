package oops.inheritance.Interface.SingleLevel;

public class TetInherit {
	public static void main(String[] args) {
	 	RBIBank r = new  Icici();
	 	r.createAccount(); // Icici
	 	r.processLoan();   // Icici
	}

}

/*
WorldBank - [interface]
        |
        |  processLoan()  - abstract
        | 
      RBIBank   - [interface]   extends WorldBank
        |
        |  createAccount  - abstract
        |    
      Icici   - [class] implements RBIBank
        |
        | - has to override all abstarct methods 
        |
*/