package gusetbookDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//DB 접근에 대한 필수 기능을 정의해주는 Dao
//Data Access Object
//연결부분에 필요한 부분들을 정의해준다.
//ex) DB에 연결하기 위해 필요한 Connection 객체를 생성하는 것
public abstract class BaseDao {
	private String dbUser = null;
	private String dbPass = null;

	public BaseDao(String dbUser, String dbPass) {
		super();
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	protected Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, dbUser, dbPass);
		}catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾지 못 하였습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("SQL Error : "+e.getMessage());
		}
		return conn;
	}
} 