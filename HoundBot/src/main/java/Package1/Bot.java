package Package1;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;
import org.javacord.api.entity.message.MessageFlag;
import org.javacord.api.interaction.SlashCommandInteraction;

public class Bot {

    private DiscordApi api;


    public void initialise(String apiToken) {


        api = new DiscordApiBuilder().setToken(apiToken).setAllIntents().login().join();

        api.addSlashCommandCreateListener(event -> {
            SlashCommandInteraction slashCommandInteraction = event.getSlashCommandInteraction();
            if (slashCommandInteraction.getCommandName().equals("ping")) {
                slashCommandInteraction.createImmediateResponder()
                        .setContent("Pong!")
                        .setFlags(MessageFlag.EPHEMERAL) // Only visible for the user which invoked the command
                        .respond();
            }
        });
        //register commands

    }

    public DiscordApi getApi() {
        return api;
    }
}
