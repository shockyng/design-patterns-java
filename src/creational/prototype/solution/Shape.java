package creational.prototype.solution;

import creational.prototype.Colors;

public abstract class Shape implements Prototype {
    public int positionX;
    public int positionY;
    public Colors color;

    public Shape(int positionX, int positionY, Colors color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", color=" + color +
                '}';
    }
}
