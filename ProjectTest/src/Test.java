public class Test {

    public static void main(String[] args) {

        Person david = new Person("David", "López", 25);
        david.sayHelloPerson();
        System.out.println(david.getName() + " is adult? " + david.isAdult());

        Person alex = new Person("Alex", "Picanyol", 40, false);
        alex.sayHelloPerson();
        System.out.println(alex.getName() + " is adult? " + alex.isAdult());

        hello();

    }

    public static void hello() {
        System.out.println("Hello, I'm a public static method available from anywhere to any class or method.");
    }
}
