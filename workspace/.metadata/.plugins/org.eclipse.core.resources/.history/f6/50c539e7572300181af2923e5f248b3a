package com.internousdev.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector{
	private static String driverName = "com.mysql.jbdc.Driver";
	private static String url = "jabc:mysql://locallhost//loginbd";

	private static String user = "root";
	private static String password="mysql";

	public Connection getConnection(){
		Connection con = null;

		try{
			class.forName(driverName);
			con=(connection)DriverManager.getCovvection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		retrn con;
	}
}