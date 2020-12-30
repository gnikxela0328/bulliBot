package bot;

//import java.util.EventListener;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BulliEars extends ListenerAdapter {
	public static void main (String[] args) throws LoginException, InterruptedException {
		JDA bulliBot = JDABuilder.createDefault(args[0])
			.addEventListeners(new BulliEars())
			.build();

		bulliBot.awaitReady();
	}

	public void onMessageReceived(MessageReceivedEvent event) {
			
		Message msg = event.getMessage();
		if(msg.getContentRaw().equals("!RespondBulli")) {
			MessageChannel channel = event.getChannel();
			channel.sendMessage("Bulli can hear you :0");
		}
	}
	
}
