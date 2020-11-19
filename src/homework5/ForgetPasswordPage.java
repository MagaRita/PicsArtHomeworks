package homework5;

public class ForgetPasswordPage extends BasePage {

    private String email;

    public String getEmail() {
        return email;
    }

    //Did not check the email validation
    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        }
    }

    public ForgetPasswordPage(String serverUrl) {
        super(serverUrl, "/restore");
    }
}
