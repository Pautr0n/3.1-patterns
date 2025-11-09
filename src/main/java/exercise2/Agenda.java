package exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    private List<ContactInfo> contacts;
    private ContactInfo contact;

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(ContactFactory factory, String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        this.contact = factory.createContactInfo(name, surname, street, postalCode, city, phoneNumber);
        contacts.add(contact);
    }

    public void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Agenda is empty.");
            return;
        }

        contacts.sort(Comparator.comparing(ContactInfo::getSurname));

        System.out.println("Agenda's Contacts:");
        for (ContactInfo contact : contacts) {
            System.out.println("---------------------------------------------------");
            System.out.println(contact.getAddress() + " | " + contact.getPhoneNumber());
        }
    }
}
