package exercise2;

public abstract class AbstractPhoneNumber implements PhoneNumber{

    protected String phoneNumber;

    public AbstractPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public abstract String getPhoneNumber();
}
