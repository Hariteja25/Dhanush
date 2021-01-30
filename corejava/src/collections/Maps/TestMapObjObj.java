package collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



 public class TestMapObjObj {
	public static void main(String[] args) {
		Map<Employee, Project> map = new HashMap<>();
		
		Employee e1 = new Employee("user1",1,"testpan1");
		Employee e2 = new Employee("user2",2,"testpan2");
		Employee e3 = new Employee("user3",3,"testpan3");
		
		Project p1 = new Project(12,"pro1");
		Project p2 = new Project(13,"pro2");
		Project p3 = new Project(14,"pro3");
		
		//keep the data in map
		map.put(e1, p1);
		map.put(e2, p2);
		map.put(e3, p3);
		
		System.out.println("**************print all entries***********************");
		for(Entry<Employee, Project> entry :  map.entrySet()) {
			Employee e = entry.getKey();
			Project p = entry.getValue();
			
			System.out.println("key= "+e + " , value=" + p);
		}
	}
}


