public class Student
{
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public void setStudentId()
    {
        this.studentId = studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentName()
    {
        this.studentName = studentName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentPhone()
    {
        this.studentPhone = studentPhone;
    }
    public String getStudentPhone()
    {
        return studentPhone;
    }
    public void setStudentCity()
    {
        this.studentCity = studentCity;
    }
    public String getStudentCity()
    {
        return studentCity;
    }
    public Student(int studentId, String studentName, String studentPhone, String studentCity)
    {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public Student( String studentName, String studentPhone, String studentCity)
    {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public Student()
    {
        super();
    }
    public String toString()
    {
        return "Student [studentId =" + studentId + ",studentName= " + studentName + ",studentPhone=" + studentPhone + ",studentCity=" + studentCity + "]";

    }

}
