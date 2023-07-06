import java.util.Scanner;

public class Account {
    String accHolderName, branch;
    long accountNumber;
    float balance;

    public static long generateRandomNumber() {
        long min = 1000000000L;
        long max = 9999999999L;
        long randomNum = min + (long) (Math.random() * (max - min + 1));
        return randomNum;
    }

    Account(String name, float initialBal, String branch) {
        this.accHolderName = name;
        this.accountNumber = generateRandomNumber();
        this.balance = initialBal;
        this.branch = branch;
    }

    static Scanner sc = new Scanner(System.in);

    void withdraw() {
        System.out.println("\n*********Withdrawal*********");
        System.out.print("Enter Amount to Withdraw: ");
        int amount = sc.nextInt();

        if (amount > this.balance) {
            System.out.println("Insufficient Acc. Balance !! ");
            System.out.println("Acc. Balance: " + this.balance);
        } else {
            System.out.println("Previous Acc. Balance: " + this.balance);
            this.balance -= amount;
            System.out.println("Current Acc. Balance: " + this.balance);
        }

    }

    void deposite() {
        System.out.println("\n*********Deposite*********");
        System.out.print("Enter Amount to Deposite: ");
        int amount = sc.nextInt();
        System.out.println("Previous Acc. Balance: " + this.balance);
        this.balance += amount;
        System.out.println("Current Acc. Balance: " + this.balance);
    }

    void displayAccountDetails() {
        System.out.println("\n************Account Details************");
        System.out.println("Acc. Holder Name: " + this.accHolderName);
        System.out.println("Acc. Number: " + this.accountNumber);
        System.out.println("Acc. Balance: " + this.balance);
        System.out.println("Branch Name: " + this.branch);
    }
}

