package projectsbeginner;

import java.util.Scanner;

public class Timer {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        long startTime = 0;
        long elapsedTime = 0;
        boolean running = false;

        System.out.println("To start timer, type start, to end type end, to pause, type pause , to reset type reset");
        while (true) {
            System.out.print(">> "); // prompt for input
            String userInput = keyboard.nextLine(); // read input every loop

            if (userInput.equalsIgnoreCase("start")) {
                System.out.println("Timer Started ");
                
            } else if (userInput.equalsIgnoreCase("pause")) {
                System.out.println("TImer Paused");
            } else if (userInput.equalsIgnoreCase("reset")) {
                System.out.println("timer reset");
            } else {
                System.out.println("Goodbye");
                break;
            }
        }

    }
}
