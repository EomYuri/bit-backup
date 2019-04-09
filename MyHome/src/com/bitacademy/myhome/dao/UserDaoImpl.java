package com.bitacademy.myhome.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bitacademy.myhome.vo.UserVo;

public class UserDaoImpl extends BaseDao implements UserDao {

	public UserDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}


	@Override
	public List<UserVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<UserVo> list = new ArrayList<>();
		try {
			conn = getConnection();
			String sql =
					"SELECT no, name, password, email, gender, created_at " + 
							"FROM users " +
							"ORDER BY created_at DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int no = (int) rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String email = rs.getString(4);
				String gender = rs.getString(5);
				Date created_at = rs.getDate(6);

				UserVo info = new UserVo(no, name, password, email, gender, created_at);
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
	public boolean insert(UserVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = 
				"INSERT INTO users (no, name, password, email, gender) "
					+ "VALUES(seq_users_pk.nextval, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getGender());
			insertedCount = pstmt.executeUpdate();
		}catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
		return 1 == insertedCount;
	}


	@Override
	public boolean update(UserVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE Users " +
			"SET name = ?, password = ?, email = ?, gender = ? " +
					"WHERE name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getName());
			updatedCount = pstmt.executeUpdate();
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
		return 1 == updatedCount;
	}


	@Override
	public boolean delete(int no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM users WHERE no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			deletedCount = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
	
		return 1 == deletedCount;
	}


	@Override
	public UserVo getUser(String email, String password) {
		UserVo userVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT no, name, email, gender " + 
					"FROM users " +
					"WHERE email=? AND password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String emailVal = rs.getString(3);
				String gender = rs.getString(4);
				
				userVo = new UserVo(name, null, emailVal, gender);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return userVo;
	}

}
