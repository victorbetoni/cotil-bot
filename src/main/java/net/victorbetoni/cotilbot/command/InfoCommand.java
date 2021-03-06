package net.victorbetoni.cotilbot.command;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.victorbetoni.cotilbot.util.CommandContext;

import java.awt.*;

public class InfoCommand implements Command {
    @Override
    public void run(CommandContext context) {
        MessageChannel channel = context.getChannel();
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle("Mais sobre mim");
        builder.addBlankField(true);
        builder.setColor(new Color(252, 3, 69));
        builder.addField("Sobre mim",
                "Sou um bot criado pelo Jesus (PD 20-22)," +
                "com o intuito de ajudar qualquer um que estude no COTIL :D", false);
        builder.setFooter("Made with <3 by Victor", "https://avatars.githubusercontent.com/u/40972803?s=460&u=d02b68a378d172f07cccf9f182e73af52a588a76&v=4");
        builder.addField("Minha base de dados",
                "Devido a falta de uma API do COTIL, minha base de dados ainda está em desenvolvimento, " +
                        "portanto, provavelmente não tenho muita utilidade agora, mas prometo que daqui a pouco estarei 0 bala. " +
                        "Meu criador tem planos de criar uma API que será mantida pela comunidade com todos os dados " +
                        "necessários para projetos que utilizem informações públicas do colégio.", false);
        builder.addField("Contribuidores",
                "Esse projeto é, acima de tudo, para aprendizado. Você pode ver o meu código no Github! " +
                        "(https://github.com/localthreader/cotil-bot). Sou feito em JDA (Java). Pull requests e quaisquer " +
                        "tipo de contribuições são muito bem vindas, se sinta a vontade para reportar qualquer bug.", false);
        builder.addField("Redes sociais do meu criador:", "Instagram: @victor.betoni\nTwitter: @vickktor_",false);
        builder.addBlankField(true);
        channel.sendMessage(builder.build()).queue();
    }
}
