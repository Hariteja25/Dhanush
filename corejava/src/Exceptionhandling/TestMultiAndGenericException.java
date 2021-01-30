package Exceptionhandling;

public class TestMultiAndGenericException {
	public static void main(String[] args) {
		String name = "";
		int num1 = 20;
		int num2 = 1;
		int nums[] = new int[5];
		String data = "";

		try {
			// possibility of exception due to divide by zero
			int x = num1 / num2;
			System.out.println(x);

			// java.lang.NullPointerException occurs if obj is not created
			System.out.println(name.length());

			int z = Integer.parseInt(data);
			System.out.println("int convert"+z);
			// error due to invalid index array index out of bound
			System.out.println(nums[9]);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
			//common exception handling for dividebyzero/Nullpointer/arrayindex
			System.out.println("client error :" + ex.getMessage());
		} catch (Exception ex) {
			//global exception handling 
			System.out.println("server error" + ex.getMessage());
		} finally {
			System.out.println("Program ends");
		}
	}
}

