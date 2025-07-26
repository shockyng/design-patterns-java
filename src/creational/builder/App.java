package creational.builder;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("John")
                .isActive(true)
                .id(1L)
                //...
                .build();

        System.out.println(person);
    }
}
