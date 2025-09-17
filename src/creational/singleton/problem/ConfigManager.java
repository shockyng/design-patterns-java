package creational.singleton.problem;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String, String> config = new HashMap<>();

    public void setConfig(String key, String value) {
        config.put(key, value);
    }

    public String getConfig(String key) {
        return config.get(key);
    }
}
