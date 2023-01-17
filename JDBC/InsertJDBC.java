import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {

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
			String q = "create table table1(tID int(20) primary key auto_increment,tName varchar(200) not null , tCity varchar(400))"; 
			
			//create a statement why we create to fire this query 
			Statement stmt  = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table create in database...");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
