package projectsbeginner;

import java.util.Scanner;

public class StudentGrade {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the name of Student");
        String name = keyboard.nextLine();

        System.out.println("Enter Mark 1: ");
        int mark1 = keyboard.nextInt();
        System.out.println("Enter Mark 2: ");
        int mark2 = keyboard.nextInt();
        System.out.println("Enter Mark 3: ");
        int mark3 = keyboard.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Name : " + name);
        System.out.println("||Average|| : " + average + " ||Total||: " + total);
        System.out.println("||mark 1||: " + mark1 + " ||Mark 2||: " + mark2 + " || mark 3||: " + mark3);
        System.out.println("Your grade is :  " + grade);

    }

}
