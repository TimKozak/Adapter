package sender;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import user.FacebookAdapter;
import user.TwitterAdapter;
import user.FacebookUser;
import user.TwitterUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestMessageSender {
    MessageSender sender;
    TwitterAdapter twitterUser;
    FacebookAdapter facebookUser;;

    @BeforeEach
    void setUp() {
        sender = new MessageSender();
        twitterUser = new TwitterAdapter(new TwitterUser("tima.kozak@gmail.com", "Ukraine", new Date()));
        facebookUser = new FacebookAdapter(new FacebookUser("dj.flarpzz@gmail.com", "Ukraine", new Date()));
    }

    @Test
    void testMessageSender() {
        assertTrue(sender.send("Hi, Tima!", twitterUser, "Ukraine"));
        assertFalse(sender.send("Hi, Flarpzz!", facebookUser, "Uganda"));
    }
}
