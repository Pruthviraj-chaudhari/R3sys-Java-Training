import java.util.Scanner;

public class Bank {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("******WELCOME TO R3Sys Bank******");
        System.out.println("\n\nCreate New Account");
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Intial Acc. Balance: ");
        float bal = sc.nextFloat();
        System.out.print("Bank Branch: ");
        String branch = sc.next();
        Account obj = new Account(name, bal, branch);
        System.out.println("Congratulation! Account Created Successfully.");

        char choice = 'Y';

        while (choice == 'Y' || choice == 'y') {
            System.out.println("\n||||| MENU |||||");
            System.out.println("Press 1. Account details");
            System.out.println("Press 2. Withdrawal");
            System.out.println("Press 3. Deposite");
            System.out.println("Press 4. Exit");

            System.out.print("Enter your choice: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    obj.displayAccountDetails();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.deposite();
                    break;
                case 4:
                    System.out.println("Exit Successfully !");
                    return;
                default:
                    System.out.println("Invalid Option !!");
            }

            System.out.print("Do you want to Continue (Y/N): ");
            choice = sc.next().charAt(0);
        }
    }
}
