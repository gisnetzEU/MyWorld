public class Person {

    String name;
    String surname;
    int age;
    Boolean vegan;

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
        return this.age >= 18;
    }

    public void sayHelloPerson() {
         System.out.println("Hello " + this.name + " " + this.surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }
}
