package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cts.model.Customer;
import com.cts.util.ConnectionHandler;

public class CustomerDAOMySQLImpl implements CustomerDAO {
    static final String insertQuery="insert into customer values(?,?)";
	@Override
	public int insertCustomer(Customer c) {
		try{
		Connection con=ConnectionHandler.getConnection();
		PreparedStatement pst=con.prepareStatement(insertQuery); 
		pst.setInt(1, c.getCid());
		pst.setString(2,c.getCname());
		pst.executeUpdate();
		}catch(Exception e){}
		return 1;
	}

	
}
