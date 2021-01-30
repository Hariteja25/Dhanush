package GenericClass;

public class Person<T> {

	private T data; // instance variacle can be any data type
	
	public T get(){
		return this.data;
	}
	
	public void set(T t1){
		this.data=t1;
	}
}

