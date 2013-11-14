package Chapter34JavaDatabaseProgramming;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestCallableStatement {
  /** Creates new form TestTableEditor */
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection(
      "jdbc:mysql://localhost/manageuser", "root", "root");
//    Class.forName("oracle.jdbc.driver.OracleDriver");
//    Connection connection = DriverManager.getConnection(
//      "jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
//      "scott", "tiger");

    // Create a callable statement
    CallableStatement callableStatement = connection.prepareCall(
      "{? = call userFound(?, ?)}");

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter user's login name: ");
    String loginName = input.nextLine();
    System.out.print("Enter user's email: ");
    String email = input.nextLine();

    callableStatement.setString(2, loginName);
    callableStatement.setString(3, email);
    callableStatement.registerOutParameter(1, Types.INTEGER);
    callableStatement.execute();

    if (callableStatement.getInt(1) >= 1)
      System.out.println(loginName + " with email: " + email +
        " is in the database");
    else
      System.out.println(loginName + " with email:  " + email +
        " is not in the database");
  }
}

