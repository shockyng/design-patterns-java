package creational.builder.problem;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(1L);
        Person person2 = new Person(false, "example1@mail.com");
        Person person3 = new Person(3L, "John", false, "example1@mail.com", "123456789");
    }
}
