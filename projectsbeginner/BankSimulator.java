package projectsbeginner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSimulator {
    static Scanner keyboard = new Scanner(System.in);
    static String[] accountNames = new String[10];
    static double[] accountBalances = new double[10];
    static int accountCount = 0;

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("\nWelcome to the Bank simulator! ");
                System.out.println("Would you like to: ");
                System.out.println("1.Create a bank account");
                System.out.println("2.View your personal bank account");
                System.out.println("3.Add funds to your bank account");
                System.out.println("4.view all accounts");
                System.out.println("5.exit the program");
                int userInput = keyboard.nextInt();
                keyboard.nextLine();

                switch (userInput) {
                    case 1:
                        option1();
                        break;
                    case 2:
                        option2();
                        break;
                    case 3:
                        option3();
                        break;
                    case 4:
                        option4();
                        break;
                    case 5:
                        System.out.println("Goodbye");
                        keyboard.close();
                        return;
                    default:
                        System.out.println("Please enter a number above");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                keyboard.nextLine();
            }
        }

    }

    public static void option1() {
        System.out.println("What is your name?");
        String userInput = keyboard.nextLine();

        accountNames[accountCount] = userInput;
        accountBalances[accountCount] = 0.0;
        accountCount++;

        System.out.println("Welcome " + userInput + " to your new personal bank account");
        System.out.println("You have nothing in your account");
        if (accountCount > accountNames.length) {
            System.out.println("You have too many accounts!");
        }

    }

    public static void option2() {
        System.out.println("Please enter the name you want to find: ");
        String userName = keyboard.nextLine();

        boolean found = false;

        for (int i = 0; i < accountCount; i++) {
            if (accountNames[i].equals(userName)) {
                System.out.println("account " + accountNames[i] + " and " + accountBalances[i]);

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }
    }

    public static void option3() {
        System.out.println("What is your name? ");
        String userInputName = keyboard.nextLine();

        boolean found = false;

        for (int i = 0; i < accountCount; i++) {
            if (accountNames[i].equals(userInputName)) {
                found = true;
                System.out.println("We found your account: " + accountNames[i]);
                System.out.println("Your current balance is: $" + accountBalances[i]);

                System.out.println("How much would you like to deposit?");
                double amount = keyboard.nextDouble();
                keyboard.nextLine(); // clear newline from input buffer

                if (amount > 0) {
                    accountBalances[i] += amount;
                    System.out.println("Deposit successful! New balance: $" + accountBalances[i]);
                } else {
                    System.out.println("Invalid amount. Deposit must be greater than 0.");
                }

                break; // stop searching once we find the account
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void option4() {
        for (int i = 0; i < accountCount; i++) {
            System.out.println("Account:" + accountNames[i] + " | Balance: " + accountBalances[i]);
        }
    }

}
