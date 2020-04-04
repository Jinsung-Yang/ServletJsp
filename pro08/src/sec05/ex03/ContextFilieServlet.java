package sec05.ex03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.pipe.NextAction;

/**
 * Servlet implementation class ContextFilieServlet
 */
@WebServlet("/cfile")
public class ContextFilieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextFilieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out= response.getWriter();
		 ServletContext context= getServletContext();
		 
		 InputStream is= context.getResourceAsStream("/WEB-INF/bin/init.txt");
		 BufferedReader buffer= new BufferedReader(new InputStreamReader(is));
		 
		 
		 String menu= null;
		 String menu_member= null;
		 String menu_order= null;
		 String menu_goods= null;
		 
		 while((menu= buffer.readLine())!= null) {
			 
			 StringTokenizer tokens = new StringTokenizer(menu,",");
			 
			 menu_member= tokens.nextToken();
			 menu_order= tokens.nextToken();
			 menu_goods= tokens.nextToken();
		 }
		 
		 out.print("<html><body>");
	      out.print("<table border=1 cellspacing=0><tr>메뉴 이름</tr>");
	      out.print("<tr><td>" + menu_member + "</td></tr>");
	      out.print("<tr><td>" + menu_order + "</td></tr>");
	      out.print("<tr><td>" + menu_goods + "</td></tr>");
	      out.print("</tr></table></body></html>");	
	      out.close();
	
	}

}
