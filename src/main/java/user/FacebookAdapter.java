package user;

import lombok.Getter;

import java.util.Date;

@Getter
public class FacebookAdapter implements User {
    private FacebookUser user;

    public FacebookAdapter(FacebookUser user) {
        this.user = user;
    }

    public String getEmail(){
        return user.getEmail();
    }

    public String getCountry() {
        return user.getUserCountry();
    }

    public Date getDate() {
        return user.getUserActiveTime();
    }
}
