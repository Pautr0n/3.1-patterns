package exercise2.factory;

import exercise2.model.ContactInfo;
import exercise2.model.SpanishContactInfo;

public class SpanishFactory implements ContactFactory {

    @Override
    public ContactInfo createContactInfo(String name, String surname, String street, String postalCode, String city, String phoneNumber) {
        return new SpanishContactInfo(name, surname, street, postalCode, city, phoneNumber);
    }
}
