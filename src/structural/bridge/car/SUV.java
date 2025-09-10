package structural.bridge.car;

import structural.bridge.engines.Engine;

public class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        engine.start();
        System.out.println("Driving a SUV");
    }
}
