package com.ds.layer3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ds.layer2.Employee;
import com.ds.layer2.EmployeeDAO;

public class EmployeeDAOImplFile implements EmployeeDAO {

	String location;
	String name;
	FileInputStream fin;
	FileOutputStream fout;

	public EmployeeDAOImplFile(String location, String name) {
		// TODO Auto-generated constructor stub
		this.location = location;
		this.name = name;
		
	}
	
	public void writeUpdatedList(ArrayList<Employee> updatedEmps) {
		try {
			fout = new FileOutputStream(this.location);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			Iterator<Employee> itrUpdatedEmps = updatedEmps.iterator();
			while(itrUpdatedEmps.hasNext()) {
				oos.writeObject(itrUpdatedEmps.next());
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		ArrayList<Employee> allEmps = new ArrayList<Employee>();
		boolean flag = true;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.location));
			while (flag) {
				Employee obj = null;
				try {
					obj = (Employee) ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				if (obj != null)
					allEmps.add((Employee) obj);
				else
					flag = false;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.closeFile();
		
		return allEmps;
	}
	
	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		
		Employee result = null;
		ArrayList<Employee> allEmps = (ArrayList<Employee>) getEmployees();
		
		Iterator<Employee> itr = allEmps.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().getEmployeeNumber()==empno) {
				result = itr.next();
				break;
			}
		}
		return result;
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		ArrayList<Employee> allEmps = (ArrayList<Employee>) getEmployees();
		
		Iterator<Employee> itr = allEmps.iterator();
		
		boolean flag = false;
		
		while(itr.hasNext()) {
			if(itr.next().getEmployeeNumber()==e.getEmployeeNumber()) {
				flag = true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("Primary key violation...");
			return;
		}
		
		allEmps.add(e);
		this.writeUpdatedList(allEmps);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> allEmps = (ArrayList<Employee>) getEmployees();
		ArrayList<Employee>updatedEmps = new ArrayList<Employee>();
		
		Iterator<Employee> itr = allEmps.iterator();
		
		while(itr.hasNext()) {
			Employee temp = itr.next();
			if(itr.next().getEmployeeNumber()==e.getEmployeeNumber()) {
				temp.setEmployeeName(itr.next().getEmployeeName());
				temp.setEmployeeJob(itr.next().getEmployeeJob());
				temp.setEmployeeSalary(itr.next().getEmployeeSalary());
				
			}
			updatedEmps.add(temp);
		}
		
		this.writeUpdatedList(updatedEmps);
		
		this.closeFile();
		

	}

	@Override
	public void deleteEmployee(int empno) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> allEmps = (ArrayList<Employee>) getEmployees();
		ArrayList<Employee>updatedEmps = new ArrayList<Employee>();
		
		
		Iterator<Employee> itr = allEmps.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().getEmployeeNumber()==empno) {
				continue;
			}
			else {
				updatedEmps.add(itr.next());
			}
		}
		
		this.writeUpdatedList(updatedEmps);
		
		this.closeFile();
		
		

	}
	
	public void closeFile() {
		System.out.println("\nTrying to close the file " + name);
		try {
			fin.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Closed the file " + name + " successfully");
	}

}
