package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<ContactInfo> contacts;

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(ContactFactory factory, String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        ContactInfo contact = factory.createContactInfo(name, surname, street, number, floor, door, postalCode, city, phoneNumber);
        contacts.add(contact);
    }

    public void printContacts(){
        if (contacts.isEmpty()){
            System.out.println("Agenda is empty.");
            return;
        }
        System.out.println("Agenda's Contacts:");
    }

}
