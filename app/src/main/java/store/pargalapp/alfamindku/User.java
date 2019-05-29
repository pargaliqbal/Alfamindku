package store.pargalapp.alfamindku;

/**
 * Created by pargal on 5/29/2019.
 */

public class User {
    public String id;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

}