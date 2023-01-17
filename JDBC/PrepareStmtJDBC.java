import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;

public class PrepareStmtJDBC {

	public static void main(String[] args) {
	
		try {
			//load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://127.0.0.1:3306/student_manage ";
			Connection con = DriverManager.getConnection(url,user,password );
			
			//create a query
			String q = "insert into table1(tName,tCity) values (?,?) ";
			
			//create a PreparedStatement  
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the values;
			pstmt.setString(1, "mayur");
			pstmt.setString(2, "jalgaon");
			
			pstmt.executeUpdate();
			System.out.println("inserted in database...");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
