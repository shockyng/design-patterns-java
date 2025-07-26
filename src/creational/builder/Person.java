package creational.builder;

public class Person {
    private Long id;
    private String name;
    private boolean isActive;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String website;
    private String companyName;
    private String jobTitle;
    private String department;

    // instead of having a lot of constructors
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
            return this;
        }

        public Builder name(String name) {
            this.person.name = name;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.person.isActive = isActive;
            return this;
        }

        // and so on
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", website='" + website + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
