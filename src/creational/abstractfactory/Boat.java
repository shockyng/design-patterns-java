package creational.abstractfactory;

public class Boat implements Transport {
    @Override
    public void move() {
        System.out.println( "Moving with boat...");
    }
}
