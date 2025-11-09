package exercise2;

public interface ContactFactory {
    Address createAddress(String street, String number, String floor, String door, String postalCoda, String city);
    PhoneNumber createPhoneNumber(String phoneNumber);
}
