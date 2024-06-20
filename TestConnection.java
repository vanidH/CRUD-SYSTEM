import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class TestDBase {

    public static void main(String[] args) {
        try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("loaded driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Betul@123");
                //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","Betul@123");
                System.out.println("Connected to MySQL");
                con.close();
            }
               catch(ClassNotFoundException | SQLException ex){
               }
    }
    
}
