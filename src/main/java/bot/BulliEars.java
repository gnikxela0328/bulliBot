package bot;

import java.util.EventListener;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;

public class BulliEars implements EventListener {
	public static void main (String[] args) throws LoginException, InterruptedException {
		JDA bulliBot = JDABuilder.createDefault(args[0])
			.addEventListeners(new BulliEars())
			.build();

		bulliBot.awaitReady();
	}

	public void onEvent(GenericEvent event) {
			
		if(event instanceof ReadyEvent) {
			System.out.println("Fuck!!!");
		}
		
	}
	
}
