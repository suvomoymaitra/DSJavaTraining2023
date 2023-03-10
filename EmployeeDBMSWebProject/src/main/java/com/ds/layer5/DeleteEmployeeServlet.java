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
@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("string value is : "+request.getParameter("empno"));
		
		int empno = Integer.parseInt(request.getParameter("empno"));
		System.out.println("emp number to delete is :  "+empno);
		employeeService.deleteEmployeeService(empno);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html"); // MIME
		pw.println("<h2> employee deleted successfully....</h2>");
		pw.println("<a href='emps'>Back to Home</a>");
		System.out.println("employee deleted from the list....");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
