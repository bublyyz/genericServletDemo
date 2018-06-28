package org.tyss.genericServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		Date d1= new Date();
		PrintWriter out= resp.getWriter();
		out.print("<html><body><h1>Aaj ki Tareek: "+d1+"</h1></body></html>");
		out.flush();
		out.close();

		
	}
	
	

}
