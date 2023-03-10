package com.ds.layer5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ds.layer2.Employee;
import com.ds.layer3.EmployeeDAOImpl;
import com.ds.layer4.EmployeeServiceImpl;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String empname =request.getParameter("empname");
		String empjob = request.getParameter("empjob");
		int empsal = Integer.parseInt(request.getParameter("empsal"));
		
		Employee tempEmp = new Employee(empno,empname,empjob,empsal);
		
		employeeService.addEmployeeService(tempEmp);
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html"); // MIME
		pw.println("<h2> employee added successfully....</h2>");
		pw.println("<a href='http://localhost:8080/EmployeeDBMSWebProject/emps'>Back to Home</a>");
		System.out.println("employee added to the list....");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
