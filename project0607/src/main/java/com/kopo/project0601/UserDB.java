package com.kopo.project0601;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {
	public boolean creatdDB() {
		boolean isSuccess = false;
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE login0601(idx INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, pwd TEXT, name TEXT, birthday TEXT, address TEXT, created TEXT, updated TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
//			if(result==1) {
//				isSuccess = true;
//			}
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

	public boolean insertDb(People people) {

		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());

			// password hash md5, sha .... sha256
			people.pwd = this.sha256(people.pwd);

			String query2 = "SELECT * FROM login0601 WHERE id = ?";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setString(1, people.id);
			ResultSet resultSet = preparedStatement2.executeQuery();
			if (resultSet.next()) {
				// next가 된다는건 조회가 됐다는것 => 중복 데이터가 존재한는 것
				preparedStatement2.close();
				connection.close();
				return false;
			}
			preparedStatement2.close();

			String fieldString = "id, pwd, name, birthday, address, created, updated";
			String query = "INSERT INTO login0601 (" + fieldString + ") VALUES (?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, people.id);
			preparedStatement.setString(2, people.pwd);
			preparedStatement.setString(3, people.name);
			preparedStatement.setString(4, people.birthday);
			preparedStatement.setString(5, people.address);
			preparedStatement.setString(6, people.created);
			preparedStatement.setString(7, people.updated);
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
	
	public boolean loginDB(People people) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());

//			people.pwd = this.sha256(people.pwd);

			String query2 = "SELECT * FROM login0601 WHERE id = ? AND pwd = ?";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setString(1, people.id);
			preparedStatement2.setString(2, people.pwd);

			ResultSet resultSet = preparedStatement2.executeQuery();
			if (resultSet.next()) {
				// next가 된다는건 조회가 됐다는것 => 중복 데이터가 존재한는 것
				// 여기서는 있어야 성공임
				System.out.println(111);
				preparedStatement2.close();
				connection.close();
				return true;
			} else {
				preparedStatement2.close();
				connection.close();
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// sha256 비밀번호 암호화 해시기법(단방향 암호화)
	public String sha256(String msg) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(msg.getBytes());

			StringBuilder builder = new StringBuilder();
			for (byte b : md.digest()) {
				builder.append(String.format("%02x", b));
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return " ";
		}
	}

	public String selectData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM login0601 ;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String pwd = resultSet.getString("pwd");
				String name = resultSet.getString("name");
				String birthday = resultSet.getString("birthday");
				String address = resultSet.getString("address");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + id + "</td><td>" + pwd + "</td><td>" + name
						+ "</td><td>" + birthday + "</td><td>" + address + "</td><td>" + created + "</td><td>" + updated
						+ "</td><td><a href = 'update?idx=" + idx + "'>수정하기</a></td>";
//					+"<td><a href = 'delete?idx=" + idx + "'>삭제하기</a></td>"; 
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

	public People detailsData(int idx) {
		People resultData = new People();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());
			String query = "SELECT * FROM login0601 WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.id = resultSet.getString("id");
				resultData.pwd = resultSet.getString("pwd");
				resultData.name = resultSet.getString("name");
				resultData.birthday = resultSet.getString("birthday");
				resultData.address = resultSet.getString("address");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
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

	public boolean updateData(People people) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/kopoData.db",
					config.toProperties());
			String query = "UPDATE login0601 SET id=?, pwd=?, name=?, birthday=?, address=?, updated=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, people.id);
			preparedStatement.setString(2, people.pwd);
			preparedStatement.setString(3, people.name);
			preparedStatement.setString(4, people.birthday);
			preparedStatement.setString(5, people.address);
			preparedStatement.setString(6, people.updated);
			preparedStatement.setInt(7, people.idx);
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
}
