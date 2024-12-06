package utility;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	
	private static final String url="jdbc:mysql://localhost:3306/studyplanner";
	private static final String user_name="root";
	private static final String password="root";
	
	//Connection method
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user_name, password);
}
