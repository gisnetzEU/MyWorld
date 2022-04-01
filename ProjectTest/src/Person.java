public class Person {

    private String name;
    private String surname;
    private int age;
    private Boolean vegan;

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

    public boolean isAdult() {
        return this.getAge() >= 18;
    }

    public void sayHelloPerson() {
         System.out.println("Hello " + this.getName() + " " + this.getSurname());
    }

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

    public boolean getVegan() { return this.vegan; }

}
