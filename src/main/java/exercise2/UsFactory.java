package exercise2;

public class UsFactory implements ContactFactory{
    @Override
    public ContactInfo createContactInfo(String name, String surname, String street, String number, String floor, String door, String postalCode, String city, String phoneNumber) {
        return new UsContactInfo(name, surname, street, number, floor, door, postalCode, city, phoneNumber);
    }
}
