package homework5;

public class BasePage {

    private String serverUrl;
    private String pagePath = "";

    public BasePage(String serverUrl, String pagePath) {
        this.serverUrl = serverUrl;
        this.pagePath = pagePath;
    }

    public String url() {
        return serverUrl + pagePath;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        if(!serverUrl.isEmpty()) {
            this.serverUrl = serverUrl;
        }
    }

    public String getPagePath() {
        return pagePath;
    }
}

