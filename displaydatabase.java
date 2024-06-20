import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDisplay {

    public static void main(String[] args) throws
            ClassNotFoundException, SQLException{
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Betul@123");
            System.out.println("Name     Monumber   Code     Address");
            System.out.println("----    -----     ------   ---------");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from member");
           while(rs.next())
           {
               System.out.println(rs.getString(1)+"      "+rs.getString(2)+"     "+rs.getInt(3)+"      "+rs.getInt(4)+"      "
                       +rs.getFloat(5));
           }
           con.close();
        }
        catch(Exception e)
                {
                System.out.println(e);
                }
        }
    }
