package com.canddella.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.canddella.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer searchCustomer(String customerCode) {
		Customer customer=null;
		try
		{
			
	
		String connectionString="jdbc:mysql://localhost:3306/cejp_dao";
		String userName="root";
		String password="password@123";
		Connection connection = DriverManager.getConnection(connectionString,userName,password);
		PreparedStatement statement = connection.prepareStatement("select * from customer where customercode=?");
		statement.setString(1, customerCode);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next())
		{
			customer=new Customer(resultSet.getString(1),resultSet.getString(2));
			
		}
		connection.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return customer;
	}

}
