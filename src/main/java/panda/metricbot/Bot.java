package panda.metricbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import panda.metricbot.activities.BotActivity;
import panda.metricbot.exceptions.InvalidTokenException;

import javax.security.auth.login.LoginException;

/**
 * Representation of the Bot Application.
 */
public class Bot {

	/**
	 * Entry point for Bot application. Args must start with TOKEN.
	 * @param args - The args provided for the Bot application,
	 *             where the first arg is the bot TOKEN.
	 */
	public static void main(String[] args) {
		new BotActivity(args[0]);
	}
}
