import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert_Data_MySQL {

    public static void main(String[] args) throws
        ClassNotFoundException,SQLException
                {
         try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Betul@123");
                Statement stmt=con.createStatement();
                String sql="insert into student(Name,Monumber,code,Adderess)values('Anju','6789346787',12,'Amla'),('Ram','5678459867',14,'sarni')";
                stmt.executeUpdate(sql);
                System.out.println(" record inserted successfully.....");
                con.close();
        } 
                catch(Exception e)
                        {
                        System.out.println(e);
                        }
        }
}
    