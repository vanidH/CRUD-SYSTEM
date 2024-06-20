import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TableCreation_Mysql {
        public static void main(String[] args) throws 
                SQLException {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Betul@123");
         //creating statement for query execution
     Statement stmt = con.createStatement();
  
       String sql="create table student(Name varchar(20),Monumber varchar(10),code int,Adderess varchar(20))";
       stmt.executeUpdate(sql);
       System.out.println("Table created successfully.....");   
 }
    catch (Exception e){
      System.out.println(e);

             }
             }
}
