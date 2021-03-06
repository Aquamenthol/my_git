package chapter27;

import java.sql.*;

public class PoketmonSelectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection DbCon = null;
		Statement stmt = null;
		ResultSet rs = null;
		;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException : ");
			System.err.println(e.getMessage());
		}

		try {
			DbCon = DriverManager.getConnection(url, "javauser", "1234");
			stmt = DbCon.createStatement();
			String sqlStr = "SELECT idx,type,name,resume FROM poketmon";
			rs = stmt.executeQuery(sqlStr);

			while (rs.next()) {
				String idx = rs.getString(1);
				String type = rs.getString("type");
				String name = rs.getString("name");
				String resume = rs.getString("resume");
				System.out.println(idx + "| " + type + "\t " + name + "\t " + resume);
			}
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
				DbCon.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

	}

}
