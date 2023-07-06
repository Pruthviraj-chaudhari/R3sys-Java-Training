public class Student extends College
{
    String studentName;
    String studentCode;

    Student(String studName, String studCode, String cName, String cCode, String uName, String uCode){
        super(cName, cCode, uName, uCode);
        this.studentName = studName;
        this.studentCode = studCode;
    }

    void displayStudent(){
        this.displayCollege();
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student Code: " + this.studentCode);
    }
}