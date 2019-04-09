package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//	1. java.sql import
public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		try{
			//	2. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	3. Connection 얻기
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			// 검색어 입력
			System.out.print("이름 검색>>");
			String search = sc.next();
//				4. Statement 생성
//			stmt = conn.createStatement();
			


			
//			String sql = "SELECT " + 
//				"first_name, last_name, email, phone_number, hire_date" +
//				" FROM employees " +
//				" WHERE lower(first_name) Like'%" + search.toLowerCase() + "%'OR lower(last_name) Like '%"+search.toLowerCase()+ "%'" ;
			String sql = "SELECT " +
				"first_name, last_name, email, phone_number, hire_date" +
				" FROM employees" + 
				" WHERE lower(first_name) LIKE ? " +
				"OR lower(last_name) LIKE ?";
			System.out.println("SQL:" + sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  "%" + search.toLowerCase() + "%");
			pstmt.setString(2,  "%" + search.toLowerCase() + "%");
			
			//	5. 결과값을 얻기 -> ResultSet
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				String FName = rs.getString(1);
				String LName = rs.getString(2);
				String Email = rs.getString(3);
				String PN = rs.getString(4);
				String HD = rs.getString(5);
				
				System.out.printf("FirstName: %s, LastName: %s, Email: %s, Phone: %s, HireDate: %s%n", FName, LName, Email, PN, HD);
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
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.out.println("Error:" + e.getMessage());
			}

		}

	}
}
