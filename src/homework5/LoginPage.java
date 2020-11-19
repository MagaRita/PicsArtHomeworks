package homework5;

public class LoginPage extends BasePage {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(!userName.isEmpty()){
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!password.isEmpty()) {
            this.password = password;
        }
    }

    /*
    //When the guest access is provided.
    public LoginPage(String serverUrl) {
        super(serverUrl, "/signin");
        userName = "guest";
        password = "guest";
    }
     */

    public LoginPage(String serverUrl) {
        super(serverUrl, "/signin");
    }

    public boolean userAuth(String userName, String password){
        setUserName(userName);
        setPassword(password);
        //TODO
        //The user clicks Login button.
        //If the user authentication was successful - return true.
        //Otherwise return false for displaying error message to user.

        return true;
    }

    @Override
    public String url() {
        System.out.print("The Login page URL is: ");
        return super.url();
    }

}
