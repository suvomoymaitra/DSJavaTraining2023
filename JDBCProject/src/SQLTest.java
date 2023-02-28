import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class SQLTest {

	public static void main(String[] args) {
		Employee e = new Employee("root","admin");
		
//		e.addValues(8,"Shubham","SWE",25000);
		
//		e.updateValue(8, "SWE-1", 50000);
		
		e.deleteValue(8);
		
		e.displayValues("SELECT * FROM employee ORDER BY empname;");
		
		e.closeConnection();
	}
}

class Employee{
	Connection conn;
	
	Employee(String user,String pass){
		try {
			System.out.println("Trying to connect to database....");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Database connected....");
			
			System.out.println("Trying to connect to the db....");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql",user,pass);
			System.out.println("Connected to the db....");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void addValues(int empId,String empName,String job,int salary) {
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO employee (empno,empname,job,salary) VALUES (?,?,?,?);");
			
			preparedStatement.setInt(1,empId);
			preparedStatement.setString(2,empName);
			preparedStatement.setString(3,job);
			preparedStatement.setInt(4,salary);
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the insert query : "+rows+ " row(s) inserted");
			
			preparedStatement.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void addValue(String query) {
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void updateValue(int empId,String job,int salary) {
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("UPDATE employee SET job=?,salary=? WHERE empno=?");
			
			preparedStatement.setString(1,job);
			preparedStatement.setInt(2,salary);
			preparedStatement.setInt(3,empId);
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the update query : "+rows+ " row(s) updated");
			
			preparedStatement.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void deleteValue(int empId) {
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM employee WHERE empno=?");
			preparedStatement.setInt(1,empId);
			
			int rows = preparedStatement.executeUpdate(); //run the insert query
			
			System.out.println("Executed the delete query : "+rows+ " row(s) deleted");
			
			preparedStatement.close();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void displayValues(String query) {
		try {
			Statement statement = conn.createStatement();
			
			
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				System.out.println("EmpNo : " + result.getInt(1));
				System.out.println("EmpName : " + result.getString(2));
				System.out.println("EmpJob : " + result.getString(3));
				System.out.println("EmpSalary : " + result.getInt(4));
			}
			
			result.close();
			
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


//public class SQLTest {
//
//	public static void main(String[] args) {
//		try {
//			System.out.println("Trying to connect to database....");
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			System.out.println("Database connected....");
//			
//			System.out.println("Trying to connect to the db....");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","admin");
//			System.out.println("Connected to the db....");
//			
//			
//			
//			Statement statement = conn.createStatement();
//			
//			ResultSet result = statement.executeQuery("SELECT * FROM Employee");
////			statement.executeUpdate("INSERT INTO employee (empno,empname,job,salary) VALUES (6,'Mukul','SWE',25000)");
//			
////			statement.executeUpdate("CREATE TABLE abc (id int,name varchar(20));");
//			
//			while(result.next()) {
//				System.out.println("EmpNo : " + result.getInt(1));
//				System.out.println("EmpName : " + result.getString(2));
//				System.out.println("EmpJob : " + result.getString(3));
//				System.out.println("EmpSalary : " + result.getInt(4));
//			}
//			
//			result.close();
//			statement.close();
//			conn.close();
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
