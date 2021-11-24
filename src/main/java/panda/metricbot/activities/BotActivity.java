package panda.metricbot.activities;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import panda.metricbot.exceptions.InvalidTokenException;

import javax.security.auth.login.LoginException;

/**
 * BotActivity for the Bot application.
 */
public class BotActivity {

    private JDA instance;

    /**
     * Single constructor for building the bot application.
     * @param token
     */
    public BotActivity(String token) {
        try {
            instance = loginBot(token);
        } catch (LoginException loginException) {
            System.out.println("Failed to login with provided token.");
            throw new InvalidTokenException(
                    String.format("The provided token is invalid.\nToken: %s", token),
                    loginException);
        }
    }

    /**
     * Attempts to login the bot application.
     * @param token - The token for the bot to login with.
     * @throws LoginException
     */
    public JDA loginBot(String token) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault(token);

        // Set activity ("watching Metrics")
        builder.setActivity(Activity.watching("Metrics."));

        return builder.build();
    }
}
