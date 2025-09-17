package creational.prototype.problem;

import creational.prototype.Colors;

public class Rectangle {
    private int positionX;
    private int positionY;
    private Colors color;

    public Rectangle(int positionX, int positionY, Colors color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
