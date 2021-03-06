package chapter27;

import java.sql.*;

public class InsertDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null;

		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("드라이버를 찾지 못했습니다.");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");

			String sqlStr = "INSERT INTO owner_info (id,nm,handphone,gender) VALUES " + "(3, '왕눈이', '000-222-4444', '남')";
			stmt = con.createStatement();

			stmt.executeUpdate(sqlStr);

			System.out.println("레코드가 추가되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
