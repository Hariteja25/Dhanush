package composition;

import org.hibernate.Session;

import basics.HibernateUtil;

public class TestGetPerson {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		//make db call to fetch the person details
		PersonWithAddress person = (PersonWithAddress)s.load(PersonWithAddress.class, 1);
		System.out.println(person);

		//get the address and print
		Address curAddress = person.getCurAddress();
		curAddress.displayAddress();
		s.close();
	}

}
