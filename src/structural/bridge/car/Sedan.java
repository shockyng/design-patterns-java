package structural.bridge.car;

import structural.bridge.engines.Engine;

public class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving a Sedan");
    }
}
