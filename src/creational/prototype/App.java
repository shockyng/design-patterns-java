package creational.prototype;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List.of(
                new Circle(20, 30, Colors.BLACK),
                new Rectangle(50, 80, Colors.BLUE)
        ).forEach(s -> {
            Shape copy = s.copy();
            System.out.println(s);
            System.out.println(copy);
            System.out.println(s.equals(copy));
            System.out.println(s == copy);
        });
    }
}
