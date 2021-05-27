package com.kopo.project0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class userDB<T> {

	public void createTable() {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE employee0527(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, gender TEXT, address TEXT, department TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			
			connection.close();
			// close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertData(String empName, String empGender , String empAddress, String empDepart) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());

			// use
			String fieldString = "name, gender, address, department";
			String valueString = "'" + empName + "','" + empGender + "','" + empAddress + "','"+ empDepart +"'";
			String query = "INSERT INTO employee0527 (" + fieldString + ") VALUES (" + valueString + ");";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			connection.close();
			// close
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String searchData(String inputName) {
		String resultString = "";
		
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM employee0527 WHERE name LIKE ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, inputName); 
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				String department = resultSet.getString("department");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + name + "</td><td>" + gender
						+ "</td><td>" + address + "</td><td>" + department + "</td><td>" + "<a href = 'update?idx=" + idx
						+ "'>수정하기</a></td><td>"+ "<a href = 'delete?idx=" + idx + "'>삭제하기</a></td>";
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();

			// close
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultString;
	}

	public Employee detailsData(int idx) {
		Employee resultData = new Employee();

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());

			String query = "SELECT * FROM employee0527 WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.gender = resultSet.getString("gender");
				resultData.address = resultSet.getString("address");
				resultData.department = resultSet.getString("department");
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultData;
	}

	public void updateData(int idx, String empName, String empGender, String empAddress, String empDepartment) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());

			String query = "UPDATE employee0527 SET name=?, gender=?, address=?, department=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, empName);
			preparedStatement.setString(2, empGender);
			preparedStatement.setString(3, empAddress);
			preparedStatement.setString(4, empDepartment);
			preparedStatement.setInt(5, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();

			// close
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteData(int userIdx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
					config.toProperties());

			String query = "DELETE FROM employee0527 WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, userIdx);
			int result = preparedStatement.executeUpdate();

			preparedStatement.close();

			// close
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//전체 리스트 조회부분 주석처리
//	public String selectData(String name) {
//		String resultString = "";
//
//		try {
//			// open
//			Class.forName("org.sqlite.JDBC");
//			SQLiteConfig config = new SQLiteConfig();
//			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/employee0527.db",
//					config.toProperties());
//
//			// use
//			String query = "SELECT * FROM employee0527 ;";
//			PreparedStatement preparedStatement = connection.prepareStatement(query);
////			preparedStatement.setString(1, name); //index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
//			ResultSet resultSet = preparedStatement.executeQuery();
//
//			while (resultSet.next()) {
//				int idx = resultSet.getInt("idx");
//				String name = resultSet.getString("name");
//				String gender = resultSet.getString("gender");
//				String address = resultSet.getString("address");
//				String department = resultSet.getString("department");
//				resultString = resultString + "<tr>";
//				resultString = resultString + "<td>" + idx + "</td><td>" + name + "</td><td>" + gender
//						+ "</td><td>" + address + "</td><td>" + department + "</td><td>" + "<a href = 'update?idx=" + idx
//						+ "'>수정하기</a></td><td>"+ "<a href = 'delete?idx=" + idx + "'>삭제하기</a></td>";
//				resultString = resultString + "</tr>";
//			}
//			preparedStatement.close();
//
//			// close
//			connection.close();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return resultString;
//	}
}
