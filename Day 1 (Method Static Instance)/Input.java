import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter INT: ");   
        int myInt = sc.nextInt();
        
        System.out.print("Enter BYTE: ");
        byte myByte = sc.nextByte();

        System.out.print("Enter SHORT: ");
        short myShort = sc.nextShort();

        System.out.print("Enter LONG: ");
        long myLong = sc.nextLong();

        System.out.print("Enter FLOAT: ");
        float myFloat = sc.nextFloat();

        System.out.print("Enter DOUBLE: ");
        double myDouble = sc.nextDouble();

        System.out.print("Enter CHAR: ");
        char myChar = sc.next().charAt(0);

        System.out.print("Enter Boolean: ");
        boolean myBool = sc.nextBoolean();

        System.out.print("Enter Singleword String: ");
        String myStr = sc.next();

        sc.nextLine();

        System.out.print("Enter Multiword String: ");
        String multiStr = sc.nextLine();


        System.out.println("Entered INT: " + myInt);
        System.out.println("Entered BYTE: "+ myByte);
        System.out.println("Entered SHORT: "+ myShort);
        System.out.println("Entered LONG: "+ myLong);
        System.out.println("Entered FLOAT: "+ myFloat);
        System.out.println("Entered DOUBLE: "+ myDouble);
        System.out.println("Entered CHAR: "+ myChar);
        System.out.println("Entered Boolean: "+ myBool);
        System.out.println("Entered Singleword String: "+ myStr);
        System.out.println("Entered Multiword String: "+ multiStr);

    }
}
