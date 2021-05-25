package com.kopo.project0521;

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
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/Student0525.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE Student0525(idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, middleExam REAL, finalExam REAL, time TEXT)";
			// sqlite는 정수 : INTEGER / 실수 : REAL 문자 : TEXT
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			// close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertData(String name, double middleScore, double finalScore) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/Student0525.db",
					config.toProperties());
			
			// use
			String fieldString = "name, middleExam, finalExam, time";
			String valueString = "'"+ name + "', " + middleScore +", " + finalScore + ", date('now')";
			
			String query = "INSERT INTO Student0525 (" + fieldString + ") VALUES (" + valueString + ");";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			// close
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String selectData() {
		String resultString = "";

		try {
			//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/Student0525.db",
					config.toProperties());
			
			//use
			String query = "SELECT * FROM student0525;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, "idx=1"); //index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery(); 
			
			//커서 위치 변경해주는거임(Resultset)
			while(resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				double middleScore = resultSet.getDouble("middleExam");
				double finalScore = resultSet.getDouble("finalExam");
				String time = resultSet.getString("time");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" +idx + "</td><td>"+name + "</td><td>"
				+middleScore + "</td><td>"+finalScore + "</td><td>"+time + "</td><td>"+
						"<a href = 'update?idx="+idx+"'>수정하기</a></td><td>"+
						"<a href = 'delete?idx="+idx+"'>삭제하기</a></td>";
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();
			
			//close
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
	
	public String updateData(int idx) {
		
		try {
			//open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/Student0525.db",
					config.toProperties());
			
			String query = "SELECT * FROM student0525 WHERE idx=" + idx + ";";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selectData();
	}
	
//	public void selectedData() {
//		
//	}

}
