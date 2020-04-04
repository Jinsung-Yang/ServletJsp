package ex1;

import java.sql.*;

public class MemberTest {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";

	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;

		try {

			Class.forName(driver);

			System.out.println("Oracle 드라이버 연결 성공");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("connection 생성 성공");
			
		
			

			stmt = conn.createStatement();
			System.out.println("statement 생성 성공");

			String query = "insert into Member values('0004','차범금',185,85,23)";
			System.out.println(query);

			stmt.executeUpdate(query);
			String query2 = "select * from member";
			System.out.println(query2);
			rs = stmt.executeQuery(query2);

			while (rs.next()) {
				System.out.println("아이디는>>" + rs.getString("id"));
				System.out.println("이름은>>" + rs.getString("name"));
				System.out.println("키는>>" + rs.getInt("height"));
				System.out.println("체중은>>" + rs.getInt("weight"));
				System.out.println("나이는>>" + rs.getInt("age"));
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
