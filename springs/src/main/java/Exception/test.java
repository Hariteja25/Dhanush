package Exception;

public class test {
	public static void main(String[] args) {
		try {
			input.input();
		} catch (BusinessException ex) {
			System.out.println(ex.getErrCode());
		}
	}
}