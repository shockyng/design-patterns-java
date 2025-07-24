package creational.abstractfactory;

public class Ship implements Transport {
    @Override
    public void move() {
        System.out.println("Moving with ship...");
    }
}
