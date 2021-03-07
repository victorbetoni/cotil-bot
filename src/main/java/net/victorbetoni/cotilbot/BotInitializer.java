package net.victorbetoni.cotilbot;

import net.victorbetoni.cotilbot.util.sql.Providers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class BotInitializer {

    public static void main(String[] args) {
        try (Reader reader = new InputStreamReader(BotInitializer.class.getResourceAsStream("/bot.json"))) {
            CotilBOT bot = new CotilBOT();
            JSONParser parser = new JSONParser();
            Properties credentials = new Properties();
            credentials.load(BotInitializer.class.getResourceAsStream("/private/credentials.properties"));
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            bot.setup(jsonObject, credentials.getProperty("token"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
