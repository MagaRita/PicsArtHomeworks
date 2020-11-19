package homework5;

public class Main {
    public static void main(String[] args) {

        //Used TopTracker and Facebook websites and mixed the features they had and made this project.

        LoginPage loginPage = new LoginPage("https://www.toptal.com/tracker");
        System.out.println(loginPage.url());
        if(loginPage.userAuth("test", "test")){
            System.out.println("The username is: " + loginPage.getUserName());
            System.out.println("The password is: " + loginPage.getPassword());
        }

        System.out.println();

        RegistrationPage registrationPage = new RegistrationPage("https://www.toptal.com/tracker");
        System.out.println(registrationPage.url());
        if(registrationPage.registerNewUser("Anna", "Petrosyan", "4543543",
                "dse@gmail.com", "jhdskfhTYBK", 1990, 'f')){
            System.out.println("The user name is: " + registrationPage.getFirstName() + " " + registrationPage.getLastName());
            System.out.println("The phone number is: " + registrationPage.getPhoneNumber());
            System.out.println("The email is: " + registrationPage.getEmail());
            System.out.println("The password is: " + registrationPage.getPassword());
            System.out.println("The year is: " + registrationPage.getYear());
            System.out.println("The gender is: " + (registrationPage.getGender() == 'm'? "Male":"Female"));
        }

        System.out.println();

        ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage("https://www.toptal.com/tracker");
        System.out.print("The forget password page url is:");
        System.out.println(forgetPasswordPage.url());
        forgetPasswordPage.setEmail("as@gmail.com");
        System.out.println("The email is: " + forgetPasswordPage.getEmail());

        System.out.println();

        CreatePage createPage = new CreatePage("https://www.toptal.com/tracker");
        System.out.print("The page where the user can create a page has the following url:");
        System.out.println(createPage.url());
        createPage.setPageType('b');
        System.out.println("The page will be for " + (createPage.getPageType() == 'b'?"Business ":"Private ")
                + "users.");

    }
}
