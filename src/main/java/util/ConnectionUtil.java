package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public final static String driverClass = "com.mysql.cj.jdbc.Driver";
	public final static String url = "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true&allowPublicKeyRetrieval=true&allowPublicKeyRetrieval=true";
	public final static String username = "root";
	public final static String password = "root";
	//作用域 ： 单线程
	/**
	 * 不采用单例模式
	 */
	//public static Connection conn = null;
	static {
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException{
		//if(conn == null){
		Connection	conn = DriverManager.getConnection(url, username, password);
		//}
		return conn;
	}
}
