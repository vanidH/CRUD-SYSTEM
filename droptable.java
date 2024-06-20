import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class  JDBCDropTable {
    public static void main(String[] args) throws ClassNotFoundException,SQLException 
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/det","root","Betul@123");
            Statement stmt=conn.createStatement();
            String query ="drop table infor";
            //updating table
            int rows = stmt.executeUpdate(query);
            System.out.println(rows+" Rows Updated Succeffully...!");
            conn.close();
            stmt.close();
            }
            catch(Exception e){
            System.out.println(e.toString());
            }
       
    }
    
}

 