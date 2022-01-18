import java.sql.*;
public class Sql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class:forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:myself;//local:3306/Sample","root","9597");
	
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select *from Student");
		while(rs.next()){
			int roll=rs.getInt("Roll no");
			String name = rs.getString("Name");
			String city= rs.getString("City");
			
			System.out.print(roll+ " " +name+ " "+city);
			
		}
		st.close();
		con.close();
	}


}
