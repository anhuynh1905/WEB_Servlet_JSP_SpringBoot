package LoginForm.Configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

public class employeesDBConnect {
	private String hostName = "localhost:3306";
	private String dbName = "employees";
	private String username = "root";
	private String password = "Anan@123";

	private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

	public Connection connect() {
		// Tạo đối tượng Connection
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(connectionURL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

//	public static void main(String[] args) {
//		employeesDBConnect a = new employeesDBConnect();
//		Connection conn = a.connect();
//		String querry = "SELECT * FROM login";
//		Statement stm = null;
//		try {
//			stm = conn.createStatement();
//			ResultSet rs = stm.executeQuery(querry);
//			ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
//
//			int collumn = rsmd.getColumnCount();
//			while (rs.next()) {
//				for (int i = 1; i <= collumn; ++i) {
//					if (i > 1)
//						System.out.print(",  ");
//					String columnValue = rs.getString(i);
//					System.out.print(columnValue + ": " + rsmd.getColumnName(i) + ".");
//				}
//				System.out.println("");
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}
