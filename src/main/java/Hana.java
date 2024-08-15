import java.util.Scanner;

public class Hana {
    private static final int MAX_TASKS = 100;
    private static String[] tasks = new String[MAX_TASKS];
    private static int taskCount = 0;
    private static String line = "___________________________________________";
    private static String name = "Hana";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;


        //greet
        System.out.println(line);
        System.out.println(" Hello! I'm " + name);
        System.out.println(" What can I do for you?");
        System.out.println(line);

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("bye")) {
                System.out.println(line);
                System.out.println(" Bye. Hope to see you again soon!");
                System.out.println(line);
                break;
            } else if (input.equalsIgnoreCase("list")) {
                listTasks();
            } else {
                addTask(input);
            }
        }
    }

    private static void addTask(String task) {
        if (taskCount < MAX_TASKS) {
            tasks[taskCount] = task;
            taskCount++;
            System.out.println(line);
            System.out.println("added: " + task);
            System.out.println(line);
        } else {
            System.out.println("Task list is full!");
        }
    }

    private static void listTasks() {
        if (taskCount == 0) {
            System.out.println(line);
            System.out.println("No tasks added yet.");
            System.out.println(line);
        } else {
            System.out.println(line);
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
            System.out.println(line);
        }
    }
}
