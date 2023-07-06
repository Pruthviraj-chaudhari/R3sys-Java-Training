import java.util.Random;
import java.util.Scanner;

public class Aadhar {

    Scanner sc = new Scanner(System.in);

    static String country = "India";
    long aadharNo;
    String name;
    int age;
    String gender;
    String state;
    String district;
    String city;

    public static long generateRandomNumber(int length) {
        long min = (long) Math.pow(10, length - 1); // Minimum possible value
        long max = (long) Math.pow(10, length) - 1; // Maximum possible value

        Random random = new Random();
        return min + random.nextInt((int) (max - min + 1));
    }

    void displayAadhar(){
        System.out.println("\nName: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
        System.out.println("Address: "+this.city+ ", "+this.district+", "+this.state+", "+this.country);
        System.out.println("Aadhar Number: "+this.aadharNo);
    }

    void getData(){
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();

        System.out.print("Enter Age: ");
        this.age = sc.nextInt();

        System.out.print("Enter Gender: ");
        this.gender = sc.next();

        System.out.print("Enter City: ");
        this.city = sc.next();

        System.out.print("Enter District: ");
        this.district = sc.next();

        System.out.print("Enter State: ");
        this.state = sc.next();
        
        this.aadharNo = generateRandomNumber(10);
    }
}
