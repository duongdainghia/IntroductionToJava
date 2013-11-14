package Chapter34JavaDatabaseProgramming;
import java.sql.*;

public class SimpleJdbc {
	public static void main(String[] arg) 
		throws SQLException, ClassNotFoundException {
		// load driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		// establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/manageuser", "root", "root");
		System.out.println("Database connected");
		// create statement
		Statement statement = connection.createStatement();
		// execute statement
		ResultSet resultSet = statement.executeQuery
				("select login_name, full_name, email from tbl_user where login_name like 'n%'");
		// process result set
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
		}
		//close connection
		connection.close();
	}
}
