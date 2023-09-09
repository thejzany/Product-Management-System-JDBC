package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.configuration.HelperClass;
import com.jsp.dto.Product;

public class ProductDao {
	int i = 0;
	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	// update
	public Product updateProduct(Product product) {

		connection = helperClass.getConnection();
		String sql = "UPDATE product SET brand =? ,price=? WHERE pid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getBrand());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getPid());

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

		return product;
	}

	// get all
	public Product getAllProduct(Product product) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getDouble(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;

	}

	// get
	public Product getProductById(Product product) {

		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product WHERE pid = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, product.getPid());

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " " + "| ");
				System.out.print(resultSet.getString(2) + " " + "| ");
				System.out.println(resultSet.getDouble(3) + " " + "| ");
				System.out.println("===========================");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;

	}

	// delete
	public boolean deleteProductById(int pid) {
		int a = 0;
		connection = helperClass.getConnection();
		String sql = "DELETE FROM product WHERE pid=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, pid);

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
	public Product saveProduct(Product product) {
		connection = helperClass.getConnection();
		String sql = "INSERT INTO product VALUES(?,?,?)";

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, product.getPid());
			preparedStatement.setString(2, product.getBrand());
			preparedStatement.setDouble(3, product.getPrice());

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
		return product;
	}
}
