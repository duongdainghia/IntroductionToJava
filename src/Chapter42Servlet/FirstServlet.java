package Chapter42Servlet;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 
 * @author Duong Dai Nghia, Nov 7, 2013
 * duongdainghiavn@gmail.com
 */

public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, java.io.IOException {
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello, Java Servlets");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
