package sec06.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParamServlet
 */
@WebServlet(
		urlPatterns = { 
				"/sinit", 
				"/sinit2"
		}, 
		initParams = { 
				@WebInitParam(name = "email", value = "admin@test.com"), 
				@WebInitParam(name = "tel", value = "010-111-2222")
		})
public class initParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out= response.getWriter();
		
		String email=getInitParameter("email");
		String tel= getInitParameter("tel");
		
		
		  out.print("<html><body>");
	      out.print("<table border=1 cellspacing=0>");
	      out.print("<tr><td >email:</td>" + email + "</td></tr>");
	      out.print("<tr><td>휴대전화번호:</td><td>" + tel + "</td></tr>");
	      out.print("</table></body></html>");	
	
	}

}