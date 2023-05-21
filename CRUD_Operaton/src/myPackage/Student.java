package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public void createDatabase() {
		// There are 5 steps through which we can connect.
				/*
				 1. Load driver
				 2. Establish connection
				 3. create statement
				 4. Execute statement
				 5. close connection.
				 */
				String url="jdbc:mysql://localhost:3306/";
				String userName="root";
				String password="root";
				Connection conn;
				
				try {
					 conn= DriverManager.getConnection(url,userName,password);
					 System.out.println("Connection successfull");
					 
					 
					 Statement st= conn.createStatement();
					 String query="create database codingWallah";
					 st.execute(query);
					 System.out.println("database created");
					 conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	public void createTable() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/codingWallah";
			String userName="root";
			String password="root";
			Connection conn= DriverManager.getConnection(url, userName, password);
			
			Statement st= conn.createStatement();
			String query="create table student(rollNo int(5),sname varchar(12),email varchar(200))";
			st.execute(query);
			System.out.println("table created successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void createData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/codingWallah";
			String userName="root";
			String password="root";
			Connection conn= DriverManager.getConnection(url, userName, password);
			
			String query="INSERT INTO STUDENT VALUES(?,?,?)";

			PreparedStatement ps= conn.prepareStatement(query);
			ps.setInt(1, 2);
			ps.setString(2, "Soman");
			ps.setString(3, "soman@gmail.com");
			
			ps.executeUpdate();
//			Statement st= conn.createStatement();
//			String query="INSERT INTO STUDENT VALUES(1,'sudip','sudip@gmail.com')";
//			st.execute(query);
			System.out.println("data Inserted successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void getAllDetails() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/codingWallah";
			String userName="root";
			String password="root";
			Connection conn= DriverManager.getConnection(url, userName, password);
			
			String query="SELECT * FROM STUDENT";

			Statement st=conn.createStatement();
			ResultSet rs= st.executeQuery(query);

			while(rs.next()) {
				System.out.println("rollNo :"+rs.getInt(1));
				System.out.println("sname: "+rs.getString(2));
				System.out.println("Email is : "+ rs.getString(3));
			}
			System.out.println("data fetched successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void updateData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/codingWallah";
			String userName="root";
			String password="root";
			Connection conn= DriverManager.getConnection(url, userName, password);
			
			String query="UPDATE STUDENT set rollNo=? WHERE sname=?";

			PreparedStatement ps=conn.prepareStatement(query);
			
			ps.setInt(1, 11);
			ps.setString(2, "sudip");
			
			ps.executeUpdate();
			System.out.println("data updated successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/codingWallah";
			String userName="root";
			String password="root";
			Connection conn= DriverManager.getConnection(url, userName, password);
			
			String query="delete From STUDENT WHERE sname=?";

			PreparedStatement ps=conn.prepareStatement(query);
			
			ps.setString(1, "sudip");
			
			ps.executeUpdate();
			System.out.println("data deleted successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}
