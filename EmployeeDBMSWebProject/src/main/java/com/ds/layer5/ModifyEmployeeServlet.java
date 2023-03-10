package com.ds.layer5;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

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
@WebServlet("/modifyEmployee")
public class ModifyEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(true);
		response.setContentType("text/html"); // MIME

		try
		{
		
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		String empname =request.getParameter("empname");
		String empjob = request.getParameter("empjob");
		
		int empsal = Integer.parseInt(request.getParameter("empsal"));
		
		Employee modifiedEmp = new Employee(empno,empname,empjob,empsal);
		System.out.println("MODIFIED : "+modifiedEmp);
		
		System.out.println("emp number to modify is :  "+modifiedEmp);
		
		employeeService.updateEmployeeService(modifiedEmp);

		pw.println("<h2> employee modified successfully....</h2>");
		pw.println("<a href='emps'>Back to Home</a>");
		System.out.println("employee modified to the list....");
		}
		catch(Exception e) {
			System.out.println("Invalid value...."+e);
			pw.println("<h3>Some exception : "+e.getMessage()+"</h3>");
			pw.println("<a href='emps'>Back to Home</a>");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
