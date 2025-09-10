package structural.bridge.car;

import structural.bridge.engines.Engine;

public class Hatch extends Car {
    public Hatch(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving a Hatch via");
    }
}
