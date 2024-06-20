import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDeleteRecord {
        public static void main(String[] args) throws   SQLException     {
  
   try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Betul@123");
         //creating statement for query execution
     Statement stmt = con.createStatement();
     String query = "delete from student WHERE code=12";
       stmt.executeUpdate(query);
     System.out.println( "one Record deleted  Successfully.....");
     
   }
       catch (Exception e){
      System.out.println(e);
   }
        
    }
    
}
