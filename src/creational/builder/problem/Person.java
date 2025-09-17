package creational.builder.problem;

public class Person {
    private Long id;
    private String name;
    private boolean isActive;
    private String email;
    private String phone;

    public Person(Long id) {
        this.id = id;
    }

    public Person(boolean isActive, String email) {
        this.isActive = isActive;
        this.email = email;
    }

    public Person(Long id, String name, boolean isActive, String email, String phone) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.email = email;
        this.phone = phone;
    }

    public Person(String name, boolean isActive, String email, String phone) {
        this.name = name;
        this.isActive = isActive;
        this.email = email;
        this.phone = phone;
    }

    public Person(boolean isActive, String email, String phone) {
        this.isActive = isActive;
        this.email = email;
        this.phone = phone;
    }

    public Person(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public Person(String phone) {
        this.phone = phone;
    }
}
