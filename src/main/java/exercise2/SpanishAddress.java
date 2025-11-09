package exercise2;

public class SpanishAddress extends AbstractAddress {


    public SpanishAddress(String street, String number, String floor, String door, String postalCode, String city) {
        super(street, number, floor, door, postalCode, city);
    }

    @Override
    public String getAddress() {
        return street + " " + number + ", " + floor + "-" + door + ", " + postalCode + "(" + city + ")" + " Spain";
    }
}
