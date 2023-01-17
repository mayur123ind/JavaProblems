import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDyanamic {

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
			
			//Dynamic values take  
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name : ");
			String name = br.readLine();
			System.out.println("Enter City : ");
			String city = br.readLine();
			
			//set the values;
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			System.out.println("inserted in database...");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
