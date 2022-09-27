package com.tharindutech.pos.dao;

import com.tharindutech.pos.db.DBConnection;
import com.tharindutech.pos.entity.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseAccessCode {

    public boolean saveCustomer(Customer c) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO Customer VALUES(?,?,?,?)";
        PreparedStatement statement = DBConnection.getInstance().getConnection().prepareStatement(sql);
        statement.setString(1, c.getId());
        statement.setString(2, c.getName());
        statement.setString(3, c.getAddress());
        statement.setDouble(4, c.getSalary());
         return statement.executeUpdate()>0;
    }


}
