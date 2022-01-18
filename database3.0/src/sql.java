
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sql {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		createDatabase();
		createTable();
		showDatabase();
		insert();
		selectTable();
		describe();
		update();
		delete();
		dropTable();
	}
	
	
	public static void createDatabase() throws Exception {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		try {
			String databaseName = "Create database testing123";
			stmt.executeUpdate(databaseName);
			System.out.println("database is created");
		} catch(Exception e) {System.out.println(e);}
	}
	
	public static void createTable() {
		
		try {
			Connection con2 = getConnection();
			PreparedStatement create = con2.prepareStatement("create table Song(id bigint(200) primary key auto_increment, singer varchar(100),title varchar(100))");
			create.executeUpdate();			
		} catch(Exception e) {System.out.println(e);}		
		finally{System.out.println("table is created");}
	}
	
	public static ArrayList<String> showDatabase() throws Exception {
		
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		try{
			String database = "show databases";
		stmt.executeUpdate(database);
		ResultSet result = stmt.executeQuery(database);
		ArrayList<String> array = new ArrayList<String>();
		while(result.next()){
          System.out.println(result.getString("database")); 
          array.add(result.getString("database"));
      }
      result.close();
		}catch(Exception e) {System.out.println(e);}
		return null;	
}

	
	public static void insert() {
		String title1 = "Welcome to black parade";
		String title2 = "Sleepwalking";
		try {
			Connection con2 = getConnection();			
			PreparedStatement insert1 = con2.prepareStatement("insert into song (title) VALUES ('"+title1+"')" );
			insert1.executeUpdate();			
		} catch(Exception e) {System.out.println(e);}
		try {
			Connection con2 = getConnection();
			PreparedStatement insert2 = con2.prepareStatement("insert into song (title) VALUES ('"+title2+"')");
			insert2.executeUpdate(); 
			
		} catch(Exception e) {System.out.println(e);}
		
		finally{System.out.println("information is inserted");}
		
	}
	
	
	public static ArrayList<String> selectTable() throws Exception{
		try{
        	
            Connection con = getConnection();
            PreparedStatement statement = con.prepareStatement("SELECT * FROM song");          
            ResultSet result = statement.executeQuery();
            ArrayList<String> array = new ArrayList<String>();
            while(result.next()){
                System.out.println(result.getString("title"));
               
                array.add(result.getString("title"));
            }
            
            System.out.println("All data is selected!");
            return array;
           
        }catch(Exception e){System.out.println(e);}
        
        
        return null;
       
    }
	public static Connection getConnection() throws Exception{
		
		
		 try{
			   String host = "com.mysql.cj.jdbc.Driver";
			   String port = "jdbc:mysql://localhost:3306/mysql ";
			   String username = "root";
			   String password = "alepviennas123";
			   Class.forName(host);
			   
			   Connection con1 = DriverManager.getConnection(port,username,password);
			   System.out.println();
			   System.out.println("Connected");
			   
			   return con1;
			   
			  } catch(Exception e){System.out.println(e);}
		 
		 return null;
		 
		 
	}

	public static void dropTable() {
		
			try {
				
				String table = "DROP TABLE song";
				
				Connection con = getConnection();
				Statement stmt = con.createStatement();
				stmt.executeUpdate(table);
				
			} catch(Exception e) {System.out.println(e);}
		
		finally{System.out.println("table is deleted");}
			
	}
	public static void update() {
		
		try {
			
			String update = "UPDATE song " + "SET title = 'I Dont love you' WHERE id in (1)";
			
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(update);
			
		} catch(Exception e) {System.out.println(e);}
	
	finally{System.out.println("table is updated");}
		
}

	
	
	public static void delete() {
		
		try {
			
			String delete = "DELETE FROM song " + "WHERE id in (2,3,4)";
			
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			stmt.executeUpdate(delete);
			
		} catch(Exception e) {System.out.println(e);}
	
	finally{System.out.println("data is deleted");}
		
}


	public static void describe() throws Exception {
		
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM song");
	    ResultSetMetaData metaData = resultSet.getMetaData();
	    System.out.println();
	    System.out.println("Number of columns: "+metaData.getColumnCount());
	    System.out.println("Table description...!");
	    for(int i=1;i<= metaData.getColumnCount();i++){
	    	System.out.println("\t"+ metaData.getColumnName(i)+"\t"+metaData.getColumnTypeName(i));
	      
	    }
		
		
	}

}





