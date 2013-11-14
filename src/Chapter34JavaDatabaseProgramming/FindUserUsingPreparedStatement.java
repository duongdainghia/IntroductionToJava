package Chapter34JavaDatabaseProgramming;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class FindUserUsingPreparedStatement extends JApplet {
  private JTextField jtfLoginName = new JTextField(9);  
  private JButton jbtShowUser = new JButton("Show Users");

  // PreparedStatement for executing queries
  private PreparedStatement preparedStatement;

  /** Initialize the applet */
  public void init() {
    // Initialize database connection and create a Statement object
    initializeDB();

    jbtShowUser.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jbtShowUser_actionPerformed(e);
      }
    });

    JPanel jPanel1 = new JPanel();
    jPanel1.add(new JLabel("Login name"));
    jPanel1.add(jtfLoginName);       
    jPanel1.add(jbtShowUser);

    add(jPanel1, BorderLayout.NORTH);
  }

  private void initializeDB() {
    try {
      // Load the JDBC driver
      Class.forName("com.mysql.jdbc.Driver");
//      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver loaded");

      // Establish a connection
      Connection connection = DriverManager.getConnection
        ("jdbc:mysql://localhost/manageuser", "root", "root");
//    ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
//     "scott", "tiger");
      System.out.println("Database connected");

      String queryString = "select login_name, full_name, " +
  			"email from tbl_user " + "where tbl_user.login_name = ?";

      // Create a statement
      preparedStatement = connection.prepareStatement(queryString);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void jbtShowUser_actionPerformed(ActionEvent e) {
    String loginName = jtfLoginName.getText();    
    try {
      preparedStatement.setString(1, loginName);      
      ResultSet rset = preparedStatement.executeQuery();

      if (rset.next()) {
        String loginId = rset.getString(1);
        String fullName = rset.getString(2);
        String email = rset.getString(3);

        // Display result in a dialog box
        JOptionPane.showMessageDialog(null, loginId + " " + fullName + " " + email);
      }
      else {
        // Display result in a dialog box
        JOptionPane.showMessageDialog(null, "Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  /** Main method */
  public static void main(String[] args) {
    FindUserUsingPreparedStatement applet = new
      FindUserUsingPreparedStatement();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Find Users");
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
