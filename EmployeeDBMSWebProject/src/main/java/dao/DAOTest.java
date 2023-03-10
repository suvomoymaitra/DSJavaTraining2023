package dao;

import java.util.List;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;

public class DAOTest {

	public static void main(String[] args) {
		
		EmployeeDAOImpl employee = new EmployeeDAOImpl();
		
		
//		//adding new employee
		employee.addEmployee(new Employee(8,"Shubham","SWE-1",50000));


		
//		//getting list of all employees
		List<Employee> allEmployees = employee.getEmployees();
		
		for(Employee i:allEmployees) {
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Emp Number : " + i.getEmployeeNumber());
			System.out.println("Emp Name : " + i.getEmployeeName());
			System.out.println("Emp Job : " + i.getEmployeeJob());
			System.out.println("Emp Salary : " + i.getEmployeeSalary());
			System.out.println("-----------------------------------------------------------------");
		}
		
//		// deleting an employee with a specific Employee Number
		employee.deleteEmployee(8);
		
//		// finding an employee with a specific employee number
		Employee emp = employee.getEmployee(7);
		if(emp!=null) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Emp Number : " + emp.getEmployeeNumber());
			System.out.println("Emp Name : " + emp.getEmployeeName());
			System.out.println("Emp Job : " + emp.getEmployeeJob());
			System.out.println("Emp Salary : " + emp.getEmployeeSalary());
			System.out.println("-----------------------------------------------------------------");
		}
		
//		//Updating the details of an employee
		employee.updateEmployee(new Employee(4,"Harsh","SDE",51000));
		
	}
}
