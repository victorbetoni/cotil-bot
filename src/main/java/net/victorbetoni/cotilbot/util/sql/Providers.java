package net.victorbetoni.cotilbot.util.sql;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Providers {
    public static Consumer<String> PROVIDE_STAFF_INSERTS = (destinyPath) -> {
        File file = new File(destinyPath);
        try {
            if(!file.exists()) {
                file.createNewFile();
            } else {
                new PrintWriter(file).close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8));
                FileReader reader = new FileReader("src/main/resources/jsoup_paths.json")) {

            JSONObject jsonResources = (JSONObject) new JSONParser().parse(reader);
            JSONObject paths = (JSONObject) jsonResources.get("paths");
            JSONArray professores = (JSONArray) paths.get("professores");
            AtomicInteger index = new AtomicInteger(1);
            professores.forEach(obj -> {
                try {
                    String department = (String) ((JSONObject) obj).get("department");
                    String url = (String) ((JSONObject) obj).get("url");
                    String query = (String) ((JSONObject) obj).get("query");
                    Document doc = Jsoup.connect(url).get();
                    doc.body().select(query).forEach(e ->
                        e.getElementsByClass("staff-member-name").forEach(ef -> {
                            try {
                                String staffName = ef.text();
                                int primaryKey = index.getAndIncrement();
                                String line = "INSERT INTO Professor VALUES (" + primaryKey + "," + department + "," + staffName + ");";
                                bw.write(line + "\n");
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
    };

}
