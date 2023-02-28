package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection conn;
	public EmployeeDAOImpl() {
		// TODO Auto-generated constructor stub
		try {
			System.out.println("Trying to connect to database....");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Database connected....");
			
			System.out.println("Trying to connect to the db....");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","admin");
			System.out.println("Connected to the db....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO employee (empno,empname,job,salary) VALUES (?,?,?,?);");
			
			preparedStatement.setInt(1,e.getEmployeeNumber());
			preparedStatement.setString(2,e.getEmployeeName());
			preparedStatement.setString(3,e.getEmployeeJob());
			preparedStatement.setInt(4,e.getEmployeeSalary());
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the insert query : "+rows+ " row(s) inserted");
			
			preparedStatement.close();			
		} catch (SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}

	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try {
			Statement statement = conn.createStatement();
			
			
			ResultSet result = statement.executeQuery("SELECT * FROM employee;");
			
			while(result.next()) {
				int empNo =  result.getInt(1);
				String empName = result.getString(2);
				String job = result.getString(3);
				int salary = result.getInt(4);
				
				Employee temp = new Employee(empNo,empName,job,salary);
				employees.add(temp);
				
			}
			
			result.close();
			
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		Employee res = null;
		try {
			Statement statement = conn.createStatement();
			
			
			ResultSet result = statement.executeQuery("SELECT * FROM employee WHERE empno = " + empno + ";");
			
			int flag = 0;
			int salary = 0;
			String empname="",job="";
			while(result.next()) {
				flag = 1;
				empno = result.getInt(1);
				empname =  result.getString(2);
				job =  result.getString(3);
				salary = result.getInt(4);
			}
			
			if(flag==0) {
				System.out.println("No employee found with given Employee Number");
				res = null;
			}
			else {
				System.out.println("Employee found with given Employee Number");
				res = new Employee(empno,empname,job,salary);
			}
			
			result.close();
			
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		int currEmpNo = e.getEmployeeNumber();
		String currName = e.getEmployeeName();
		String currJob = e.getEmployeeJob();
		int currSalary = e.getEmployeeSalary();
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("UPDATE employee SET empname=?,job=?,salary=? WHERE empno=?");
			
			preparedStatement.setString(1,currName);
			preparedStatement.setString(2,currJob);
			preparedStatement.setInt(3,currSalary);
			preparedStatement.setInt(4,currEmpNo);
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the update query : "+rows+ " row(s) updated");
			
			preparedStatement.close();			
		} catch (SQLException err) {
			// TODO Auto-generated catch block
			err.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM employee WHERE empno=?");
			preparedStatement.setInt(1,empno);
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the delete query : "+rows+ " row(s) deleted");
			
			preparedStatement.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
