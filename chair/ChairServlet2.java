package com.xworkz.chair;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet2")
public class ChairServlet2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException{
		
		responce.setContentType("text/html");
		PrintWriter writer = responce.getWriter();
		writer.print("  Chair made in wood .");
		
		writer.print("  This is servlet2");
	}

}
