package homework6.picsart;

import homework5.BasePage;
import homework6.SocialWebPage;

public class PicsArt extends BasePage implements PicsArtUser, SocialWebPage {

    public PicsArt(String serverUrl, String pagePath) {
        super(serverUrl, "/explore");
    }

    @Override
    public void uploadPhoto(int photoID) {

    }

    @Override
    public void choosePaintingTools() {

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
}
