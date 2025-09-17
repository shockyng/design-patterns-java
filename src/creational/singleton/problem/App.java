package creational.singleton.problem;

public class App {
    public static void main(String[] args) {
        ConfigManager config1 = new ConfigManager();
        ConfigManager config2 = new ConfigManager();

        config1.setConfig("theme", "Dark");

        System.out.println("config1 theme: " + config1.getConfig("theme"));
        System.out.println("config2 theme: " + config2.getConfig("theme"));
    }
}
