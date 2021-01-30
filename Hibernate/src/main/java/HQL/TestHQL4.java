package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.Employee;
import basics.HibernateUtil;


public class TestHQL4 {
	public static void main(String[] args) {


		// get employee by id = 60 
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Query query = sessionObj
				.createQuery(" from Employee where id=50");
		Employee emp = (Employee) query.uniqueResult();
		System.out.println(emp);
	}
}