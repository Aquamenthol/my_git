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
			System.err.print("드라이버를 찾지 못했습니다.");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			String sqlStr = "INSERT INTO owner_info(id,nm,handphone,gender) VALUES " + "(?,?,?,?)";
			pstmt = con.prepareStatement(sqlStr);
			
			{
			pstmt.setInt(1, 9);
			pstmt.setString(2, "길똥아");
			pstmt.setString(3, "123-9999-9999");
			pstmt.setString(4, "남");

			pstmt.executeUpdate();
			}

			System.out.println("레코드가 추가되었습니다.");
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
