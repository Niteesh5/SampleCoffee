package com.coffee.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.coffee.bean.*;

public class CoffeeDaoForView {
	public Collection<Coffee> getCoffeeView() {
		// TODO Auto-generated method stub
				Connection connection = null;
				Collection<Coffee>coffee=new ArrayList<Coffee>();
					try {
		            
					// 1. Connect
					// 1.1 Register Driver

					Class.forName("com.mysql.cj.jdbc.Driver");
					// 1.2 Connect to Database
					connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffee", "root", "Tech@511");

					// 2. Query
					PreparedStatement pstmt = 
					connection.prepareStatement("SELECT * FROM coffeeType");
				     
				      //System.out.println("entered dao file");
					  
					ResultSet rst = pstmt.executeQuery();
					while(rst.next()){
						Coffee coffee1=new Coffee();
						coffee1.setCoffeeType(rst.getString("coffeeType")); 
						coffee1.setCoffeeSize(rst.getString("coffeeSize")); 
						coffee1.setPrice(rst.getInt("price")); 
						coffee.add(coffee1);
						}
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						// 4. close the connection
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return coffee;	
			}
			
			
	public Collection<Addon> getAddonView() {
		// TODO Auto-generated method stub
				Connection connection = null;
				Collection<Addon>addon=new ArrayList<Addon>();
					try {
		            
					// 1. Connect
					// 1.1 Register Driver

					Class.forName("com.mysql.cj.jdbc.Driver");
					// 1.2 Connect to Database
					connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffee", "root", "Tech@511");

					// 2. Query
					PreparedStatement pstmt = 
					connection.prepareStatement("SELECT * FROM addonprefer");
				     
				      //System.out.println("entered dao file");
					  
					ResultSet rst = pstmt.executeQuery();
					while(rst.next()){
						Addon addon1=new Addon();
						addon1.setAddon(rst.getString("addOn"));  
						addon1.setPrice(rst.getInt("price")); 
                        addon.add(addon1);
						}
					
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						// 4. close the connection
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return addon;	
			}
			

}
