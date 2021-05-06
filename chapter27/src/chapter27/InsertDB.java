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
			System.err.print("����̹��� ã�� ���߽��ϴ�.");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");

			String sqlStr = "INSERT INTO owner_info (id,nm,handphone,gender) VALUES " + "(3, '�մ���', '000-222-4444', '��')";
			stmt = con.createStatement();

			stmt.executeUpdate(sqlStr);

			System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
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