package chpter26;

import java.sql.*;

public class DriverTestMySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;

		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=euckr","javauser","1234");
			System.out.println("单捞磐 海捞胶 立加 己傍");
		} catch (SQLException ex) {
			// TODO: handle exception
			System.out.println("SQLException : ");
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		}

	}
}
