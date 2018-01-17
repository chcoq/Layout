package sm.fr.advancedlayoutapp.model;

public class User {
    private String userName = "anonymous";

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
