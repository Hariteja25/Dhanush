package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import basics.Employee;
import basics.HibernateUtil;

/**
Get first 20

 */


public class TestCriteria2{

	public static void main(String[] args) {
		//get session obj
		Session  s = HibernateUtil.getSessionFactory().openSession();

		//get criteria obj
		Criteria c1 = s.createCriteria(Employee.class);

		c1.setFirstResult(0);
		c1.setMaxResults(20);


		//call list method
		List<Employee> list = c1.list();
		System.out.println("List:-"+list.size());
		for(Employee e: list){
			System.out.println(e);
		}

		//close session
		s.close();	







	}

}
