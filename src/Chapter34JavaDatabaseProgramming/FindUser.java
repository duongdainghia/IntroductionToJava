package Chapter34JavaDatabaseProgramming;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class FindUser extends JApplet {
	private JTextField jtfLoginName = new JTextField(9);	
	private JButton jbtShowUser = new JButton("Show User");
	
	// Statement for executing queries
	private Statement stmt;
	
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
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			
			// Establish a connection
			Connection connection = DriverManager.getConnection
			("jdbc:mysql://localhost/manageuser", "root", "root");
			// ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl”,
			// "scott", "tiger");
			System.out.println("Database connected");
			
			// Create a statement
			stmt = connection.createStatement();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void jbtShowUser_actionPerformed(ActionEvent e) {
		String loginName = jtfLoginName.getText();		
		try {
			String queryString = "select login_name, full_name, " +
			"email from tbl_user " + "where tbl_user.login_name = '" + loginName + "'";
			
			ResultSet rset = stmt.executeQuery(queryString);
			
			if(rset.next()) {
				String login_name = rset.getString(1);
				String full_name = rset.getString(2);
				String email = rset.getString(3);				
				
				// Display result in a dialog box
				JOptionPane.showMessageDialog(null, login_name + " " + full_name + " " + email);
			} else {
				// Display result in a dialog box
				JOptionPane.showMessageDialog(null, "Not found");
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}