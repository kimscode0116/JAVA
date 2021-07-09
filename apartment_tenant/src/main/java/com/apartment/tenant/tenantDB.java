package com.apartment.tenant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

import com.apartment.tenant.Tenant;

public class tenantDB {

	public boolean creatdDB() {
		boolean isSuccess = false;
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE tenant(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, age NUMBER, gender TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);

			statement.close();
			connection.close();

			// close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean insertDb(Tenant tenantData) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String fieldString = "name, age, gender";
			String query = "INSERT INTO tenant (" + fieldString + ") VALUES (?, ?, ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, tenantData.name);
			preparedStatement.setInt(2, tenantData.age);
			preparedStatement.setString(3, tenantData.gender);

			int finalResult = preparedStatement.executeUpdate();

			if (finalResult < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			}
			preparedStatement.close();
			connection.close();
			return true;
			// close
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
