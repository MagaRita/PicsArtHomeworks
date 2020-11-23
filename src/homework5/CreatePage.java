package homework5;

import homework6.Stories;
import homework6.facebook.Games;

public class CreatePage extends BasePage implements Games, Stories {

    // p means private and b is for business
    private char pageType = 'p';

    public char getPageType() {
        return pageType;
    }

    public void setPageType(char pageType) {
        if(pageType == 'p' || pageType == 'b'){
            this.pageType = pageType;
        }
    }

    public CreatePage(String serverUrl) {
        super(serverUrl, "/pages/create/");
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
    public void chooseStoryOption() {

    }
}
