public class Test {

    public static void main(String[] args) {

        Person david = new Person("David", "López", 25);
        david.sayHelloPerson();
        System.out.print(david.name + " is adult? " + david.isAdult());

        Person alex = new Person("Alex", "Picanyol", 40, false);
        alex.sayHelloPerson();
        System.out.print(alex.name + " is adult? " + alex.isAdult());

    }
}
