package homework6.facebook;

import homework5.BasePage;
import homework6.SocialWebPage;
import homework6.Stories;

public class Facebook extends BasePage implements SocialWebPage, Stories, Games {

    public Facebook(String serverUrl, String pagePath) {
        super(serverUrl, "/home");
    }

    @Override
    public void playGame(String game, int countOfPlayers) {

    }

    @Override
    public void addGameToFavouriteList(String game) {

    }

    @Override
    public String createGame() {
        return null;
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
