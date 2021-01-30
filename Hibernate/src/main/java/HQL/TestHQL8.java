package HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.HibernateUtil;


public class TestHQL8 {
	public static void main(String[] args) { 
		// get session obj
		Session sOj = HibernateUtil.getSessionFactory().openSession();

		// create query obj
		Query query = sOj
				.createQuery("select userName,usersalary from Employee ");

		List<Object[]> rows = (List<Object[]>) query.list();

		for(Object[] row : rows) {
			String name = (String) row[0]; // userName
			Integer sal = (Integer) row[1]; // usersalary
			System.out.println(name);
			System.out.println(sal);
		}
	}
}

