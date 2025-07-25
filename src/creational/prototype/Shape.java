package creational.prototype;

public abstract class Shape implements Prototype {
    int positionX;
    int positionY;
    Colors color;

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
