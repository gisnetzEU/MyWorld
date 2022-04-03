import java.util.ArrayList;

public class Person {

    //Attributes
    private String name;
    private String surname;
    private int age;
    private boolean vegan;
    private Car car;
    private ArrayList<Pet> pets = new ArrayList<>();

    //Constructors
    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, boolean vegan) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;
    }

    public Person(String name, String surname, int age, boolean vegan, Car car) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;
        this.car = car;
    }

    public Person(String name, String surname, int age, boolean vegan, ArrayList<Pet> pets) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;
        this.pets = pets;
    }

    public Person(String name, String surname, int age, boolean vegan, Car car, ArrayList<Pet> pets) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.vegan = vegan;
        this.car = car;
        this.pets = pets;
    }

    //Methods
    public boolean isAdult() {
        return this.getAge() >= 18;
    }

    public void sayHelloPerson() {
        System.out.println("Hello " + this.getName() + " " + this.getSurname());
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void printName() {
        System.out.println("This person 's name is: " + " " + this.name + " " + this.surname);
    }

    public void printPerson() {
        System.out.println(this.getName() + " " + this.getSurname() + " " + this.car.getMake() + " " + this.car.getYear() + " " + this.pets.get(0).getName());
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public boolean getVegan() {
        return this.vegan;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
