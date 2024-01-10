public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        //System.out.println("First Name: " + person.getFirstName());
        //System.out.println("Last Name: " + person.getLastName());
        //System.out.println("Age: " + person.getAge());

        Person person1 = new Person("Inanc", "Ciftci", 19, "12.04.1997", "denemeSifre", "inancciftci@windowslive.com");
        //System.out.println("is Person 2 Teen ? : " + person1.isTeen());

        Wall wall = new Wall(5,4);

        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width = " + wall.width);
        System.out.println("height = " + wall.height);
        System.out.println("area = " + wall.getArea());

    }
}