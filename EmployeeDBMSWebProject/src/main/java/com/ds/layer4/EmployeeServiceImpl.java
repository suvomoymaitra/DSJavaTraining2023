package com.ds.layer4;

import java.util.List;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAOImpl empDao = new EmployeeDAOImpl();

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployeeService(Employee e) {
		// TODO Auto-generated method stub
		empDao.addEmployee(e);

	}

	@Override
	public List<Employee> getEmployeeService() {
		// TODO Auto-generated method stub
		return empDao.getEmployees();
	}

	@Override
	public Employee getEmployeeService(int empno) {
		// TODO Auto-generated method stub
		return empDao.getEmployee(empno);
	}

	@Override
	public void updateEmployeeService(Employee e) {
		// TODO Auto-generated method stub
		empDao.updateEmployee(e);
	}

	@Override
	public void deleteEmployeeService(int empno) {
		// TODO Auto-generated method stub
		empDao.deleteEmployee(empno);

	}

}
