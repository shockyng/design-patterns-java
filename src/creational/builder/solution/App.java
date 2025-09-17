package creational.builder.solution;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person.Builder().id(1L).build();
        Person person2 = new Person.Builder().isActive(false).email("example1@mail.com").build();
        Person person3 = new Person.Builder()
                .id(3L).name("John")
                .isActive(false)
                .email("example1@mail.com")
                .phone("123456789")
                .build();
    }
}
