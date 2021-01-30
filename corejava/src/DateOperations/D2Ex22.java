package DateOperations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D2Ex22 {
	public static void main(String[] args) {
		Date dateObj = new Date();

		String pattern = "MMMMM dd yyyy  HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(dateObj);
		System.out.println(date);	
	}
}

