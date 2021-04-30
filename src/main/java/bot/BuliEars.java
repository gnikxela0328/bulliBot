package bot;

//import java.util.EventListener;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.RestAction;

public class BuliEars extends ListenerAdapter {
	public static void main (String[] args) throws LoginException, InterruptedException {
		JDA buliBot = JDABuilder.createDefault(args[0])
			.addEventListeners(new BulliEars())
			.build();

		buliBot.awaitReady();
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
			
		Message msg = event.getMessage();
		if(msg.getContentRaw().equals("!RespondBuli")) {
			MessageChannel channel = event.getChannel();
			RestAction<Message> action = channel.sendMessage("Buli can hear you :0");
			action.queue(); 	//This is necessary for executing any REST actions
		}
	}
	
}
