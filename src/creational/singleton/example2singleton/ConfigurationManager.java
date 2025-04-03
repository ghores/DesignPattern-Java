package creational.singleton.example2singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();
        try (InputStream in = getClass().getResourceAsStream("config.properties")) {
            properties.load(in);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getProperties(String key) {
        return properties.getProperty(key);
    }
}
