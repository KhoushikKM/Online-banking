import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 100;

    public static void main(String[] args) {

        boolean isRunning = true;

        while(isRunning){
            System.out.println("\n***************************");
            System.out.println("Welcome to Internet Banking");
            System.out.println("***************************");
            System.out.println("Here are all the possible actions");
            System.out.println("1. Show Balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Withdraw funds");
            System.out.println("4. Create a new account");
            System.out.println("5. Exit the application");
            System.out.print("Please Enter an choice to continue: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 ->System.out.println("Feature coming soon! Stay Tuned!!");
                case 5 ->{
                    System.out.println("Thank you for using our services");
                    isRunning = false;
                }


            }
        }

    }

    static void showBalance(double balance){
        System.out.printf("$%2f",balance);
    }

    static double deposit(){
        System.out.println("Enter amount to be deposited: ");
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Fund cannot be negative");
            return 0;
        }else {
            System.out.println("Funds has been deposited successfully");
            return amount;
        }
    }

    static double withdraw(){
        System.out.println("Enter the amount for Withdrawal");
        double amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Negative amount cannot be deposited");
        }else if(amount > balance){
            System.out.println("Insufficient Funds, YOU BROKE NIGGER");
        }
        else{
            System.out.println("Money Withdraw initiated");
            System.out.println("Money Withdrawn successfully");
            return amount;
        }
        return 0;
    }

}