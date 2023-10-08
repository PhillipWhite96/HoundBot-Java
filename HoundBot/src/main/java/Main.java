
import Package1.ConfigStore;
import Package1.Bot;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Starting HoundBot");
        ConfigStore configStore = new ConfigStore();
        configStore.initialise();
        Bot bot = new Bot();
        bot.initialise(configStore.getApiToken());





        while(true){

            System.out.println("waiting here");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException exception){
                System.out.println("eerrrrrr");
            }
        }
        //Create Discord Api connection

        //Start the minecraft server - keep reference to output?

        


    }
}