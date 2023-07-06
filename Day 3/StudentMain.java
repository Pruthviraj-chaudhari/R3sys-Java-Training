import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************Fillup Student Details**********");
        System.out.print("Enter Student Name: ");
        String studName = sc.nextLine();
        System.out.print("Enter PRN: ");
        String studCode = sc.next();
        sc.nextLine();
        System.out.println("\n*************Fillup College Details**********");
        System.out.print("Enter College Name: ");
        String collegeName = sc.nextLine();
        System.out.print("Enter College Code: ");
        String collegeCode = sc.next();
        sc.nextLine();
        System.out.println("\n*************Fillup University Details**********");
        System.out.print("Enter University Name: ");
        String uniName = sc.nextLine();
        System.out.print("Enter University Code: ");
        String uniCode = sc.next();


        Student obj = new Student(studName, studCode, collegeName, collegeCode, uniName, uniCode);
        obj.displayStudent();
    }
}
