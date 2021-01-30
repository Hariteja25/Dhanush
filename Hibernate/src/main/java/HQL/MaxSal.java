package HQL;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.HibernateUtil;

public class MaxSal {
	public static void printMaxSal() {
		// get session obj
		Session sOj = HibernateUtil.getSessionFactory().openSession();

		// create query obj
		Query query = sOj.createQuery("select max(usersalary) from Employee");
		Integer maxSal = (Integer) query.uniqueResult();
		System.out.println(maxSal);

		// close sesion obj
		sOj.close();
	}


}
