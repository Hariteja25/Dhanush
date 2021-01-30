package composition;

import org.hibernate.Session;

import basics.HibernateUtil;

public class TestPersonSave {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();

		//create person obj
		PersonWithAddress personWithAddress = new PersonWithAddress();
		personWithAddress.setAge(28);
		personWithAddress.setName("shyam");
		
		
		//create addr obj 
		Address add = new Address();
		add.setCity("hyd");
		add.setCountry("IN");
		add.setPin(12345);
		add.setState("AP");
		add.setStreetNo("asrsf");

		//set the relationship between objs
		personWithAddress.setCurAddress(add);

		session.save(personWithAddress);
		session.getTransaction().commit();
		session.close();
	}
}
