public class University
{
    String universityName;
    String universityCode;

    University(String name, String code){
        this.universityName = name;
        this.universityCode = code;
    }

    void displayUniversity(){
        System.out.println("University Name: " + this.universityName);
        System.out.println("University Code: " + this.universityCode);
    }
}