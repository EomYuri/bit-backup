package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
	      // Database 연결 정보 만들기
	      String dbur = "jdbc:oracle:thin:@localhost:1521:xe";      // 연결문자열, DBMS마다 다르다
	      String dbuser = "bituser";
	      String dbpass = "bituser";

	      Connection conn = null;
	      try{
	         // 2. 드라이버 로드
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	         // 3. Connection
	         conn = DriverManager.getConnection(dbur,dbuser,dbpass);
	         System.out.println("Connection : " + conn);
	         System.out.println("연결 성공!");
	      }catch (ClassNotFoundException e) {
	         //Class.forName이 오류
	         System.out.println("JDBC 드라이버를 찾지 못했습니다.");
	      }catch(SQLException e) {
	         System.err.println("SQL Error!");
	         System.err.println("Error : " +e.getMessage());
	      }finally {
	         // 6. 연결 해제
	         try {
	            conn.close();
	         }catch(Exception e) {
	            System.err.println("Error : " + e.getMessage());
	         }


	      }

	   }

}
