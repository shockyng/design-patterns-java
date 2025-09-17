package creational.builder.solution;

public class Person {
    private Long id;
    private String name;
    private boolean isActive;
    private String email;
    private String phone;

    public static class Builder {

        private final Person person;

        public Builder() {
            person = new Person();
        }

        public Person build() {
            return person;
        }

        public Builder id(Long id) {
            this.person.id = id;
            return this; // <--
        }

        public Builder name(String name) {
            this.person.name = name;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.person.isActive = isActive;
            return this;
        }

        public Builder phone(String phone) {
            this.person.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.person.email = email;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
