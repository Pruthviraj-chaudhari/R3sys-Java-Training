public class College extends University
{
    String collegeName;
    String collegeCode;

    College(String cname, String cCode, String uName, String uCode){
        super(uName, uCode);
        this.collegeName = cname;
        this.collegeCode = cCode;
    }

    void displayCollege(){
        this.displayUniversity();
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
    }
}