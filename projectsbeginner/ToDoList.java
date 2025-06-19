package projectsbeginner;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Display menu
            System.out.println("\nWelcome to your To-Do List!");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Mark task as done");
            System.out.println("5. Exit");

            System.out.print("Choose an option (1-5): ");
            int userInput = keyboard.nextInt();
            keyboard.nextLine(); // clears the newline after nextInt()

            switch (userInput) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTasks();
                    break;
                case 4:
                    markedTasks();
                    break;
                case 5:
                    System.out.println("You have exited the program. Goodbye!");
                    keyboard.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }

    public static void addTask() {
        System.out.print("Enter a task: ");
        String userInput = keyboard.nextLine();

        if (userInput.trim().isEmpty()) {
            System.out.println("Task cannot be empty.");
            return;
        }

        tasks.add(userInput);
        System.out.println("Task has been added.");
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks have been added yet.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void removeTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks to remove.");
            return;
        }

        viewTasks(); // Show tasks first so user knows the numbers

        System.out.print("Enter the task number to remove: ");
        int userInput = keyboard.nextInt();
        keyboard.nextLine(); // clear newline

        int index = userInput - 1;

        if (index >= 0 && index < tasks.size()) {
            String removed = tasks.remove(index);
            System.out.println("Task removed: " + removed);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void markedTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are no tasks to mark");
            return; // returns early if there are no tasks
        }

        viewTasks();

        System.out.print("enter the task number to complete");
        int userInput = keyboard.nextInt();
        int index = userInput - 1;
        keyboard.nextLine();

        if (index < tasks.size() && index >= 0) {
            String current = tasks.get(index);
            if (!current.startsWith("[completed]")) {
                tasks.set(index, "[completed] " + current);
                System.out.println("task has been marked completed");
            } else {
                System.out.println("This task has already been marked");
            }
        }
    }
}
