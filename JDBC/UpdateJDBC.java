import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateJDBC {

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
			String q = "update table1 set tName=? , tCity=? where tID=?";
			
			//Dynamic values take  
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name : ");
			String name = br.readLine();
			System.out.println("Enter City : ");
			String city = br.readLine();
			System.out.println("Enter the student Id : ");
			int id = Integer.parseInt(br.readLine());
			
			//create a PreparedStatement  
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the values;
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			System.out.println("updated in database...");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
