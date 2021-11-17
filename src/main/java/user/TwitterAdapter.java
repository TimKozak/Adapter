package user;

import lombok.Getter;

import java.util.Date;

@Getter
public class TwitterAdapter implements User {
    private TwitterUser user;

    public TwitterAdapter(TwitterUser user) {
        this.user = user;
    }

    public String getEmail(){
        return user.getUserMail();
    }

    public String getCountry() {
        return user.getCountry();
    }

    public Date getDate() {
        return user.getLastActiveTime();
    }
}
