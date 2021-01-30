package HQL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import basics.HibernateUtil;

public class TestHQL3 {
	public static void main(String[] args) {
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		// get all names from employeee
		Query query = sessionObj.createQuery("select usersalary from Employee");
		List<Integer> salaries = query.getResultList();
		for (Integer salary : salaries) {
			System.out.println(salary);
		}
		sessionObj.close();

	}
}