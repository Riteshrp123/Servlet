package com.xworkz.chair;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet1")
public class ChairServlet1 extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	
		PrintWriter writer = responce.getWriter();
		writer.print("I am taking responce from servlet2 .");
		request.getRequestDispatcher("/servlet2").include(request, responce);
	}
	
	

}
