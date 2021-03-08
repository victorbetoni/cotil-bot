package net.victorbetoni.cotilbot;

import net.victorbetoni.cotilbot.util.sql.Providers;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class BotInitializer {

    public static void main(String[] args) throws IOException {
        /*Providers.PROVIDE_STAFF_INSERTS.accept("src/main/resources/sql/inserts/professores.sql");
        try (Reader reader = new InputStreamReader(BotInitializer.class.getResourceAsStream("/bot.json"))) {
            CotilBOT bot = new CotilBOT();
            JSONParser parser = new JSONParser();
            Properties credentials = new Properties();
            credentials.load(BotInitializer.class.getResourceAsStream("/private/credentials.properties"));
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            bot.setup(jsonObject, credentials.getProperty("token"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
