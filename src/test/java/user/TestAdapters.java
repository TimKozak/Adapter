package user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestAdapters {    FacebookUser userFb;
    FacebookAdapter facebookAdapter;
    TwitterAdapter twitterAdapter;
    FacebookUser facebookUser;
    TwitterUser twitterUser;


    @BeforeEach
    void setUp() {
        facebookUser = new FacebookUser("tima.kozak@gmail.com", "Ukraine", new Date());
        facebookAdapter = new FacebookAdapter(facebookUser);

        twitterUser = new TwitterUser("dj.flarpzz@gmail.com", "Uganda", new Date());
        twitterAdapter = new TwitterAdapter(twitterUser);
    }

    @Test
    void checkAttributes() {
        assertEquals(facebookUser.getUserCountry(), facebookAdapter.getCountry());
        assertEquals(twitterUser.getUserMail(), twitterAdapter.getEmail());
    }
}
