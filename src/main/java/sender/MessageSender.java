package sender;

import user.User;
import java.util.Date;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        Date oneHourAgo = new Date(System.currentTimeMillis() - 3600 * 1000);
        if (oneHourAgo.before( user.getDate())) {
            if (user.getCountry().equals(country)) {
                System.out.println("SUCCESS: Message sent");
                return true;
            }
            System.out.println("ERR: User country does not match the sending country");
            return false;
        }
        System.out.println("ERR: User was not active in the past hour");
        return false;
    }
}
