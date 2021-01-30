package HQL;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.HibernateUtil;

public class MinSal {
	public static void printMinSal() {
		// get session obj
		Session sOj = HibernateUtil.getSessionFactory().openSession();

		// create query obj
		Query query = sOj.createQuery("select min(usersalary) from Employee");
		Integer maxSal = (Integer) query.uniqueResult();
		System.out.println(maxSal);

		// close sesion obj
		sOj.close();
	}
  

}
