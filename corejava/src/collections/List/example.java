package collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*dont take size
enter the name 
store every name inside the arraylist by avoiding the duplicates
if name value is "END" then stop taking the input
finally print all names
*/
public class example {
		public static void main(String[] args) {

			
			List<String> names = new ArrayList<String> ();
			while(true) {
				System.out.println("Enter the name");
				Scanner sc = new Scanner(System.in);
				String name = sc.next();
				if ("END".equals(name)) {
					break;

				}
				if(!names .contains(name)) {
				
					names.add(name);
				}
				
			}
	
				
			System.out.println("**********print all elements****************");
			for(String d : names) {
			System.out.println(d);
			}
			
			
	
		}
}


