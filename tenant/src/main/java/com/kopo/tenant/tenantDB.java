package com.kopo.tenant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

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
			String query = "CREATE TABLE tenant(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, age NUMBER, gender TEXT, aptIdx TEXT)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			
			String query_apt = "CREATE TABLE apt(idx INTEGER PRIMARY KEY AUTOINCREMENT, aptName TEXT)";
			Statement statement2 = connection.createStatement();
			int result2 = statement2.executeUpdate(query_apt);

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
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
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
	
	public String selectData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM tenant;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + name
						+ "</td><td>" + age + "</td><td>" + gender + "</td>"+
						"<td><a href = 'update?idx=" + idx + "'>수정</a></td>"+
						"<td><a href = 'delete?idx=" + idx + "'>삭제</a></td>";
				resultString = resultString + "</tr>";
			}

			// close
			preparedStatement.close();
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
	
	public Tenant detailsData(int idx) {
		Tenant resultData = new Tenant();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			String query = "SELECT * FROM tenant WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); 
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.age = resultSet.getInt("age");
				resultData.gender = resultSet.getString("gender");
			}
			preparedStatement.close();
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
	
	public boolean updateData(Tenant tenant) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			String query = "UPDATE tenant SET name=?, age=?, gender=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, tenant.name);
			preparedStatement.setInt(2, tenant.age);
			preparedStatement.setString(3, tenant.gender);
			preparedStatement.setInt(4, tenant.idx);

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
	
	public boolean deleteData(int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			String query = "DELETE FROM tenant WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, idx);
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
	
	public String tenantInfoData() {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			
			String count_query = "SELECT COUNT(*) as total, avg(age) as avg FROM tenant;";
			PreparedStatement preparedStatement = connection.prepareStatement(count_query);
			ResultSet countResult = preparedStatement.executeQuery();
			
			String womanCount_query = "SELECT COUNT(*) as woman FROM tenant WHERE gender='여자';";
			PreparedStatement preparedStatement3 = connection.prepareStatement(womanCount_query);
			ResultSet womanCount = preparedStatement3.executeQuery();
			
			String manCount_query = "SELECT COUNT(*) as man FROM tenant WHERE gender='남자';";
			PreparedStatement preparedStatement4 = connection.prepareStatement(manCount_query);
			ResultSet manCount = preparedStatement4.executeQuery();
			
			int totalPeople = countResult.getInt("total");
			int ageAvg = countResult.getInt("avg");
			int tatalWoman = womanCount.getInt("woman");
			int tatalMan = manCount.getInt("man");
			double womanRatio = ((double)tatalWoman/totalPeople)*100;
			double manRatio = ((double)tatalMan/totalPeople)*100;

			resultString = resultString + "<tr>";
			resultString = resultString + "<td>" + totalPeople + "</td><td>" + ageAvg
					+ "</td><td>" + womanRatio+"%" + "</td><td>" + manRatio+"%" + "</td>";
			resultString = resultString + "</tr>";
			
			preparedStatement.close();
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
	
	public boolean insertAPT(Apartment aptData) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			String fieldString = "aptName";
			String query = "INSERT INTO apt (" + fieldString + ") VALUES (?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, aptData.aptName);

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
	
	public String selectAPTData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM apt;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String aptName = resultSet.getString("aptName");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + aptName
						+ "</td><td><a href = 'updateApt?idx=" + idx + "'>수정</a></td>"+
						"<td><a href = 'deleteApt?idx=" + idx + "'>삭제</a></td>";
				resultString = resultString + "</tr><br><br>";
			}

			// close
			preparedStatement.close();
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
	
	public Apartment aptDetailsData(int idx) {
		Apartment resultData = new Apartment();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			String query = "SELECT * FROM apt WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); 
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.aptName = resultSet.getString("aptName");
			}
			preparedStatement.close();
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
	
	public boolean updateAptData(Apartment apt) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());
			String query = "UPDATE apt SET aptName=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, apt.aptName);
			preparedStatement.setInt(2, apt.idx);

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
	
	public boolean deleteAPTData(int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			String query = "DELETE FROM apt WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, idx);
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
	public String selectAPTnoTag() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/tenant.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM apt;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String aptName = resultSet.getString("aptName");
				resultString = resultString + idx + " : " + aptName+ "<br>";
			}

			// close
			preparedStatement.close();
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
	
}
