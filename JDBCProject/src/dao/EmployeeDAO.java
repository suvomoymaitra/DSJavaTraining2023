package dao;

import java.util.List;

public interface EmployeeDAO {
	void addEmployee(Employee e);
	List<Employee> getEmployees();
	Employee getEmployee(int empno);
	void updateEmployee(Employee e);
	void deleteEmployee(int empno);
}
