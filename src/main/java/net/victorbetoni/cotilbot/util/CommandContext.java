package net.victorbetoni.cotilbot.util;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.GenericEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandContext {
    private User sender;
    private MessageChannel channel;
    private List<String> rawArgs;
    private String command;

    public CommandContext(User sender, String command, List<String> args, MessageChannel channel){
        this.channel = channel;
        this.rawArgs = args;
        this.sender = sender;
        this.command = command;
    }

    public User getSender() {
        return sender;
    }

    public MessageChannel getChannel() {
        return channel;
    }

    public List<String> getRawArgs() {
        return rawArgs;
    }

    public String getCommand() {
        return command;
    }
}
