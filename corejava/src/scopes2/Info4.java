package scopes2;

import scopes1.Info;

public class Info4 extends Info {

	public void show(){
		//access everything within class
		System.out.println(id);
		//System.out.println(name);/ private cannot be accessed outside the class.
		System.out.println(age); // can be accessed because Info4 is child class
		//System.out.println(count);  // default cannot be accessed outside the pkg
	}

}
