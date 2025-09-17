package creational.prototype.solution;

import creational.prototype.Colors;

public class Circle extends Shape {

    public Circle(int positionX, int positionY, Colors color) {
        super(positionX, positionY, color);
    }

    @Override
    public Shape copy() {
        // a pattern called deep copy
        return new Circle(positionX, positionY, color);
    }
}
