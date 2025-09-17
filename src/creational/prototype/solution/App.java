package creational.prototype.solution;

import creational.prototype.Colors;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(20, 30, Colors.BLACK);
        Shape rectangle = circle.copy();
    }
}
