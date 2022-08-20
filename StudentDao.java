import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao
{
    public static boolean insertStudentToDB(Student st)
    {
        boolean f = false;
        try{
        //jdbc code..
        Connection con = CP.createC();
        String q = "insert into students(sname, sphone, scity) values(?,?,?)";
        //PreparedStatement
        PreparedStatement pstmt = con.prepareStatement(q);
        //set the value of parameter..
        pstmt.setString(1, st.getStudentName());
        pstmt.setString(2,st.getStudentPhone());
        pstmt.setString(3,st.getStudentCity());

        //execute..
        pstmt.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }

    public static boolean deleteStudent(int userId)
    {
        boolean f = false;
        try{
        //jdbc code..
        Connection con = CP.createC();
        String q = "delete from students where sid=?";
        //PreparedStatement
        PreparedStatement pstmt = con.prepareStatement(q);
        //set the value of parameter..
        pstmt.setInt(1, userId);

        //execute..
         pstmt.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }
    public static void showAllStudent()
    {
        try{
        //jdbc code..
        Connection con = CP.createC();
        String q = "select * from students;";
        Statement stmt = con.createStatement();

        ResultSet set = stmt.executeQuery(q);
        while(set.next())
        {
            int id = set.getInt(1);
            String name = set.getString(2);
            String phone =set.getString(3);
            String city = set.getString("scity");

            System.out.println("ID    : "+id);
            System.out.println("Name  : "+name);
            System.out.println("Phone : "+phone);
            System.out.println("City  : " + city);
            System.out.println("-------------------------------------------");
        }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static boolean updateStudent(Student st)
    {
        boolean f = false;
        try{
        //jdbc code..
        Connection con = CP.createC();
        String q = "update students set sname=?, sphone=?, scity=? where sid=?";

        //New Entry...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("**If you don't want to update a particular field, Just enter '*' character**");
        
        System.out.print("Enter new name: ");
        String name = br.readLine();

        System.out.print("Enter new phone: ");
        String phone = br.readLine();

        System.out.print("Enter new city: ");
        String city = br.readLine();

        System.out.print("Enter the student id: ");
        int id = Integer.parseInt(br.readLine());
        
        //PreparedStatement
        PreparedStatement pstmt = con.prepareStatement(q);
        //set the value of parameter..
        if(name == "*")
            pstmt.setString(1,st.getStudentName());
        else 
            pstmt.setString(1,name);

        if(phone =="*")
            pstmt.setString(2,st.getStudentPhone());
        else 
            pstmt.setString(2,phone);

        if(city =="*")
            pstmt.setString(3,st.getStudentCity());
        else 
            pstmt.setString(3,city);

            pstmt.setInt(4,id);

        //execute..
        pstmt.executeUpdate();
            f = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }
}
