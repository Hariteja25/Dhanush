package collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class TestMapStringString {
	public static void main(String[] args) {
		System.out.println("************** HASHMAP ********************");

		Map<String, String> map = new HashMap<>();
		map.put("129", "user2");
		map.put("132", "user6");
		map.put("128", "user1");
		map.put("133", "user7");
		map.put("130", "user3");
		map.put("131", "user4");

		//use map.entrySet() for iterating the map
		// map.entrySet() -> return entry objects.
		//every entry obj has key and value 
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key === " + key + "  value ==" + value);
		}

	}
}

