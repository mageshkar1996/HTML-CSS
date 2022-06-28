package com.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/osi")
public class osi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(request.getRemoteAddr()).append(request.getScheme()).append("  ").append(request.getServerName()).append("  ");
		if (request.getParameter("osi_layer").equalsIgnoreCase("datalink"))
				response.getWriter().print("data is transmitted as frames");
		else if(request.getParameter("osi_layer").equalsIgnoreCase("network"))
				response.getWriter().print("data is transmitted as packets");
		else
			response.getWriter().print("you are not getting proper result");			
	}

}
