package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class LoginImpl implements HttpSessionBindingListener {
	String user_id;
	String user_pw;
	static int total_user = 0;

	public LoginImpl() {
	}

	LoginImpl(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	
	  public void valueBound(HttpSessionBindingEvent arg0) {
	  System.out.println("사용자  접속"); ++total_user; }
	  
	  public void valueUnbound(HttpSessionBindingEvent arg0) {
	  System.out.println("사용자 접속 해제"); --total_user; }
	  
	 
}
