package SQL;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import basics.Employee;
import basics.HibernateUtil;

public class Tes1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		String sql = "SELECT * FROM EMPLOYEEDETAILS";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Employee.class);// mention the entity class name

		List<Employee> results = query.list();

		for(Employee emp: results) {
			System.out.println(emp.getId() + " " + emp.getUserName() + " "+emp.getUsersalary());
		}
		session.close();
	
	}
}
