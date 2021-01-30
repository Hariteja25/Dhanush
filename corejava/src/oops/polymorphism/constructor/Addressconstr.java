package oops.polymorphism.constructor;

public class Addressconstr {

	String street;
	String city;
	String state;
	String Country;
	int pin;

	public void showAddress() {
		System.out.println(state);
		System.out.println(city);
		System.out.println(state);
		System.out.println(Country);
		System.out.println(pin);


	}

	public Addressconstr(String street, String city, String state, String country, int pin) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		Country = country;
		this.pin = pin;
	}

}