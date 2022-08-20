import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.Connection;

public class CP {
    static Connection con;
    public static Connection createC(){
        try{
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create the connection...
        String user = "paradox";
        String password = "#17P@r@dox";
        String url = "jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";
        con= DriverManager.getConnection(url,user,password);
        }catch(Exception e ){
            e.printStackTrace();
        }

        return con;
    }
}
