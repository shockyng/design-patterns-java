package structural.bridge.car;

import structural.bridge.engines.Engine;

public abstract class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
