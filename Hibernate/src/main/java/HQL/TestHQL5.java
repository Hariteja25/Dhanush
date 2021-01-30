package HQL;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.Employee;
import basics.HibernateUtil;


public class TestHQL5 {
	public static void main(String[] args) {
		// get name for a given empid
		Session sessionObj = HibernateUtil.getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id::");
		int id = sc.nextInt();

		Query query = sessionObj
				.createQuery(" from Employee where id=:inputEmpId");
		query.setParameter("inputEmpId", id);

		// Query query1 = sessionObj.createQuery(" from Employee where id="+id);

		Employee emp = (Employee) query.uniqueResult();

		System.out.println(emp);
		sessionObj.close();

	}
}
