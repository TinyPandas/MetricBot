package panda.metricbot.activities;

import net.dv8tion.jda.api.JDA;
import org.junit.jupiter.api.Test;
import panda.metricbot.exceptions.InvalidTokenException;

import javax.security.auth.login.LoginException;

import static org.junit.jupiter.api.Assertions.*;

class BotActivityTest {
    @Test
    public void constructor_invalidToken_throwsInvalidTokenException() {
        assertThrows(InvalidTokenException.class, () -> new BotActivity("invalidToken"));
    }

    @Test
    public void activity_loginBot_returnsJDAInstance() throws LoginException {
        String BOT_TOKEN = System.getenv("BOT_TOKEN");

        assertNotNull(BOT_TOKEN);

        JDA builtInstance = new BotActivity(BOT_TOKEN).loginBot(BOT_TOKEN);

        assertNotNull(builtInstance);
    }
}