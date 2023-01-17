import java.sql.*; 

public class FirstJDBC {

	public static void main(String[] args) {
		try {
			//load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://127.0.0.1:3306/student_manage ";
			Connection con = DriverManager.getConnection(url,user,password );
			
			if (con.isClosed()) {
				
				System.out.println("connection is closed");
			}
			
			System.out.println("Connection is Created");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
