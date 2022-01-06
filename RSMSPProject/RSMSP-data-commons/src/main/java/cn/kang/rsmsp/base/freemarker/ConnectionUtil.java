package cn.kang.rsmsp.base.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 20221/6  0:27
 * @since 1.0.0
 */
public class ConnectionUtil {
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/rsmsp_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
	private static String username = "root";
	private static String password = "root";
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	static {
		try {
			Class.forName(driverName);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		Connection connection = threadLocal.get();
		if(connection ==null ){
			try {
				connection = DriverManager.getConnection(url,username,password);
				threadLocal.set(connection);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return connection;
	}
}
