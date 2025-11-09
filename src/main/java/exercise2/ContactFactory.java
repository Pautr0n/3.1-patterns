package exercise2;

public interface ContactFactory {
    ContactInfo createAddress(String street, String number, String floor, String door, String postalCoda, String city, String phoneNumber);

}
