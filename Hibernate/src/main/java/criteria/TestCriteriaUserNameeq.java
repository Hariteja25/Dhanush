package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import basics.Employee;
import basics.HibernateUtil;
public class TestCriteriaUserNameeq {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria empCriteria = session.createCriteria(Employee.class);

		empCriteria.add(Restrictions.eq("userName", "Dhanush"));
		// select * from EmployeeDetails where userName ='murali'

		List<Employee> employees = empCriteria.list();
		for(Employee e  : employees){
			System.out.println(e);
		}
		session.close();
	}
}

