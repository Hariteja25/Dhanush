package HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.HibernateUtil;


public class TestHQL7 {
	public static void main(String[] args) { 
		// get session obj
		Session sOj = HibernateUtil.getSessionFactory().openSession();
		System.out.println("enter id::");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();

		// create query obj
		Query query = sOj
				.createQuery("select userName,usersalary from Employee where id=:inputId ");
		query.setParameter("inputId", id);

		Object[] row = (Object[]) query.uniqueResult();

		String name = (String) row[0]; // userName
		Integer sal = (Integer) row[1]; // usersalary
		System.out.println(name);
		System.out.println(sal);
	}
}


