package panda.metricbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import panda.metricbot.exceptions.InvalidTokenException;

import javax.security.auth.login.LoginException;

/**
 * Representation of the Bot Application.
 */
public class Bot {

	/**
	 * Single constructor for building the bot application.
	 * @param token
	 */
	public Bot(String token) {
		try {
			loginBot(token);
		} catch (LoginException loginException) {
			System.out.println("Failed to login with provided token.");
			throw new InvalidTokenException(
					String.format("The provided token is invalid.\nToken: %s", token),
					loginException);
		}
	}

	/**
	 * Entry point for Bot application. Args must start with TOKEN.
	 * @param args - The args provided for the Bot application,
	 *             where the first arg is the bot TOKEN.
	 */
	public static void main(String[] args) {
		new Bot(args[0]);
	}

	/**
	 * Attempts to login the bot application.
	 * @param token - The token for the bot to login with.
	 * @throws LoginException
	 */
	public void loginBot(String token) throws LoginException {
		JDABuilder builder = JDABuilder.createDefault(token);

		// Set activity ("watching Metrics")
		builder.setActivity(Activity.watching("Metrics."));

		builder.build();
	}
}
