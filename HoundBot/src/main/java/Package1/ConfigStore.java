package Package1;
import java.io.*;
import java.util.Properties;

public class ConfigStore {

    private String minecraftServerPath;

    private String minecraftServerName;
    private String maxMemory;
    private String minMemory;
    private String apiToken;


    public void initialise(){

        String rootPath = System.getProperty("user.dir");
        try (InputStream input = new FileInputStream(rootPath + "\\config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            minecraftServerPath = prop.getProperty("Server.Path");
            minecraftServerName = prop.getProperty("Server.Name");
            maxMemory = prop.getProperty("Memory.Max");
            minMemory = prop.getProperty("Memory.Min");
            apiToken = prop.getProperty("API.Token");

            System.out.println("Server Path : " + minecraftServerPath);
            System.out.println("Server Name : " + minecraftServerName);
            System.out.println("Server Path : " + maxMemory);
            System.out.println("Server Path : " + minMemory);
            System.out.println("Server Path : " + apiToken);

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
    public String getApiToken() {
        return apiToken;
    }

    public String getServerPath() {
        return minecraftServerPath;
    }

    public String getServerName(){
        return minecraftServerName;
    }

    public String getMaxMemory() {
        return maxMemory;
    }

    public String getMinMemory() {
        return minMemory;
    }

}
