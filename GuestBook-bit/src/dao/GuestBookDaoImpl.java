package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vo.GuestVo;

public class GuestBookDaoImpl extends BaseDao implements GuestBookDao {

	public GuestBookDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}


	@Override
	public List<GuestVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<GuestVo> list = new ArrayList<>();
		try {
			conn = getConnection();
			String sql =
					"SELECT no, name, password, content, reg_date " + 
							"FROM guestbook " +
							"ORDER BY reg_date DESC";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String content = rs.getString(4);
				Date reg_date = rs.getDate(5);

				GuestVo info = new GuestVo(no, name, password, content, reg_date);
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
	public boolean insert(GuestVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = 
				"INSERT INTO guestbook (no, name, password, content) "
					+ "VALUES(seq_guestbook_no.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getContent());
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
			String sql = "DELETE FROM guestbook WHERE no = ?";
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
