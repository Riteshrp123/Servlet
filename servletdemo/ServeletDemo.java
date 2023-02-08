package com.xworkz.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value= "/form")

public class ServeletDemo extends HttpServlet{
 
	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	responce.setContentType("text/html");
	
	PrintWriter writer = responce.getWriter();
	
	writer.print("<html><body>");
	writer.print("<form action ='form' method='post'>");
	writer.println("Name :<input type ='text' name ='name'>");
	writer.println("Email :<input type = 'text' name ='email'>");
	writer.print("<button type='submit' name ='submit'>submit</button></form>");

}

public void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {

	String name = request.getParameter("name");
	String email = request.getParameter("email");
	responce.setContentType("text/html");
	PrintWriter writer = responce.getWriter();
	writer.print("<h1>submited</h1>");
	writer.println("name : " + name);
	writer.println("email : " + email);
	System.out.println("Name :" + name);
	System.out.println("Email :" + email);

}
}