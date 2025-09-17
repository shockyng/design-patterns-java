package creational.prototype.solution;

import creational.prototype.Colors;

public class Rectangle extends Shape {

    public Rectangle(int positionX, int positionY, Colors colors) {
        super(positionX, positionY, colors);
    }

    @Override
    public Shape copy() {
        return new Rectangle(positionX, positionY, color);
    }
}
