package com.coffee.persistance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.coffee.bean.*;

public class CoffeeDao {
	
	   int price;
	   int offPercentage;
			public int getCoffeePrice(String coffeeType,String coffeeSize) {
		// TODO Auto-generated method stub
				Connection connection = null;
					try {
		            
					// 1. Connect
					// 1.1 Register Driver

					Class.forName("com.mysql.cj.jdbc.Driver");
					// 1.2 Connect to Database
					connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffee", "root", "Tech@511");

					// 2. Query
					PreparedStatement pstmt = 
					connection.prepareStatement("SELECT price FROM coffeetype where coffeeType=? and coffeeSize=?");
				     
					  pstmt.setString(1,coffeeType);
				      pstmt.setString(2,coffeeSize);
				      
				      ResultSet resultSet = pstmt.executeQuery();
					while(resultSet.next()){
						   price = resultSet.getInt(1);
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
					return price;
			}
			
			public int getAddOnPrice(String addOn) {
				// TODO Auto-generated method stub
						Connection connection = null;
							try {
				            
							// 1. Connect
							// 1.1 Register Driver

							Class.forName("com.mysql.cj.jdbc.Driver");
							// 1.2 Connect to Database
							connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffee", "root", "Tech@511");

							// 2. Query
							PreparedStatement pstmt = 
							connection.prepareStatement("SELECT price FROM addonprefer where addOn=?");
						     
							  pstmt.setString(1,addOn);
						      
						      
							ResultSet resultSet = pstmt.executeQuery();
							if(resultSet.next()){
								   price = resultSet.getInt(1);
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
							return price;
					}
					
		public int getVoucher(String voucherName) {
				
				Connection connection = null;
				try {
	            
				// 1. Connect
				// 1.1 Register Driver

				Class.forName("com.mysql.cj.jdbc.Driver");
				// 1.2 Connect to Database
				connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coffee", "root", "Tech@511");

				// 2. Query
				PreparedStatement pstmt = 
				connection.prepareStatement("SELECT offPercentage FROM voucher where VoucherName=?");
			     
			        pstmt.setString(1,voucherName);
			      	ResultSet resultSet = pstmt.executeQuery();
				if(resultSet.next()){
					   offPercentage = resultSet.getInt(1);
					}
				//price=resultSet.getInt("offPercentage");
				System.out.println("Discount % is "+offPercentage);
				
				
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
				return offPercentage;

		}
		

}
