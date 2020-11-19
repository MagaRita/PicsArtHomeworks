package homework5;

public class RegistrationPage extends BasePage {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private int year;
    private char gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()){
            this.firstName = firstName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.isEmpty()){
            this.password = password;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.isEmpty()) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.isEmpty()) {
            this.email = email;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1905 && year <= 2002) {
            this.year = year;
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public RegistrationPage(String serverUrl) {
        super(serverUrl, "/signup");
    }

    public boolean registerNewUser(String firstName, String lastName, String phoneNumber, String email,
                           String password, int year, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        setYear(year);
        setGender(gender);
        //TODO
        //User clicks Register button and the appropriate actions are performed.
        //Return true when the registration is successful, otherwise return false.
        return true;
    }

    @Override
    public String url() {
        System.out.print("The Registration page URL is: ");
        return super.url();
    }
}
