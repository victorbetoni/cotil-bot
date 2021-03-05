package net.victorbetoni.cotilbot.util;

import net.victorbetoni.cotilbot.CotilBOT;
import net.victorbetoni.cotilbot.command.Command;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class CommandFinder {
    public static Optional<Class<? extends Command>> find(String cmdName) {
        JSONArray cmds = (JSONArray) CotilBOT.getInstance().getProperties().get("commands");
        AtomicReference<Optional<Class<? extends Command>>> foundClass = new AtomicReference<>(Optional.empty());
        cmds.forEach((cmd) -> {
            JSONObject obj = (JSONObject) cmd;
            String name = (String) obj.get("name");
            String clazz = (String) obj.get("className");
            try {
                foundClass.set(Optional.of((Class<? extends Command>)Class.forName("net.victorbetoni.cotilbot.command." + clazz)));
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });
        return foundClass.get();
    }
}
