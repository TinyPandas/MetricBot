package panda.metricbot;

import org.junit.jupiter.api.Test;
import panda.metricbot.exceptions.InvalidTokenException;

import static org.junit.jupiter.api.Assertions.*;

class BotTest {

    @Test
    public void constructor_invalidToken_throwsInvalidTokenException() {
        assertThrows(InvalidTokenException.class, () -> new Bot("invalidToken"));
    }
}