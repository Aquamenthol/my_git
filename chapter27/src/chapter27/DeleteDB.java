package chapter27;

import java.sql.*;

public class DeleteDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection DbCon = null;
		Statement stmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException : ");
			System.err.println(e.getMessage());
		}

		try {
			DbCon = DriverManager.getConnection(url, "javauser", "1234");
			stmt = DbCon.createStatement();
			String sqlStr = "DELETE FROM owner_info WHERE id=8";
			stmt.executeUpdate(sqlStr);

			System.out.println("레코드를 삭제했습니다.");
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {

			try {
				stmt.close();
				DbCon.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}