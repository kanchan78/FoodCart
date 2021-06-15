package com.selenium.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class FoodCartModel {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException{
		ArrayList<Food> foodList = new ArrayList<>();
		String url ="jdbc:mysql://localhost:3306/FoodCart";
		String username = "root";
		String password = "";
		//1)Load mysql connector jar
		Class.forName("com.mysql.jdbc.Driver");
		//2)get the connection
		Connection con = DriverManager.getConnection(url,username,password);
		//3)create  a statement
		Statement stmt = (Statement) con.createStatement();
		//4)execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from Food");
		while (rs.next()) {
	    int id = rs.getInt(1);
	    String item = rs.getString(2);
	    Float price = rs.getFloat(3);
	    Food f = new Food(id, item, price);
	    foodList.add(f);
			
		}
		
		return foodList;
	}
}
