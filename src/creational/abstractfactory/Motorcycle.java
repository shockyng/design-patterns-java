package creational.abstractfactory;

public class Motorcycle implements Transport {
    @Override
    public void move() {
        System.out.println( "Moving with motorcycle...");
    }
}
