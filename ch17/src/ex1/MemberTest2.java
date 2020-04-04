package ex1;

import java.sql.*;

public class MemberTest2 {
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

			System.out.println("Oracle ����̹� ���� ����");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("connection ���� ����");
			
			PreparedStatement pstmt=conn.prepareStatement("insert into member values(?,?,?,?,?)");
			pstmt.setString(1, "0004");
			pstmt.setString(2, "������");
			pstmt.setInt(3, 178);
			pstmt.setInt(4, 67);
			pstmt.setInt(5, 23);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "0005");
			pstmt.setString(2, "�Ӳ���");
			pstmt.setInt(3, 178);
			pstmt.setInt(4, 67);
			pstmt.setInt(5, 23);
			pstmt.executeUpdate();
			
			
			String query="select *from member where name=?";
			
			
			//String query="select * from member";
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, "ȫ�浿");
			System.out.println(query);
			rs= pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("���̵��>>" + rs.getString("id"));
				System.out.println("�̸���>>" + rs.getString("name"));
				System.out.println("Ű��>>" + rs.getInt("height"));
				System.out.println("ü����>>" + rs.getInt("weight"));
				System.out.println("���̴�>>" + rs.getInt("age"));
				System.out.println();
			}
			rs.close();
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
