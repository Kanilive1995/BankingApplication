import  java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("*****************");

            System.out.print("ENTER YOUR CHOICE (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");

            }
        }
        System.out.println("*****************");
        System.out.println("Thanks for using our program, have a nice day!");
        System.out.println("*****************");


        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.println("*****************");
        System.out.println("$" + balance);
    }
    static double deposit() {

        double amount;

        System.out.println("Enter amount to deposit");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
        }
        else {
            return amount;
        }
        return amount;
    }
    static double withdraw(double balance) {

        double amount;
        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}