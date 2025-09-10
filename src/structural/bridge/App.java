package structural.bridge;

import structural.bridge.car.Car;
import structural.bridge.car.Hatch;
import structural.bridge.car.SUV;
import structural.bridge.car.Sedan;
import structural.bridge.engines.ElectricEngine;
import structural.bridge.engines.GasolineEngine;
import structural.bridge.engines.HybridEngine;

public class App {
    public static void main(String[] args) {
        Car car1 = new SUV(new ElectricEngine());
        Car car2 = new Sedan(new GasolineEngine());
        Car car3 = new Hatch(new HybridEngine());

        car1.drive();
        car2.drive();
        car3.drive();
    }
}
