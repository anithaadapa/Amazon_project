package com.mobiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebElement;

public class DBConnect {


public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
	
	}
	public static void DatabaseInsert(String title, String date_added, String Customer_Reviews) {
		
	
		try {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_db","root", "root");
		
		Statement stmnt = connection.createStatement();
		ResultSet result = stmnt.executeQuery("select * from mobiles");
		
		System.out.println("******Before Inertion*********");
		while (result.next()) {
			System.out.println(result.getInt("ID") + " " + result.getString("Title")+ " "+ result.getInt("price"));
		}
		
		System.out.println("******After Inertion*********");
		stmnt.executeUpdate("INSERT INTO mobiles(Title, price, date_added,Customer_Reviews) values('OnePlus Nord CE 2 5G', 24999, now(),22277)");
		stmnt.executeUpdate("INSERT INTO mobiles(Title, price, date_added,Customer_Reviews) values('OnePlus Nord 2 5G', 29999, now(),2999)");
		stmnt.executeUpdate("INSERT INTO mobiles(Title, price, date_added,Customer_Reviews) values('OnePlus Nord CE 2 5G', 23999, now(),8999)");
		result = stmnt.executeQuery("select * from mobiles");
		while (result.next()) {
			System.out.println(result.getInt("ID") + " " + result.getString("Title")+ " "+ result.getInt("price"));
			
			
		}
		
	

}catch(Exception e) {System.out.println(e);}
	}
	 
	
		



	}	




	

/*	public static String InsertQuery = "insert IGNORE INTO mobiles(Title,Price,Customer_Reviews) Values(?,?,?)";
//	public static String InsertQuery1 = "insert IGNORE INTO mobiles(Title,Price1,Customer_Reviews1) Values(?,?,?)";
//	public static String InsertQuery2 = "insert IGNORE INTO mobiles(Title,Price2,Customer_Reviews2) Values(?,?,?)";
	
	public static void DatabaseInsert(String Title, String price, String customer_Reviews ) {
		
		try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_db","root", "root");
	
				
		PreparedStatement stmt = con.prepareStatement(InsertQuery);
		
		stmt.setString(1,Title);
		 stmt.setNString(2,price);
			stmt.setNString(3,customer_Reviews);
			
		
		System.out.println("price" + price);
		
		stmt.executeUpdate();
		
			
				con.close();
	
		}catch(Exception e) {System.out.println(e);}
	
		

		}		  

}*/
	






