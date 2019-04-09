package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//	1. java.sql import
public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
			//	2. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	3. Connection 얻기
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			//	4. Statement 생성
			stmt = conn.createStatement();
			String sql = "SELECT department_id, department_name From departments";
			//	5. 결과값을 얻기 -> ResultSet
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String deptId = rs.getString(1);
				String deptName = rs.getString("department_name");
				
				System.out.printf("%s:%s%n", deptId, deptName);
			}
		}catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾지 못했습니다.");
		}catch(SQLException e) {
			System.err.println("SQL ERROR!");
			System.err.println("Cause:" + e.getMessage());
		}finally{
			//	6. 닫기
			try{
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.out.println("Error:" + e.getMessage());
			}

		}

	}
}
