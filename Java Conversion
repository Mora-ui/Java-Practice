import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
// Loops the entire code if the user wnats to try again     
        while (true) {
            System.out.println("Please Enter a number for a converter");
            System.out.println("1. km to miles");
            System.out.println("2. lbs to kg");
            System.out.println("3. minutes to hours");
            
            if (!keyboard.hasNextInt()) {
                System.out.println("Please enter a Number (no decimals)");
                keyboard.next(); // consume invalid input
                continue;       // restart loop
            }
            
            int choice = keyboard.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Please enter number of km you want to convert:");
                    if (keyboard.hasNextDouble()) {
                        double userInput = keyboard.nextDouble();
                        double miles = userInput * 0.621371;
                        System.out.println(userInput + " km is " + miles + " miles.");
                    } else {
                        System.out.println("Only enter a valid number.");
                        keyboard.next(); // consume invalid input
                    }
                    break;
                case 2:
                    System.out.println("Please enter the amount of lbs you want to convert:");
                    if (keyboard.hasNextDouble()) {
                        double usersInput = keyboard.nextDouble();
                        double kg = usersInput * 0.453592;
                        System.out.println(usersInput + " lbs is " + kg + " kg.");
                    } else {
                        System.out.println("Only enter a valid number.");
                        keyboard.next();
                    }
                    break;
                case 3:
                    System.out.println("Please enter the amount of minutes you want to convert:");
                    if (keyboard.hasNextDouble()) {
                        double userssInput = keyboard.nextDouble();
                        double hours = userssInput / 60;
                        System.out.println(userssInput + " minutes is " + hours + " hours.");
                    } else {
                        System.out.println("Only enter a valid number.");
                        keyboard.next();
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
            
            System.out.println("Would you like to try again? (yes or no)");
            String tryAgain = keyboard.next().trim().toLowerCase();
            
            if (!tryAgain.equals("yes")) {
                System.out.println("Thank you for using this program!");
                break; // exit the loop
            }
        }
        
        keyboard.close(); // close scanner once when done allat
    }
}
