package bot;

public class BulliBot implements EventListener {
	public static void main (String[] args) throws LoginException, InterruptedException {
		JDA bulliBot = JDABuilder.createDefault("NzkzNjcyMzExMTY4OTU4NDk0.X-vq8A.snNga_-6Wn_P-_PxKHGKEVvjiCc")
			.addEventListener(new ReadyListener())
			.build();

		bulliBot.awaitReady();
	}

	@Override
	public void onEvent(GenericEvent event) {
		if (event instanceof ReadyEvent)
			System.out.println("Bulli is Ready");
	}
	
}
