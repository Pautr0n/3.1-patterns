package exercise2;

public class UsFactory implements ContactFactory{
    @Override
    public ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        return new UsContactInfo(name, surname, street, postalCode, city, phoneNumber);
    }
}
