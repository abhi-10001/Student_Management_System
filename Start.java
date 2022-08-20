import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start
{
    public static void main(String [] args) throws IOException
    {
        System.out.println("Welcome to student management app!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            System.out.println("PRESS 1 to ADD student");
            System.out.println("PRESS 2 to Delete student");
            System.out.println("PRESS 3 to Display student");
            System.out.println("PRESS 4 to Update");
            System.out.println("PRESS 5 to Exit");
            int c = Integer.parseInt(br.readLine());

            if(c==1)
            {
                //add student..
                System.out.print("Enter user name: ");
                String name = br.readLine();

                System.out.print("Enter user phone: ");
                String phone = br.readLine();

                System.out.print("Enter user city: ");
                String city = br.readLine();
                
                //create student object to store student
                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if(answer)
                {
                    System.out.println("Student is added successfully...");
                }
                else{
                    System.out.println("Something went wrong please try again...");
                }
                System.out.println(st);
            }
            else if(c ==2)
            {
                //delete student..
                System.out.println("Enter student ID to delete: ");
                int userId = Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userId);
                if(f)
                {
                    System.out.println("Deleted...");
                }else {
                    System.out.println("Something went wrong...");
                }
            }
            else if(c==3)
            {
                //Display student..
                StudentDao.showAllStudent();
            }
            else if(c ==4)
            {
                //Update Student Details....
                Student st = new Student();
                boolean f = StudentDao.updateStudent(st);
                if(f){
                    System.out.println("Successfully Update...");
                }else {
                    System.out.println("Something went wrong..");
                }
            }
            else if(c==5)
            {
                //Exit..
                break;
            }
            else{
                System.out.println("Invalid Entry!!");
            }
        }
        System.out.println("ThankYou for using my app");
    }
}
