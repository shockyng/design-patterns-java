package creational.singleton;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private final static Map<String, String> config = Collections.synchronizedMap(new HashMap<>());

    // read initialization of static members
    private static class Holder {
        private static ConfigManager INSTANCE = new ConfigManager();
    }

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        return Holder.INSTANCE;
    }

    public void setConfig(String name, String value) {
        config.put(name, value);
    }

    public String getConfig(String name) {
        return config.get(name);
    }
}
