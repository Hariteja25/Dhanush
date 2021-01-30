package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import basics.Employee;
import basics.HibernateUtil;

public class TestCriteriaLike {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String userNameLike="kumar";

		Criteria empCriteria = session.createCriteria(Employee.class);

		empCriteria.add(Restrictions.like("userName", "%"+userNameLike+"%"));
		// select * from EmployeeDetails where userName like '%testuser87%'

		List<Employee> employees = empCriteria.list();
		for(Employee e  : employees){
			System.out.println(e);
		}
		session.close();
	}
}

