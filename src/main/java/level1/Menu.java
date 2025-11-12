package level1;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final Undo undo;

    public Menu() {
        scanner = new Scanner(System.in);
        undo = Undo.getInstance();
    }

    public void executeMenu() {
        boolean running = true;
        System.out.println("Singleton's commands manager");

        while (running) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a new command");
            System.out.println("2. Remove last command");
            System.out.println("3. Remove command by its position ");
            System.out.println("4. Remove all commands");
            System.out.println("5. Show commands' history");
            System.out.println("6. Quit");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Introduce a command: ");
                    String command = scanner.nextLine();
                    undo.addCommand(command);
                    break;
                case "2":
                    undo.rmLastCommand();
                    break;
                case "3":
                    System.out.print("Introduce command's position: ");
                    String input = scanner.nextLine();
                    try {
                        int pos = Integer.parseInt(input);
                        undo.rmCommandByPos(pos);
                    } catch (NumberFormatException e) {
                        System.err.println("Incorrect value, only integer numbers allowed");
                    }
                    break;
                case "4":
                    undo.rmAllCommands();
                    break;
                case "5":
                    undo.printCommandsHistory();
                    break;
                case "6":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        System.out.println("Program terminated.");
    }

}
