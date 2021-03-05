package net.victorbetoni.cotilbot.api.event;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.victorbetoni.cotilbot.CotilBOT;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CommandPerformedEvent implements GenericEvent {

    private String command;
    private List<String> args;
    private User sender;

    public CommandPerformedEvent(User sender, String command, List<String> args) {
        this.command = command;
        this.sender = sender;
        this.args = args;
    }

    public String getCommand() {
        return command;
    }

    public List<String> getArguments() {
        return args;
    }

    public User getSender() {
        return sender;
    }

    @NotNull
    @Override
    public JDA getJDA() {
        return CotilBOT.getInstance().getBotInstance();
    }

    @Override
    public long getResponseNumber() {
        return 0;
    }
}
