import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        System.out.println("*****************");
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
            case 1 -> System.out.println("SHOW BALANCE");
            case 2 -> System.out.println("DEPOSIT");
            case 3 -> System.out.println("WITHDRAW");
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }









        scanner.close();
    }
}