package com.linking;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.linking.Kitchen;

public class NoodlesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
throws ServletException, IOException
	{
		PrintWriter writer = response.getWriter();
		String vegetable = request.getParameter("vegetable");
		
		String noodles = Kitchen.makeNoodles(vegetable);
		writer.println(noodles);
	}
}
