
public class Person {
    private String firstName;
    private String lastName;
    private String homeAddress;
    private String phoneNumber;
    private String emailAddress;

    @Override
    public String toString() {
        return "First name: " + firstName + " " + "Last name: " + lastName + " " + "Home address: " + homeAddress + " " + "Phone number: "
                 + phoneNumber + " " + "Email address: " + emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
