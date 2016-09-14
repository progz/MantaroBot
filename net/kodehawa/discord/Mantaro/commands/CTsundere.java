package net.kodehawa.discord.Mantaro.commands;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.kodehawa.discord.Mantaro.annotation.ModuleProperties;
import net.kodehawa.discord.Mantaro.main.Command;
import net.kodehawa.discord.Mantaro.utils.StringArrayFile;

public class CTsundere implements Command {

	public static CopyOnWriteArrayList<String> tsunLines = new CopyOnWriteArrayList<String>();
	
	public CTsundere()
	{
		new StringArrayFile("tsunderelines", "mantaro", tsunLines, false);
	}
	
	@Override
	@ModuleProperties(level = "user", name = "tsundere", type = "common", description = "Sends a random tsun phrase.")
	public boolean isAvaliable(String[] argsMain, MessageReceivedEvent evt) {
		return true;
	}

	@Override
	public void botAction(String[] msg, String whole, String beheaded, MessageReceivedEvent evt) {
		Random rd = new Random();
        int tsundereRandomizer = rd.nextInt(tsunLines.size());
		evt.getChannel().sendMessage(tsunLines.get(tsundereRandomizer));
	}
}
