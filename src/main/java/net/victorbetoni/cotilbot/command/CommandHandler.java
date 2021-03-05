package net.victorbetoni.cotilbot.command;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.victorbetoni.cotilbot.CotilBOT;
import net.victorbetoni.cotilbot.api.event.CommandPerformedEvent;
import net.victorbetoni.cotilbot.util.CommandContext;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CommandHandler extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String rawMessage = e.getMessage().getContentRaw();
        String prefix = (String) CotilBOT.getInstance().getProperties().get("prefix");
        if(rawMessage.startsWith(prefix)) {
            String rawCommand = rawMessage.replaceAll(prefix, "");
            String command = rawCommand.split(" ")[0];
            List<String> args = new LinkedList<>(Arrays.asList(rawCommand.split(" ")));
            args.remove(0);
            System.out.println(command);
            if(CotilBOT.getInstance().getCommandRegistry().containsKey(command)) {
                CommandContext context = new CommandContext(e.getAuthor(), command, args, e.getChannel());
                CotilBOT.getInstance().getCommandRegistry().get(command).run(context);
            }
        }
    }
}
