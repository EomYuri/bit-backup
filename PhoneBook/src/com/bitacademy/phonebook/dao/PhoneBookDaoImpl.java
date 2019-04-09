package com.bitacademy.phonebook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bitacademy.phonebook.vo.PhoneBookVo;


public class PhoneBookDaoImpl extends BaseDao implements PhoneBookDao{
	
	public PhoneBookDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}

	@Override
	public List<PhoneBookVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 데이터 전송을 위한 리스트
		List<PhoneBookVo> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT id, name, hp, tel FROM phonebook";

			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				PhoneBookVo info = new PhoneBookVo( 
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				list.add(info);
			}
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	@Override
	public boolean insert(PhoneBookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;

		try {
			conn = getConnection();
			String sql = "INSERT INTO phonebook (id, name, hp, tel) " + 
					"VALUES(seq_phonebook_pk.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getHp());
			pstmt.setString(3, vo.getTel());

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
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;

		try {
			conn = getConnection();
			String sql = "DELETE FROM phonebook WHERE id = ?";
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
	public List<PhoneBookVo> search(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 데이터 전송을 위한 리스트
		List<PhoneBookVo> list = new ArrayList<>();

		try {
			conn = getConnection();
			String sql = "SELECT id, " + 
					"name, hp, tel " +
					"FROM phonebook " +
					"WHERE name Like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");

			rs = pstmt.executeQuery();

			while(rs.next()) {
				PhoneBookVo info = new PhoneBookVo( 
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				list.add(info);
			}
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
