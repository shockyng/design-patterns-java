package creational.singleton.solution;

public class App {
    public static void main(String[] args) {
        ConfigManager configManagerInstance1 = ConfigManager.getInstance();
        ConfigManager configManagerInstance2 = ConfigManager.getInstance();
        configManagerInstance1.setConfig("theme", "Dark");
        String theme1 = configManagerInstance1.getConfig("theme");
        String theme2 = configManagerInstance2.getConfig("theme");
        System.out.println(theme1);
        System.out.println(theme2);
        System.out.println(configManagerInstance1.equals(configManagerInstance2));
    }
}
