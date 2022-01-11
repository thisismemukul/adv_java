import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
public class student{
	public static void main(String args[]){
		try{
			// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			// String conUrl = "jdbc:ucanaccess://D:\\Study Material\\SEM 5\\Adv Java\\Database\\student.accdb";
			String conUrl = "jdbc:ucanaccess://C:/Users/user/OneDrive/Documents/student.accdb";

			Connection con = DriverManager.getConnection(conUrl);
			Statement st =con.createStatement();
			String sql = "Select*from student";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("RollNo\t Name\t Marks\t");
			while(rs.next()){
				System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
		}catch(Exception e){
			System.out.println("Something Went Wrong"+e);
		}
	}
}
