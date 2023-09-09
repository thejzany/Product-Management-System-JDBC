package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.configuration.HelperClass;
import com.jsp.dto.Customer;

public class CustomerDao {
	int i = 0;
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// update
	public Customer updateCustomer(Customer customer) {

		connection = helperClass.getConnection();
		String sql = "UPDATE customer SET cname =?  ,cno=? WHERE cid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.getCname());
			preparedStatement.setString(2, customer.getCno());
			preparedStatement.setInt(3, customer.getCid());

			int a = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return customer;
	}

	// get all
	public Customer getAllCustomer(Customer customer) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM customer";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getString(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;

	}

	// get
	public Customer getCustomerById(Customer customer) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM customer WHERE cid = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, customer.getCid());

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getString(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;

	}

	// delete
	public boolean deleteCustomerById(int cid) {
		int a = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM customer WHERE cid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, cid);

			a = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (a > 0) {
			return true;
		} else {
			return false;
		}
	}

	// save
	public Customer saveCustomer(Customer customer) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO customer VALUES(?,?,?)";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, customer.getCid());
			preparedStatement.setString(2, customer.getCname());
			preparedStatement.setString(3, customer.getCno());

			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return customer;
	}
}
