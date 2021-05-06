package chapter27;

import java.sql.*;

public class UpdateDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			String sqlStr = "UPDATE owner_info " + "SET handphone = 'XXX-XXXX-XXXX' WHERE id=8";

			stmt.executeUpdate(sqlStr);
			System.out.println("레코드가 수정되었습니다.");
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
