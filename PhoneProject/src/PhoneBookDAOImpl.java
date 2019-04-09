import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PhoneBookDAOImpl implements PhoneBookDAO {
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
	
	

}
