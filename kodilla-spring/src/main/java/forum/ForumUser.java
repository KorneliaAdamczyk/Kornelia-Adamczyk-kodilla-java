package forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

String userName;

    public ForumUser(String userName) {
        this.userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}
