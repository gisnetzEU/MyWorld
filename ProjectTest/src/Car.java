public class Car {

    //Attributes
    private String make;
    private int year;
    private String plateNumber;

    //Constructors


    public Car() {
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String make, int year, String plateNumber) {
        this.make = make;
        this.year = year;
        this.plateNumber = plateNumber;
    }

    //Methods
    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
