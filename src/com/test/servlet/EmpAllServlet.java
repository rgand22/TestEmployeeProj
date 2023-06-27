package com.test.servlet;

import java.io.IOException;

import com.test.service.EmpService;
import com.test.serviceImpl.EmpServiceImpl;
import com.util.EmpUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testClass22
 */
@WebServlet("/EmpAllServlet")
public class EmpAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmpAllServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("EmpAllServlet started::::::::");
		EmpService empService = new EmpServiceImpl();
		request.setAttribute("arrEmpAll", empService.getEmpAll());
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher(EmpUtils.emp_all_page);
		rd.include(request, response);
		System.out.println("EmpAllServlet ended::::::::");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
