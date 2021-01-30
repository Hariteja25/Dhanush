package HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.HibernateUtil;


public class TestHQL6 {
	public static void main(String[] args) { 
		// get name for a given empid
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter id::");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		Query query = sessionObj
				.createQuery("select userName from Employee where id=:inputEmpId");
		query.setParameter("inputEmpId", id);
		String userName = (String) query.uniqueResult();
		System.out.println(userName);
		sessionObj.close();
	}
}

