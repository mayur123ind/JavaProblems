import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {

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
			String q = "select * from table1 ";
			
			
			
			//create a PreparedStatement  
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
		while(set.next())
		{
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);
			
			System.out.println(id + " : "+name+" : "+" : "+city );
		}
	
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
