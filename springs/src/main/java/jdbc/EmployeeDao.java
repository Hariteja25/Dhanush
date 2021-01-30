package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDao() {
		super();
	}

	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		return jdbcTemplate.update("insert into employeeinfo values(?,?,?)",
				new Object[] { e.getId(), e.getName(), e.getSalary() });
	}

	public int saveEmployee1(Employee e) {
		String query = "insert into employeeinfo values " + "(" + e.getId() + ",'" + e.getName() + "'," + e.getSalary()
				+ ")";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employeeinfo set name=?,salaryinfo=? where id=?";
		return jdbcTemplate.update(query, new Object[] { e.getName(), e.getSalary(), e.getId() });
	}

	public int deleteEmployeeById(int id) {
		String query = "delete from employeeinfo where id=?";
		return jdbcTemplate.update(query, new Object[] { id });
	}

	public Employee getEmpById1(int id) {
		ResultSetExtractor<Employee> extractor = new ResultSetExtractor<Employee>() {
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				Employee e = null;
				if (rs.next()) {
					int id = rs.getInt("ID");
					String myname = rs.getString("NAME");
					long sal = rs.getLong("SALARYINFO");
					e = new Employee(id, myname, sal);
				}
				return e;
			}
		};

		return jdbcTemplate.query("select * from employeeinfo where id =?", new Object[] { id }, extractor);
	}

	public Employee getEmpById2(int id) {
		RowMapper<Employee> mapper = new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
				int id = rs.getInt("ID");
				String myname = rs.getString("NAME");
				long sal = rs.getLong("SALARYINFO");
				Employee e = new Employee(id, myname, sal);
				return e;
			}
		};
		List<Employee> query = jdbcTemplate.query("select * from employeeinfo where id =?", new Object[] { id },
				mapper);
		return query.isEmpty() ? null : query.get(0);
	}

	// query method returns list for RowMapper
	// query method can return any Obj for ResultSetExtractor

	public List<Employee> getAllEmployees1() {
		ResultSetExtractor<List<Employee>> extractOBJ = new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> emps = new ArrayList<Employee>();
				while (rs.next()) {
					int id = rs.getInt("ID");
					String myname = rs.getString("NAME");
					long sal = rs.getLong("SALARYINFO");
					Employee e = new Employee(id, myname, sal);
					emps.add(e);
				}
				return emps;
			}
		};
		return jdbcTemplate.query("select * from employeeinfo", extractOBJ);
	}

	// for ResultSetExtractor dev has to create the list , dev has to keep the
	// object inside the list by looping the ResultSet

	public List<Employee> getAllEmployees2() {
		RowMapper<Employee> empRM = new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				int id = rs.getInt("ID");
				String myname = rs.getString("NAME");
				long sal = rs.getLong("SALARYINFO");
				Employee e = new Employee(id, myname, sal);
				return e;
			}
		};
		return jdbcTemplate.query("select * from employeeinfo", empRM);
	}

	// for Rowmapper no need to 1.create the list + no need to keep the object
	// inside the list + no need for looping the ResultSet

}
