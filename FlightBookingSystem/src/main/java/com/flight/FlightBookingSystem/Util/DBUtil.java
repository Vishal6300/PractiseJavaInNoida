package com.flight.FlightBookingSystem.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// This class is used to connect to the SQL Database and the database deatils is stored in dbdetails.properties.
public class DBUtil {

	private static String url;
	private static String driverName;
	private static String username;
	private static String password;

	static {

		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");

		url = rb.getString("db.url");
		driverName = rb.getString("db.drivername");
		username = rb.getString("db.username");
		password = rb.getString("db.password");

	}

	public static Connection provideConnection() {
		Connection conn = null;

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}

