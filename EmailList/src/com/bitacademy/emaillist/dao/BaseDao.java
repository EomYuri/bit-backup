package com.bitacademy.emaillist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDao {
	private String dbUser = null;
	private String dbPass = null;	

	// 생성자
	public BaseDao(String dbUser, String dbPass) {
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	// DAO 공통 메서드
	protected Connection getConnection() throws SQLException{
		Connection conn = null;

		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB 접속 URL
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, dbUser, dbPass);
		}catch(ClassNotFoundException e){
			System.err.println("드라이버 로드 실패");
			System.err.println("ERROR:" + e.getMessage());
		}
		return conn;
	}
}



