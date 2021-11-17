package user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Date;

@AllArgsConstructor @Getter
public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;
}
