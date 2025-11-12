package level2.app;

import level2.factory.ContactFactory;
import level2.factory.FactoryLoader;

import java.util.Scanner;

public class Menu {
    private Agenda agenda;
    private Scanner scanner;

    public Menu() {
        this.agenda = new Agenda();
        this.scanner = new Scanner(System.in);

    }

    private void printMenu() {
        System.out.println("\n MAIN MENU");
        System.out.println("1. Add contact");
        System.out.println("2. Print agenda");
        System.out.println("3. Exit");
        System.out.print("SSelect an option: ");
    }

    public void executeMenu() {
        int option = 0;
        while (option != 3) {
            printMenu();
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option. Try again");
                continue;
            }

            switch (option) {
                case 1 -> addContactForm();
                case 2 -> agenda.printContacts();
                case 3 -> System.out.println("Closing Agenda");
                default -> System.out.println("Invalid option.");
            }
        }

    }

    private void addContactForm() {
        String name, surname, street, postalCode, city, phoneNumber, country;

        System.out.print("Select the country by typing one fo the following options: ES, FR, US: ");
        country = scanner.nextLine().toUpperCase();
        ContactFactory factory = FactoryLoader.getFactory(country);

        System.out.print("\nIntroduce conact name: ");
        name = scanner.nextLine();
        System.out.print("\nIntroduce surname: ");
        surname = scanner.nextLine();
        System.out.print("\nIntroduce address: ");
        street = scanner.nextLine();
        System.out.print("\nIntroduce postal code: ");
        postalCode = scanner.nextLine();
        System.out.print("\nIntroduce city: ");
        city = scanner.nextLine();
        System.out.println("\nIntroduce phone number: ");
        phoneNumber = scanner.nextLine();
        agenda.addContact(factory, name, surname, street, postalCode, city, phoneNumber);
    }

}
