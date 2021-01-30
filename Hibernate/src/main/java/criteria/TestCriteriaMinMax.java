package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import basics.Employee;
import basics.HibernateUtil;


public class TestCriteriaMinMax {
	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();

		Criteria empCriteria = s.createCriteria(Employee.class);

		empCriteria.add(Restrictions.between("usersalary", 5000, 10000));

		List<Employee> employees = empCriteria.list();

		for (Employee e : employees) {
			System.out.println(e);
		}
		s.close();
	}
}



