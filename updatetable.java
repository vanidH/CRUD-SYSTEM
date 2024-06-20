import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateExample {
 public static void main(String[] args) throws  SQLException,ClassNotFoundException  {
     Connection con = null;//connection reference variablefor getting
   //connection
   Statement stmt = null;//statement reference variable for query
   //Execution
   String conUrl = "jdbc:mysql://localhost:3306/";
   String driverName = "com.mysql.cj.jdbc.Driver";
   String databaseName = "school";
   String userName = "root";
   String userPass = "Betul@123";
   try{
       //loading Driver
       Class.forName(driverName);
   }   
   catch(ClassNotFoundException e)
   {
       System.out.println(e.toString());
   }
   try {
   con = DriverManager.getConnection(conUrl + databaseName,userName,userPass);
   //creating statement for query execution
   stmt = con.createStatement();
   //creating Query String
   String query = "UPDATE student SET name='sanju' WHERE code=12";
   //Updating Table
   int rows = stmt.executeUpdate(query);
     System.out.println(rows + "Rows Updated Successfully.....");
 }
       catch (Exception e){
      System.out.println(e.toString());
}   
       finally
             {
             //closing Connection
             con.close();
             stmt.close();
             
             }
             }
}
