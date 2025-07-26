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
			// JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// �����ͺ��̽� ����
			connection = DriverManager.getConnection(url, user, password);
			
			// ������ �����Ϳ� SQL INSERT ���� �ۼ�
			String sql = "INSERT INTO students (student_id, name, birth_date) VALUES (?, ?, ?)";
			statement = connection.prepareStatement(sql);
			
			// ������ �� ����
			statement.setInt(1,  4);
			statement.setString(2,  "ȫ�浿,13");
			statement.setString(3,  "2023-09-10");
			
			// SQL ���� ����
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("�����Ͱ� ���������� ���ԵǾ����ϴ�.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� �Ǵ� ���Կ� �����߽��ϴ�.");
			e.printStackTrace();
		} finally {
			// ���� ����
			try {
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
