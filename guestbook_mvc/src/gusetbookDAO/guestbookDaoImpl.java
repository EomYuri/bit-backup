package gusetbookDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import guestbookVo.guestbookVo;

public class guestbookDaoImpl extends BaseDao implements guestbookDao {
	
	public guestbookDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}

	@Override
	public List<guestbookVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<guestbookVo> guestVo = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * "
					+ "FROM guest";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				guestbookVo vo = new guestbookVo(rs.getLong("no"), rs.getString("name"), rs.getString("password"), rs.getString("content"));
				guestVo.add(vo);
			}
		}
		catch (Exception e) {
			System.err.println("ERROR:"+ e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e) {
				System.err.println("ERROR:"+ e.getMessage());
			}
		}
	
		return guestVo;
	}

	@Override
	public boolean insert(guestbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedcount = 0;
		
		List<guestbookVo> guestVo = new ArrayList<>();
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO guest "
					+ "VALUES(seq_guest_pk.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getContent());
			
			insertedcount = pstmt.executeUpdate();
		}
		catch (Exception e) {
			System.err.println("ERROR:"+ e.getMessage());
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				System.err.println("ERROR:"+ e.getMessage());
			}
		}
	
		return insertedcount == 1;
	}

	@Override
	public boolean delete(Long no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedcount = 0;
		
		List<guestbookVo> guestVo = new ArrayList<>();
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM guest "
					+ "WHERE no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			
			deletedcount = pstmt.executeUpdate();
		}
		catch (Exception e) {
			System.err.println("ERROR:"+ e.getMessage());
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				System.err.println("ERROR:"+ e.getMessage());
			}
		}
	
		return deletedcount == 1;
	}

}
