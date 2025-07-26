import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class databasetest {
	public databasetest() {
		String url = "jdbc:mysql://localhost:3306/school_system";
		String user = "root";
		String password = "1234";
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 연결
			connection = DriverManager.getConnection(url, user, password);
			
			// 삽입할 데이터와 SQL INSERT 쿼리 작성
			String sql = "INSERT INTO students (student_id, name, birth_date) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(sql);
			
			// 삽입할 값 설정
			statement.setInt(1,  4);
			statement.setString(2,  "홍길동,13");
			statement.setString(3,  "2023-09-10");
			
			// SQL 쿼리 실행
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("데이터가 성공적으로 삽입되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 또는 삽입에 실패했습니다.");
			e.printStackTrace();
		} finally {
			// 연결 해제
			try {
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
