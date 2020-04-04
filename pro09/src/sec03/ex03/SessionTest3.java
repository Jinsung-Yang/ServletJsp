package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest3
 */
@WebServlet("/sess3")
public class SessionTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		HttpSession session= request.getSession();
		out.print("세션아이디"+ session.getId()+"<br>");
		out.print("최초세션 생성시각:"+ new Date(session.getCreationTime()));
		out.print("최근 세션 접근시각:"+new Date(session.getLastAccessedTime()));
		out.print("세션유효시간:"+session.getMaxInactiveInterval()+"<br>");
		
		if(session.isNew()) {
			out.print("새 세션이 만들어졌습니다."); 
	}
		
		session.invalidate();
	
	}

}
