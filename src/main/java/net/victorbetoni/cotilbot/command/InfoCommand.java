package net.victorbetoni.cotilbot.command;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.victorbetoni.cotilbot.api.event.CommandPerformedEvent;
import net.victorbetoni.cotilbot.util.CommandContext;

public class InfoCommand implements Command {
    @Override
    public void run(CommandContext context) {
        MessageChannel channel = context.getChannel();
        channel.sendMessage("Eae! Sou um bot feito pelo Jesus!").queue();
    }
}
