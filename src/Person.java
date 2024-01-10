public class Person {
    String firstName;
    String lastName;
    int age;
    String birthDay;
    String password;
    String email;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String firstName, String lastName, int age, String birthDay, String password, String email) {
        this(firstName, lastName, age);
        this.birthDay = birthDay;
        this.password = password;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age<19 && this.age>13;
    }
}
