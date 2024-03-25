package feereport;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbcdemo3";
		String userName = "root";
		String passWord = "Test";
		String query = "select * from employee";
		
		Connection con =DriverManager.getConnection(url, userName, passWord);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		System.out.println("Id iS "+rs.getInt(1));
		System.out.println("Name iS "+rs.getString(2));
		System.out.println("Salary iS "+rs.getInt(3));
		// TODO Auto-generated method stub
		con.close();

	}

}
