package com.bitacademy.emaillist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bitacademy.emaillist.vo.EmailVo;

public class EmailListDaoImpl extends BaseDao implements EmailListDao {

	public EmailListDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}


	@Override
	public List<EmailVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<EmailVo> list = new ArrayList<>();
		try {
			conn = getConnection();
			String sql =
					"SELECT no, last_name, first_name, email, created_at " + 
							"FROM emaillist " +
							"ORDER BY created_at DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				Long no = rs.getLong(1);
				String lastName = rs.getString(2);
				String firstName = rs.getString(3);
				String email = rs.getString(4);
				Date createdAt = rs.getDate(5);

				EmailVo info = new EmailVo(no, lastName, firstName, email, createdAt);
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
	public boolean insert(EmailVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = 
				"INSERT INTO emaillist (no, last_name, first_name, email) "
					+ "VALUES(seq_emaillist_pk.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getLastName());
			pstmt.setString(2, vo.getFirstName());
			pstmt.setString(3, vo.getEmail());
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
	public boolean delete(Long no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM emaillist WHERE no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
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

}
