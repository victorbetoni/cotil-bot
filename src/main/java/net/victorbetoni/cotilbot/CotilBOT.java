package net.victorbetoni.cotilbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.victorbetoni.cotilbot.command.Command;
import net.victorbetoni.cotilbot.command.InfoCommand;
import net.victorbetoni.cotilbot.command.CommandHandler;
import org.json.simple.JSONObject;

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.Map;

public class CotilBOT {
    private Map<String, Command> commandRegistry = new HashMap<>();
    private static CotilBOT instance;
    private JSONObject properties;
    private JDA botInstance;

    public void setup(JSONObject properties, String token) throws LoginException {
        instance = this;
        this.properties = properties;
        this.botInstance = JDABuilder.createDefault(token)
                .setActivity(Activity.playing(properties.get("prefix") + "info"))
                .addEventListeners(new CommandHandler())
                .setStatus(OnlineStatus.ONLINE)
                .build();

        commandRegistry.put("info", new InfoCommand());
    }

    public Map<String, Command> getCommandRegistry() {
        return commandRegistry;
    }

    public JSONObject getProperties() {
        return properties;
    }

    public static CotilBOT getInstance() {
        return instance;
    }

    public JDA getBotInstance() {
        return botInstance;
    }
}