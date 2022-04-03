public class Test {

    public static void main(String[] args) {
        /*
        Person david = new Person("David", "López", 25);
        david.sayHelloPerson();
        System.out.println(david.getName() + " is adult? " + david.isAdult());

        Person alex = new Person("Alex", "Picanyol", 40, false);
        alex.sayHelloPerson();
        System.out.println(alex.getName() + " is adult? " + alex.isAdult());

        hello();
        */

        hello();
        //I dont know the value of the fields of this person david
        Person david = new Person();

        Person alex = new Person("Alex", "Lopez", 25, true, new Car ("Jaguar", 1966));
        //alex.printPerson();

        Car citroen = new Car ("Citroen Picassa", 2010);

        david.setCar(citroen);

        System.out.println("Person: " + david);

        alex.sayHello();

        alex.printName();

        System.out.println("Alex age to drive: " + alex.isAdult());

        System.out.println("David age to drive: " + david.isAdult());

        david.printName();

        hello();

        david.setName("David");
        david.setSurname ("Webb");
        david.setAge(25);
        david.setVegan(true);

        Pet toby = new Pet("Toby");

        david.addPet(toby);
        david.printPerson();

    }

    public static void hello() {
        System.out.println("Hello, I'm a public static method available from anywhere to any class or method.");
    }
}
