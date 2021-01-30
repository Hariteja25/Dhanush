package HQL;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import basics.HibernateUtil;

public class TestHQL2 {
	public static void main(String[] args) {
   Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Query query = sessionObj.createQuery("select userName from Employee");
		List<String> names = query.getResultList();
		for (String name : names) {
			System.out.println(name);
		}
		sessionObj.close();
  
  }
}
