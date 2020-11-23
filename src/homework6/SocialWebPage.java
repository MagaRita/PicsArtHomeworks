package homework6;

public interface SocialWebPage {

    public String[] followList();

    public void follow(String user);

    public void like(int photoID);

    public void reportUserAccount(int userID);

}