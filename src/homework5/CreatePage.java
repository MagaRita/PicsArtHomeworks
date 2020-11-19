package homework5;

public class CreatePage extends BasePage{

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

}
