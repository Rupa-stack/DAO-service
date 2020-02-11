package com.cts.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionHandler {

	public static Connection getConnection()
	{
		String driver=null;
		String url=null;
		String pwd=null;
		String user=null;
		Connection con=null;
		try{
		FileReader fr=new FileReader("src/connection.properties");
		Properties pro=new Properties();
		pro.load(fr);
		
		
		driver=pro.getProperty("driver");
		System.out.println(driver);
		url=pro.getProperty("url");
		pwd=pro.getProperty("password");
		user=pro.getProperty("username");
		Class.forName(driver);
		con=DriverManager.getConnection(url,user,pwd);
		}catch(Exception e){}
		return con;
	}
	public static void main(String a[])
	{
		System.out.println();
	}
}
