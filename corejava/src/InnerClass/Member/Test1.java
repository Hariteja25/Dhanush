package InnerClass.Member;

public class Test1 {
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.print();

		Outer.Inner in = obj.new Inner();
		in.msg();
	}
}
