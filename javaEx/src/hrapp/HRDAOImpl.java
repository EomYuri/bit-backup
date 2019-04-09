package hrapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bookshop.AuthorVO;

public class HRDAOImpl implements HRDAO {
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "bituser", "bituser");
		} catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		return conn;
	}


	@Override
	public List<HRVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		HRVO hrVO = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		// 데이터 전송을 위한 리스트
		List<HRVO> list = new ArrayList<>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT first_name||' '||last_name as name , salary "+
					"FROM employees "+
					"WHERE salary >= ?"+
					"AND salary <= ?";
			int min = sc.nextInt();
			int max = sc.nextInt();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + min + "%");
			pstmt.setString(2, "%" + max + "%");

			rs = pstmt.executeQuery();

			if(rs.next()) {
				hrVO = new HRVO(rs.getString(1), rs.getInt(2));
			}
		}catch(SQLException e) {
			System.err.println("Error: " + e.getMessage());


		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
		return authorVO;
	}





	@Override
	public HRVO get(String empName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		AuthorVO authorVO = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT , " + 
					"author_name, author_desc " +
					"FROM author " +
					"WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				authorVO = new AuthorVO(rs.getLong(1), rs.getString(2), rs.getString(3));

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
		return authorVO;
	}

	return null;
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}
