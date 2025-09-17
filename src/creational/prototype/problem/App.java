package creational.prototype.problem;

import creational.prototype.Colors;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(20, 30, Colors.BLACK);
        Rectangle rectangle = new Rectangle(circle.getPositionX(), circle.getPositionX(), circle.getColor());
    }
}
