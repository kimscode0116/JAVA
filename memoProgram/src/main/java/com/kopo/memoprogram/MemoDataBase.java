package com.kopo.memoprogram;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class MemoDataBase {

	public boolean creatdDB() {
		boolean isSuccess = false;
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE memo(idx INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, content TEXT, created TEXT, updated TEXT, id TEXT, pwd TEXT)";
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

	public boolean insertDb(Memo memodata) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String fieldString = "title, content, created, updated, id, pwd";
			String query = "INSERT INTO memo (" + fieldString + ") VALUES (?, ?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memodata.title);
			preparedStatement.setString(2, memodata.content);
			preparedStatement.setString(3, memodata.created);
			preparedStatement.setString(4, memodata.updated);
			preparedStatement.setString(5, memodata.id);
			preparedStatement.setString(6, memodata.pwd);

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

	public String selectData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM memo ;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");
				String id = resultSet.getString("id");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td class='content_sort'>" + title + "</td><td class='content_sort'>" + content + "</td><td>" + created
						+ "</td><td>" + updated + "</td><td>" + id + "</td>"
						+ "<td><a href = 'update?idx=" + idx + "'>수정</a></td>"
					+"<td><a href = 'delete?idx=" + idx + "'>삭제</a></td>"; 
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
	public Memo detailsData(int idx) {
		Memo resultData = new Memo();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());
			String query = "SELECT * FROM memo WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.title = resultSet.getString("title");
				resultData.content = resultSet.getString("content");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
				resultData.id = resultSet.getString("id");
				resultData.pwd = resultSet.getString("pwd");
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
	
	public boolean updateData(Memo memo) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());
			String query = "UPDATE memo SET title=?, content=?, created=?, updated=?, id=?, pwd=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memo.title);
			preparedStatement.setString(2, memo.content);
			preparedStatement.setString(3, memo.created);
			preparedStatement.setString(4, memo.updated);
			preparedStatement.setString(5, memo.id);
			preparedStatement.setString(6, memo.pwd);
			preparedStatement.setInt(7, memo.idx);
			int result = preparedStatement.executeUpdate();
			if (result < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			} else {
				preparedStatement.close();
				connection.close();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteData(int userIdx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String query = "DELETE FROM memo WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, userIdx);
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
