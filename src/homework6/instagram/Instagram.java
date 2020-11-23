package homework6.instagram;

import homework5.BasePage;
import homework6.SocialWebPage;
import homework6.Stories;

public class Instagram extends BasePage implements SocialWebPage, Stories {

    public Instagram(String serverUrl, String pagePath) {
        super(serverUrl, "/home");
    }

    @Override
    public String[] followList() {
        return new String[0];
    }

    @Override
    public void follow(String user) {

    }

    @Override
    public void like(int photoID) {

    }

    @Override
    public void reportUserAccount(int userID) {

    }

    @Override
    public void chooseStoryOption() {

    }
}
