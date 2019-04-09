package com.example.phonebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.phonebook.vo.PhoneBookVO;

public class PhoneBookDAOImpl implements PhoneBookDAO{
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "bituser", "bituser");
		} catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패");
		}
		return conn;
	}

	@Override
	public List<PhoneBookVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 데이터 전송을 위한 리스트
		List<PhoneBookVO> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT id, name, hp, tel FROM phone_book";

			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				PhoneBookVO phonebookVO = new PhoneBookVO( 
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				list.add(phonebookVO);
			}
		}catch(SQLException e) {
			System.err.println("Error: " + e.getMessage());
		}
		return list;
	}


	@Override
	public boolean insert(PhoneBookVO phonebookVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;

		try {
			conn = getConnection();
			String sql = "INSERT INTO phone_book " + 
					"VALUES(SEQ_PHONE_BOOK_ID.NEXTVAL, " +
//					"VALUES(7, " +
					"?, ?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phonebookVO.getName());
			pstmt.setString(2, phonebookVO.getHp());
			pstmt.setString(3, phonebookVO.getTel());

			insertedCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}

		return insertedCount == 1;
	}

	@Override
	public boolean deldete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;

		try {
			conn = getConnection();
			String sql = "DELETE FROM phone_book WHERE id Like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			deletedCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			System.err.println("ERROR: " + e.getMessage());
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
		return deletedCount == 1;
	}

	@Override
	public PhoneBookVO get(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PhoneBookVO phonebookVO = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT id, " + 
					"name, hp, tel " +
					"FROM phone_book " +
					"WHERE name Like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");

			rs = pstmt.executeQuery();

			if(rs.next()) {
				phonebookVO = new PhoneBookVO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		}catch(SQLException e) {
			System.err.println("ERROR: " + e.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
		System.out.println();
		return phonebookVO;
	}




}
