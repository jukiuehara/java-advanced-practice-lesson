package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.products;

public class ProductDao {

	private static final String SQL_SELECT_ID = "select product_id,product_name,price from products where product_id = ?";

	private Connection connection;

	public ProductDao(Connection connection) {
		this.connection = connection;
	}

	public products fintdByProductId(Integer userId) {
		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ID)) {
			stmt.setInt(1, userId);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return new products(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("price"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}
