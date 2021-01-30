package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetString {
	public static void main(String[] args) {

		//create hashset for strings
		Set<String> names = new TreeSet<String>();
		
		
		//add text in hashset
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");
		
		
		//print all
		System.out.println("Entered NAMES ARE :");
		for (String s: names) {
			System.out.println(s);
		}
		
		
	
	}
}
 

