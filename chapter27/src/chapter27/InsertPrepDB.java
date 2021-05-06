package chapter27;

import java.sql.*;

public class InsertPrepDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("����̹��� ã�� ���߽��ϴ�.");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			String sqlStr = "INSERT INTO owner_info(id,nm,handphone,gender) VALUES " + "(?,?,?,?)";
			pstmt = con.prepareStatement(sqlStr);
			
			{
			pstmt.setInt(1, 9);
			pstmt.setString(2, "��˾�");
			pstmt.setString(3, "123-9999-9999");
			pstmt.setString(4, "��");

			pstmt.executeUpdate();
			}

			System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

	}
}