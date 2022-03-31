public class Test {

    public static void main(String[] args) {
        Person david = new Person("David", "López", 25);
        System.out.print(david.name + " is adult? " + david.isAdult());
    }
}
